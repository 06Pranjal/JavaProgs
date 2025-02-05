package JavaProgs.DSA_Scratch.Arrays;
import java.io.*;
public class first {
    public static void main(String[] args)throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int size=Integer.parseInt(in.readLine());
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("the array is");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
