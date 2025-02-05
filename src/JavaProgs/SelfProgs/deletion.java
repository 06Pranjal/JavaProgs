//Write a program for deleting the Kth element from a linear array.
package JavaProgs.SelfProgs;
import java.io.*;
public class deletion
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int arr[],size,pos,index,arr2[];
        System.out.println("Enter the size of array");
        size=Integer.parseInt(in.readLine());
        arr=new int[size];
        System.out.println("Enter the elements");
        arr2=new int[size-1];
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the position of element to be deleted");
        pos=Integer.parseInt(in.readLine());
        index=pos-1;
        for(int i=0;i<index;i++)
        {
            arr2[i]=arr[i];
        }
        for(int i=index;i<size-1;i++)
        {
            arr2[i]=arr[i+1];
        }

//printing the array
        System.out.println("Array after deletion:-");
        for(int i=0;i<size-1;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}


