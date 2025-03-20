package JavaProgs.SelfProgs.SpringBoot.ExceptionHandling;
import java.io.*;
public class Prog1 {
    public static void main(String args[]){
        int a=0;
        int b=10;
        try{
            int c=b/a;
            System.out.println("Answer = "+c);
        }
        catch (ArithmeticException e ){
            System.out.println("Error:Cannot divide by 0");
        }
        finally{
            System.out.println("This part is then also executed");
        }
    }
}
