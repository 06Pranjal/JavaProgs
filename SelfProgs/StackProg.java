package JavaProgs.SelfProgs; // This should be the first line

import java.io.*; // Followed by the import statements

public class StackProg {
    public static void main(String args[]) throws IOException {
        int a[], size, n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Input the original size
        System.out.println("Enter the size:");
        size = Integer.parseInt(in.readLine());
        a = new int[size];

        // Accepting the values
        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }

        // Asking user how many elements to push
        System.out.println("Enter how many elements you want to add:");
        n = Integer.parseInt(in.readLine());

        // New array with increased size
        int[] b = new int[size + n];

        // Copying original elements to the new array
        for (int i = 0; i < size; i++) {
            b[i] = a[i];
        }
        System.out.println("Enter the new elements to push onto the stack:");
        for (int i = size; i < size + n; i++) {
            b[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("The stack after adding new elements is:");
        for (int i = 0; i < size + n; i++) {
            System.out.println(b[i]);
        }
    }
}

