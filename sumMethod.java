package JavaProgs;

public class sumMethod {
    int sum(int num1,int num2){
        int sum3=num1+num2;
        return sum3;
    }
    public static void main(String args[])
    {
        sumMethod ob=new sumMethod();
        System.out.println("The sum is: " +ob.sum(4,5));

    }
}
