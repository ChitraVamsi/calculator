

import java.util.Scanner;

/**
 * CLI Calculator - Supports Add, Subtract, Multiply, Divide.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("=============================");
        System.out.println("     Java CLI Calculator     ");
        System.out.println("=============================");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("  1. Add");
            System.out.println("  2. Subtract");
            System.out.println("  3. Multiply");
            System.out.println("  4. Divide");
            System.out.println("  5. Exit");
            System.out.print("\nEnter choice (1-5): ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("5")) {
                System.out.println("\nGoodbye!");
                break;
            }

            if (!choice.matches("[1-4]")) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue;
            }

            double num1, num2;

            try {
                System.out.print("Enter first number  : ");
                num1 = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Enter second number : ");
                num2 = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            try {
                double result;
                String operation;

                switch (choice) {
                    case "1":
                        result = calc.add(num1, num2);
                        operation = "+";
                        break;
                    case "2":
                        result = calc.subtract(num1, num2);
                        operation = "-";
                        break;
                    case "3":
                        result = calc.multiply(num1, num2);
                        operation = "*";
                        break;
                    case "4":
                        result = calc.divide(num1, num2);
                        operation = "/";
                        break;
                    default:
                        continue;
                }

                // Format result: show integer if whole number, else decimal
                String formatted = (result == Math.floor(result) && !Double.isInfinite(result))
                        ? String.valueOf((long) result)
                        : String.valueOf(result);

                System.out.println("\n  " + num1 + " " + operation + " " + num2 + " = " + formatted);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}