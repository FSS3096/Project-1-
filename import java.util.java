import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Take two numbers from the user
    System.out.print("Enter your first number (a): ");
    double a = scanner.nextDouble();

    System.out.print("Enter your second number (b): ");
    double b = scanner.nextDouble();

    //Show operation choices
    System.out.println("\nChoose operation:");
    System.out.println("1: +(Addition)");
    System.out.println("2: -(Subtraction)");
    System.out.println("3: *(Multiplication)");
    System.out.println("4: /(Division)");
    System.out.println("5: %(Modulus)");
    int choice = scanner.nextInt();

    double result;
    switch (choice) {
        case 1:
        result = a + b;
        System.out.println("Result: " + result);
        break;

        case 2:
        result = a - b;
        System.out.println("Result: " + result);
        break;

        case 3:
        result = a * b;
        System.out.println("Result: " + result);
        break;

        case 4:
        if(b != 0) {
            result = a / b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero!");
        }
        break;

        case 5:
        if (b != 0) {
            result = a % b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Modulus by zero!");
        }
        break;
    default:
            System.out.println("Invalid operation choice.");
         }

        scanner.close();
    }
}    