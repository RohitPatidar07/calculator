import java.util.Scanner;
/*. Imports and Class Definition
import java.util.Scanner; is used to import the Scanner class, which allows reading inputs from the user.
public class calculator defines a public class named calculator. */

 public class calculator {
    public static void main(String[] args) {
/* Main Method
public static void main(String[] args) is the entry point of any Java application. */
        Scanner scanner = new Scanner(System.in);
/*Setup and User Input
A Scanner object named scanner is created to read inputs from the standard input stream (keyboard).
The program enters an infinite loop (while (true)) that keeps asking the user to choose an operation until the user decides to exit by entering 0. */
        while (true) {
            System.out.println("\nAvailable operations:");
            System.out.println("1 - Addition (+)");
            System.out.println("2 - Subtraction (-)");
            System.out.println("3 - Multiplication (*)");
            System.out.println("4 - Division (/)");
            System.out.println("5 - Exponentiation (^)");
            System.out.println("0 - Quit");
            System.out.print("Choose an operation: ");
            
            int choice = scanner.nextInt();
/*  Display Menu and Capture Choice
The program displays a list of operations (addition, subtraction, multiplication, division, exponentiation, and quit).
It then captures the user's choice using int choice = scanner.nextInt();. */
            if (choice == 0) {
/*  Process Choice
Based on the input choice, the program requests further inputs (two numbers).
A switch statement is used to perform the operation corresponding to the user's choice. It also handles invalid inputs and division by zero. */
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            switch (choice) {
/* Perform Calculations and Display Results
Depending on the user's choice, the appropriate arithmetic operation is performed, and the result is printed to the console.
If division by zero is attempted, an error message is displayed.
After performing the operation, the loop continues, displaying the menu again until the user chooses to quit. */
                case 1:
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    }
                    break;
                case 5:
                    System.out.println("Result: " + Math.pow(firstNumber, secondNumber));
                    break;
                default:
/* Quit and Clean Up */
                    System.out.println("Invalid operation");
            }
        }

        scanner.close();
/* If the user enters 0, the program prints a goodbye message, breaks the loop, and exits.
Finally, scanner.close(); is called to close the scanner and free up resources. */
    }
}



/*
Introduction and Objective
Explain the purpose of the program and its capabilities.
Requirements
Specify the Java version used and any setup requirements.
Installation and Running the Program
Provide step-by-step instructions on how to compile and run the program.
Usage Guide
Detailed explanations of each feature and how to use them with examples.
Error Handling
Describe how the program handles errors like division by zero.
*/