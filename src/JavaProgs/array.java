package JavaProgs;

import java.io.*;
class array
{
    static int a[],n,num,temp,ch,x;
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Limit of the array");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter elements");
        a=new int[n];
        //entering elements
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter 1 for printing the array ,2 for searching the element ,3 for insertion");
        ch=Integer.parseInt(in.readLine());



        switch(ch)
        {
            case 1:
                //printing the array
                System.out.println("The Array is");
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                break;
            case 2:
                //searching the element
                System.out.println("Enter the element to be searched");
                num=Integer.parseInt(in.readLine());
                for(int i=0;i<n;i++)
                {
                    if(a[i]==num)
                    {
                        System.out.println("The number "+num+" which you are searching is present on "+(i+1)+" position");
                    }
                }
                //else
                //System.out.println("The number is not present");
                break;
            case 3:
                //insertion
                System.out.println("Enter how many numbers you have to insert");
                x=Integer.parseInt(in.readLine());
                int b[]=new int[n+x];
                for(int j=0;j<n;j++)
                {
                    b[j]=a[j];
                }
                for(int o=0;o<x;o++)
                {
                    System.out.println("Enter the element to be inserted:");
                    int elementToInsert = Integer.parseInt(in.readLine());
                    System.out.println("Enter the position at which to insert the element (1 to " + (n + 1) + "):");
                    int position = Integer.parseInt(in.readLine());

                    if (position < 1 || position > n + 1)
                    {
                        System.out.println("Invalid position!");
                    }
                    else
                        position--;
                    {
                        for (int i = n; i >= position; i--)
                        {

                            b[i] = b[i - 1];
                        }
                        b[position] = elementToInsert;
                        n++;
                    }

                }
                a=b;

                // Printing the array after insertion
                System.out.println("The array after insertion is:");
                for (int i = 0; i < n; i++)
                {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("invalid Choice");
        }


    }
}