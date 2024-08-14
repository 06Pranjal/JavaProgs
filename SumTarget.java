//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
package JavaProgs;
import java.io.*;
class SumTarget
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[],target,size,c=0;
        System.out.println("Enter the size of array");
        size = Integer.parseInt(in.readLine());
        a=new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++)
        {
            a[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the target");
        target = Integer.parseInt(in.readLine());
        for (int i = 0; i < size; i++)
        {
            for (int j=i+1;j<size;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println("The Numbers are:"+a[i]+" "+a[j]);
                    c++;

                }

            }
            if(c==1)
                break;

        }

    }
}
