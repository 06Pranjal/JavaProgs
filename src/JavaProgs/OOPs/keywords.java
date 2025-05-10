package JavaProgs.OOPs;
public class keywords {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("denied");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}