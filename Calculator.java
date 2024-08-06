package JavaProgs;
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Method to add three double values
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(1, 2));             // Output: 3
        System.out.println(calc.add(1, 2, 3));          // Output: 6
        System.out.println(calc.add(1.5, 2.5));         // Output: 4.0
        System.out.println(calc.add(1.2f, 3.4f));       // Output: 4.6
        System.out.println(calc.add(1.1, 2.2, 3.3));    // Output: 6.6
        System.out.println(calc.add(3, 4.5));           // Output: 7.5
        System.out.println(calc.add(2.5, 5));           // Output: 7.5
    }
}

