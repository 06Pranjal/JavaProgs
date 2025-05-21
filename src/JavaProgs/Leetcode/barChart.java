package JavaProgs.Leetcode;
import java.io.*;
public class barChart {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array");
        int size=Integer.parseInt(in.readLine());
        int arr[]=new int[size];
        System.out.println("enter elements in array");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(in.readLine());
        }
        for(int i=0;i<size;i++){
            for(int j=1;j<=arr[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
