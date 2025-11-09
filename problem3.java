import java.util.NoSuchElementException;
import java.util.Scanner;

public class problem3 {
    // Creating a Scanner object for user input
    static Scanner scanner = new Scanner(System.in);

    // Function to display the menu of months
    static void displayMenu()
    {
        System.out.println(
            "Enter the number corresponding to a month: ");
        System.out.println("1. January");
        System.out.println("2. February");
        System.out.println("3. March");
        System.out.println("4. April");
        System.out.println("5. May");
        System.out.println("6. June");
        System.out.println("7. July");
        System.out.println("8. August");
        System.out.println("9. September");
        System.out.println("10. October");
        System.out.println("11. November");
        System.out.println("12. December");
    }

    // Function to get the month input from the user
    static void getMonth()
    {
        try {
            System.out.print("Enter the month number: ");
            int monthNumber = scanner.nextInt();

            // Checking the month number and displaying the
            // corresponding month
            switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println(
                    "Invalid month number. Please enter a number between 1 and 12.");
            }

            // Asking the user if they want to continue or
            // exit the program
            System.out.print(
                "Enter Y to continue or any other character to exit: ");
            String choice = scanner.next();

            // If user wants to continue, recursively call
            // the getMonth function
            if (choice.equalsIgnoreCase("Y")) {
                getMonth();
            }
            else {
                // If user chooses to exit, display "Program
                // Terminated" and close the scanner
                System.out.println("Program Terminated");
                scanner.close();
            }
        }
        catch (NoSuchElementException e) {
            System.out.println(
                "No input available. Program terminated.");
        }
    }

    public static void main(String[] args)
    {
        // Display the initial menu
        displayMenu();

        // Start getting the month input from the user
        getMonth();
    }
}