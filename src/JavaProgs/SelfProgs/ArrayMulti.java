package JavaProgs.SelfProgs;
//declare a 2d array of 4*4 and perform operation like search,traversal,sum of all elements ,insertions of elements at given location,deletion of a row
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
        System.out.println("Enter 1 for searching, 2 for printing the array,3 for Printing sum of numbers,4 for insertion of elements,5 for deletion of row");
        ch=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
                System.out.println("Your entered choice is "+ch);
                //searching the element
                System.out.println("Enter num to be searched");
                num = Integer.parseInt(in.readLine());
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (a[i][j] == num)
                            System.out.println("Number is found at position number (" + i + "," + j + ") index");

                    }

                }
                break;

            case 2:
                System.out.println("Your entered choice is "+ch);
                //printing the array
                System.out.println("The array is as follows");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Your entered choice is "+ch);
                //sum of all elements
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        sum = sum + a[i][j];
                    }
                }
                System.out.println("Sum of all the elements are:" + sum);
                break;
            case 4:
                System.out.println("Your entered choice is "+ch);
                // Insertion of element
                System.out.println("Enter the row index  to insert an element:");
                int row = Integer.parseInt(in.readLine());
                System.out.println("Enter the column index to insert an element:");
                int col = Integer.parseInt(in.readLine());
                System.out.println("Enter the element to be inserted:");
                int element = Integer.parseInt(in.readLine());

                //print the array
                if (row >= 0 && row < r && col >= 0 && col < c) {
                    a[row][col] = element;
                } else {
                    System.out.println("Invalid row or column index!");
                }
                System.out.println("The array is as follows");

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("Your entered choice is "+ch);
                // Deletion of a row
                System.out.println("Enter the row index to delete:");
                int delRow = Integer.parseInt(in.readLine());
                if (delRow >= 0 && delRow < r) {
                    int[][] newArray = new int[r - 1][c];
                    for (int i = 0, k = 0; i < r; i++) {
                        if (i == delRow) {
                            continue;
                        }
                        for (int j = 0; j < c; j++) {
                            newArray[k][j] = a[i][j];
                        }
                        k++;
                    }
                    a = newArray;
                    r--;
                    System.out.println("Row deleted successfully.");
                } else {
                    System.out.println("Invalid row index!");
                }
                System.out.println("The new array is as follows");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
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




