import java.util.Scanner;
public class Admin {
   static App app = new App();
   static Scanner input = new Scanner(System.in);
    static  void adminOption(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<<<<<<<<<< Select option >>>>>>>>>>>");

        System.out.println(" 1 Add book");
        System.out.println(" 2 Delete book");
        System.out.println(" 3 Update book");

        int option = scanner.nextInt();

        switch (option){
            case 1 :
                addBook();
                break;
            case 2:
                deleteBook();
                break;
            case 3:
                updateBook();
                break;
            default:
                System.out.println("invalid option");
                app.AppStart();
        }

    }
     static void addBook(){
         System.out.println("add book ");


        System.out.println("enter the Book name ");
        String nameIn = input.nextLine();

        System.out.println("enter the book title ");
        String titleIn = input.nextLine();

        System.out.println("enter the Book author ");
        String authorIn = input.nextLine();

        System.out.println("enter the Book gender ");
        String genderIn = input.nextLine();

        app.bookList.add(new Book(nameIn,titleIn,authorIn,genderIn));

         System.out.println(" Book Add successfully ");

         adminOption();
    }
    static void deleteBook(){
        System.out.println("<<<<<<<<<< delete Book >>>>>>>>>>");

        System.out.println(app.bookList);

        System.out.println("Enter the id ");

        int id = input.nextInt();

        app.bookList.remove(id-1);
        System.out.println(" Book Delete  successfully ");

        adminOption();
    }

    static void updateBook(){
         System.out.println(" updateBook ");
    }

}
