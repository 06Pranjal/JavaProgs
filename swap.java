package JavaProgs;
class swap
{
    public static void main(String args[])
    {
        int a=2,b=3;
        System.out.println("before swapping the numbers are a= "+a+" b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the numbers are a= "+a+" b= "+b);
    }
}