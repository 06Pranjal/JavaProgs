import java.io.*;
class practical
{
    static int a[],n,num,temp,ch,x;
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Limit of the array");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter elements");
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
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
        System.out.println("The array after insertion is:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }}