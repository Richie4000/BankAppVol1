import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your ID");
        String getID = reader.nextLine();

        System.out.println("Welcome to the banking app " + getID);

        System.out.println("Enter your password");
        String getPassword = reader.nextLine();

        System.out.println("We have three account types, Personal, Business and ISA. Which one would you like to open?");
        String accountType = reader.nextLine();

        if(accountType.equals("Personal")){
            System.out.println("Welcome to your personal account, " + getID);
        } else if(accountType.equals("Business")) {
            System.out.println("Welcome to your business account " + getID);
        } else if(accountType.equals("ISA")) {
            System.out.println(("Welcome to your ISA account " + getID));
        } else {
            System.out.println("You have entered the wrong account type, please try again");
        }
    }
}
