package JavaProgs.DSA_Scratch.functiions;
import java.io.*;
public class span {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array");
        int size=Integer.parseInt(in.readLine());
        int arr[]=new int[size];
        System.out.println("enter elements in array");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(in.readLine());
        }
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max Number is "+max);

        int min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min Number is "+min);

        System.out.println("Span of no. is "+(max-min));

    }
}
