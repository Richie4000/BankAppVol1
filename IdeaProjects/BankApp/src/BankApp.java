import java.io.Console;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "Bankingwithus01";

        System.out.println("Enter Username");
        String getUsername = reader.nextLine();

        System.out.println("Welcome to the banking app " + getUsername);


        System.out.println("Enter Password");
        String getPassword = reader.nextLine();


        if (getPassword.equals(password)) {
            System.out.println("Loading...");
        }
        else {
            System.out.println("Ah ah ah... This is the wrong password.");
        }


    }
}
