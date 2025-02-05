import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calcTest{

    // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main method using BufferedReader and switch case
    public static void main(String[] args) throws IOException {
        // Create an object of the Calculator class
        calcTest calc = new calcTest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean running = true;

        while (running) {
            // Display the menu
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            // Read the user's choice
            int choice;
            try {
                choice = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            // Handle user's choice
            switch (choice) {
                case 1: // Addition
                    System.out.println("Enter two numbers to add:");
                    int addNum1 = Integer.parseInt(br.readLine());
                    int addNum2 = Integer.parseInt(br.readLine());
                    System.out.println("Result: " + calc.add(addNum1, addNum2));
                    break;

                case 2: // Subtraction
                    System.out.println("Enter two numbers to subtract:");
                    int subNum1 = Integer.parseInt(br.readLine());
                    int subNum2 = Integer.parseInt(br.readLine());
                    System.out.println("Result: " + calc.subtract(subNum1, subNum2));
                    break;

                case 3: // Multiplication
                    System.out.println("Enter two numbers to multiply:");
                    int mulNum1 = Integer.parseInt(br.readLine());
                    int mulNum2 = Integer.parseInt(br.readLine());
                    System.out.println("Result: " + calc.multiply(mulNum1, mulNum2));
                    break;

                case 4: // Division
                    System.out.println("Enter two numbers to divide:");
                    int divNum1 = Integer.parseInt(br.readLine());
                    int divNum2 = Integer.parseInt(br.readLine());
                    try {
                        System.out.println("Result: " + calc.divide(divNum1, divNum2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the calculator.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
        }

        // Close the BufferedReader
        br.close();
    }
}
