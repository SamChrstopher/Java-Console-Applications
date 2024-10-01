package besantJava;

import java.util.Scanner;

public class Calculator {

	// Method to perform addition
    public void add(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
    }

    // Method to perform subtraction
    public void sub(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " = " + (a - b));
    }

    // Method to perform multiplication
    public void multiply(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
    }

    // Method to perform division
    public void division(int a, int b) {
        // Check for division by zero
        if (b == 0) {
            System.out.println("Number can't be divided by zero");
        } else {
            System.out.println("Division of " + a + " and " + b + " = " + (a / b));
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Display menu options
            System.out.println("==========================");
            System.out.println("Choose any Option Below:");
            System.out.println("1 => Addition");
            System.out.println("2 => Subtraction");
            System.out.println("3 => Multiplication");
            System.out.println("4 => Division");
            System.out.println("5 => Exit the Application");
            System.out.println("==========================");
            System.out.print("Enter the Option Here: "); // Changed println to print for better user experience
            int option = sc.nextInt();
            
            // Exit the application if option 5 is selected
            if (option == 5) {
                System.out.println("Thank You For using Our Application");
                sc.close(); // Closing the scanner to avoid resource leaks
                System.exit(0);
            }

            // Prompt the user for two numbers
            System.out.print("Enter Number 1: "); // Changed println to print for better user experience
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2: "); // Changed println to print for better user experience
            int num2 = sc.nextInt();
            
            // Create an instance of the CalculatorProject class
            CalculatorProject cp = new CalculatorProject();
            
            // Perform the selected operation using switch statement
            switch (option) {
                case 1:
                    cp.add(num1, num2);
                    break;
                case 2:
                    cp.sub(num1, num2);
                    break;
                case 3:
                    cp.multiply(num1, num2);
                    break;
                case 4:
                    cp.division(num1, num2);
                    break;
                default:
                    // Handle invalid options
                    System.out.println("Invalid Option. Please try again.");
                    break;
            }
        }
    }
}

