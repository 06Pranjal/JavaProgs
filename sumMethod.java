package JavaProgs;

public class sumMethod {
    int sum(int num1,int num2){
        return (num1+num2);
    }
    public static void main(String args[])
    {
        sumMethod ob=new sumMethod();
        System.out.println("The sum is: " +ob.sum(4,5));

    }
}
