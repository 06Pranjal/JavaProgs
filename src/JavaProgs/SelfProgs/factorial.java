package JavaProgs.SelfProgs;

public class factorial {
    int value=1;
    int fact(int n){
        while(n!=0){
            value=value*n;
            fact(n-1);
        }
        return value;
    }

    public static void main(String args[]){
        factorial ob=new factorial();
        System.out.println("Factorial of given number is "+ob.fact(3));
    }
}

