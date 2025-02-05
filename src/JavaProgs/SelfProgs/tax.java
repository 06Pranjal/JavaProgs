package JavaProgs.SelfProgs;

import java.util.Scanner;
class tax
{
    public static void main(String args[])
    {
        byte a;
        int amt;
        double tax=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 0 for Male and 1 for Female");
        a=Sc.nextByte();
        System.out.println("enter the income:");
        amt=Sc.nextInt();
        if(a==0)
        {
            if(amt>=0 && amt<=180000)
                tax=0;
            else if(amt>=180001 && amt<=500000)
                tax=amt*0.1;
            else if(amt>=500001 && amt<=800000)
                tax=amt*0.2;
            else
                tax=amt*0.3;
        }
        else if(a==1)
        {
            if(amt>=0 && amt<=190000)
                tax=0;
            else if(amt>=190001 && amt<=500000)
                tax=amt*0.1;
            else if(amt>=500001 && amt<=800000)
                tax=amt*0.2;
            else
                tax=amt*0.3;
        }
        System.out.println("Tax="+tax);
    }
}