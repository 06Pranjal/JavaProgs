//Write a program to copy the contents of array A in array B in reverse order. Also find sum of array A and array B and store the sum in array C.
package JavaProgs;
import java.io.*;
public class reverseArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[], b[], c[], size;
        System.out.println("Enter the size of array");
        size = Integer.parseInt(in.readLine());
        a = new int[size];
        b = new int[size];
        c = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < size; i++)
        {
            b[size-i-1] = a[i];
        }
        System.out.println("Array a :-");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array b which is in reverse order :-");
        for (int i = 0; i < size; i++)
        {
            System.out.print(b[i]+" ");
        }

        System.out.println();
        System.out.println("Sum of array a and b elements are ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(b[i]+a[i]+" ");
        }
    }
}
