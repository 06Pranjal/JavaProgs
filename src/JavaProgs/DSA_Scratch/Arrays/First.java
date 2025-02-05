package JavaProgs.DSA_Scratch.Arrays;
import java.io.*;
public class First {
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size of array");
        int n=Integer.parseInt(in.readLine());
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("The arrays is :-");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
