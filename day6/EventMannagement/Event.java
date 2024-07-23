
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Event {
    private int id;
    private String name;
    private String date;
    private String type;
    private List<String> attendees;

    public Event(int id, String name, String date, String type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.attendees = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        attendees.remove(attendee);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event ID: " + id + ", Name: " + name + ", Date: " + date + ", Type: " + type + ", Attendees: " + attendees;
    }
}

class EventManagementSystem {
    private HashMap<Integer, Event> events;
    private int eventIdCounter;

    public EventManagementSystem() {
        events = new HashMap<>();
        eventIdCounter = 1;
    }

    public void createEvent(String name, String date, String type) {
        Event event = new Event(eventIdCounter++, name, date, type);
        events.put(event.getId(), event);
        System.out.println("Event created: " + event);
    }

    public void updateEvent(int id, String name, String date, String type) {
        Event event = events.get(id);
        if (event != null) {
            event.setName(name);
            event.setDate(date);
            event.setType(type);
            System.out.println("Event updated: " + event);
        } else {
            System.out.println("Event not found!");
        }
    }

    public void deleteEvent(int id) {
        Event event = events.remove(id);
        if (event != null) {
            System.out.println("Event deleted: " + event);
        } else {
            System.out.println("Event not found!");
        }
    }

    public void registerForEvent(int id, String attendee) {
        Event event = events.get(id);
        if (event != null) {
            event.addAttendee(attendee);
            System.out.println("Registration successful: " + event);
        } else {
            System.out.println("Event not found!");
        }
    }

    public void cancelRegistration(int id, String attendee) {
        Event event = events.get(id);
        if (event != null) {
            event.removeAttendee(attendee);
            System.out.println("Cancellation successful: " + event);
        } else {
            System.out.println("Event not found!");
        }
    }

    public void viewEventDetails(int id) {
        Event event = events.get(id);
        if (event != null) {
            System.out.println(event);
        } else {
            System.out.println("Event not found!");
        }
    }

    public void listEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found!");
        } else {
            for (Event event : events.values()) {
                System.out.println(event);
            }
        }
    }

    public void sendReminders() {
        for (Event event : events.values()) {
            System.out.println("Reminder: Event " + event.getName() + " is on " + event.getDate());
        }
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static EventManagementSystem eventSystem = new EventManagementSystem();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createEvent();
                    break;
                case 2:
                    updateEvent();
                    break;
                case 3:
                    deleteEvent();
                    break;
                case 4:
                    registerForEvent();
                    break;
                case 5:
                    cancelRegistration();
                    break;
                case 6:
                    viewEventDetails();
                    break;
                case 7:
                    listEvents();
                    break;
                case 8:
                    sendReminders();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nEvent Management System");
        System.out.println("1. Create Event");
        System.out.println("2. Update Event");
        System.out.println("3. Delete Event");
        System.out.println("4. Register for Event");
        System.out.println("5. Cancel Registration");
        System.out.println("6. View Event Details");
        System.out.println("7. List All Events");
        System.out.println("8. Send Reminders");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createEvent() {
        System.out.print("Enter event name: ");
        String name = scanner.nextLine();
        System.out.print("Enter event date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter event type: ");
        String type = scanner.nextLine();
        eventSystem.createEvent(name, date, type);
    }

    private static void updateEvent() {
        System.out.print("Enter event ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new event name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new event date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter new event type: ");
        String type = scanner.nextLine();
        eventSystem.updateEvent(id, name, date, type);
    }

    private static void deleteEvent() {
        System.out.print("Enter event ID to delete: ");
        int id = scanner.nextInt();
        eventSystem.deleteEvent(id);
    }

    private static void registerForEvent() {
        System.out.print("Enter event ID to register: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        eventSystem.registerForEvent(id, name);
    }

    private static void cancelRegistration() {
        System.out.print("Enter event ID to cancel registration: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        eventSystem.cancelRegistration(id, name);
    }

    private static void viewEventDetails() {
        System.out.print("Enter event ID to view details: ");
        int id = scanner.nextInt();
        eventSystem.viewEventDetails(id);
    }

    private static void listEvents() {
        eventSystem.listEvents();
    }

    private static void sendReminders() {
        eventSystem.sendReminders();
    }
}


