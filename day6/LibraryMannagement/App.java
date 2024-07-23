import java.util.ArrayList;
import java.util.Scanner;
public class App {
    ArrayList<Book> bookList = new ArrayList<Book>();
    public   void AppStart(){

        System.out.println("App start");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select option");
        System.out.println(" 1 Admin");
        System.out.println(" 2 Users");

        int option = scanner.nextInt();

        switch (option){
            case 1 :
                System.out.println(" option 1");
                Admin.adminOption();
                break;
            case 2 :
                System.out.println("option 2");
                break;
            default:
                System.out.println("select any one option");
        }
    }
}
