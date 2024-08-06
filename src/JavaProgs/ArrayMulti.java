package JavaProgs;

//declare a 2d array of 2*2 and perform operation like search,traversal,sum of all elements ,insertions of elements at given location,deletion of a row
import java.io.*;
class ArrayMulti
{
    static int num,temp,ch,sum=0;
    static int a[][];
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows");
        int r =Integer.parseInt(in.readLine());
        System.out.println("Enter coloumn");
        int c =Integer.parseInt(in.readLine());
        a=new int[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("Enter 1 for printing the array, 2 for searching,3 for Printing sum of numbers,4 for insertion of elements");
        ch=Integer.parseInt(in.readLine());
        switch(ch) {
            case 1:
                //printing the array
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                //searching the element
                System.out.println("Enter num to be searched");
                num = Integer.parseInt(in.readLine());
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (a[i][j] == num)
                            System.out.println("Number is found at position number" + i + "," + j + " index");
                        else if (a[i][j] != num)
                            System.out.println("Number is not found");
                    }

                }
                break;
            case 3:
                //sum of all elements
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        sum = sum + a[i][j];
                    }
                }
                System.out.println("Sum of all the elements are:" + sum);
                break;
            case 4:
                // Insertion of element
                System.out.println("Enter the row index (0 or 1) to insert an element:");
                int row = Integer.parseInt(in.readLine());
                System.out.println("Enter the column index (0 or 1) to insert an element:");
                int col = Integer.parseInt(in.readLine());
                System.out.println("Enter the element to be inserted:");
                int element = Integer.parseInt(in.readLine());

                //print the array
                if (row >= 0 && row < r && col >= 0 && col < c) {
                    a[row][col] = element;
                } else {
                    System.out.println("Invalid row or column index!");
                }

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        }



}




