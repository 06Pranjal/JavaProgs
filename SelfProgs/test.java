package JavaProgs.SelfProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    // Division method
    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Factorial method (recursive)
    int fact(int a) {
        if (a == 0) {
            return 1;
        }
        return a * fact(a - 1);
    }

    // Addition method
    int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    int multiply(int a, int b) {
        return a * b;
    }

    // Main method to implement switch-case logic using BufferedReader
    public static void main(String[] args) throws IOException {
        // Create an object of the test class
        test obj = new test();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Menu for the user
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Factorial");

        // User's choice
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: // Addition
                System.out.println("Enter two numbers for addition:");
                int addNum1 = Integer.parseInt(br.readLine());
                int addNum2 = Integer.parseInt(br.readLine());
                System.out.println("Result: " + obj.add(addNum1, addNum2));
                break;

            case 2: // Subtraction
                System.out.println("Enter two numbers for subtraction:");
                int subNum1 = Integer.parseInt(br.readLine());
                int subNum2 = Integer.parseInt(br.readLine());
                System.out.println("Result: " + obj.subtract(subNum1, subNum2));
                break;

            case 3: // Multiplication
                System.out.println("Enter two numbers for multiplication:");
                int mulNum1 = Integer.parseInt(br.readLine());
                int mulNum2 = Integer.parseInt(br.readLine());
                System.out.println("Result: " + obj.multiply(mulNum1, mulNum2));
                break;

            case 4: // Division
                System.out.println("Enter two numbers for division:");
                int divNum1 = Integer.parseInt(br.readLine());
                int divNum2 = Integer.parseInt(br.readLine());
                try {
                    System.out.println("Result: " + obj.divide(divNum1, divNum2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 5: // Factorial
                System.out.println("Enter a number for factorial:");
                int factNum = Integer.parseInt(br.readLine());
                System.out.println("Result: " + obj.fact(factNum));
                break;

            default: // Invalid choice
                System.out.println("Invalid choice! Please select a valid option.");
        }
    }
}
