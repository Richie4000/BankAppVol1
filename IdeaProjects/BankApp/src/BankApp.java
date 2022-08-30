import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        String password = "Bankingwithus01";

        //System.out.println("Enter Username");
        String getUsername = usernameInput();
        String getPassword = passwordInput();


        if (password.equals(getPassword)) {
            System.out.println("You have been validated");
        }
        else {
            System.out.println("Access denied");
        }

    }

    public static String usernameInput(){
        Scanner u = new Scanner(System.in);
        System.out.println("Enter a username");
        String username = u.nextLine();

        while (username.isEmpty()){
            System.out.println("Enter a username");
            username = u.nextLine();
        }

        System.out.println("Welcome to the banking app " + username);

        return username;
    }
    public static String passwordInput(){
        Scanner u = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = u.nextLine();

        while (password.isEmpty()){
            System.out.println("Enter password");
            password = u.nextLine();
        }

        return password;
    }
}
