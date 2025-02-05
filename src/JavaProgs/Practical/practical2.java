//1.data Abstraction
//2.exception handling
//3.calculation of gross dozen and left over eggs
package JavaProgs.Practical;

public class practical2 {
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int gross=n/144;
        int dozen=(n%144)/12;
        int left=(n%144)%12;
        System.out.println("The total number of egggs are :"+n+" which constitutes "+gross+" gross "+dozen+" dozen and "+left+" left");

    }
}
