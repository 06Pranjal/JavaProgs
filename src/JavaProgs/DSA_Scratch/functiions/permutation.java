package JavaProgs.DSA_Scratch.functiions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class permutation {
    static int fact(int a){
        if(a==1||a==0)
            return 1;
    return a*fact(a-1);
    }
    public static void main(String args[])throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter r");
        int r=Integer.parseInt(in.readLine());
        double result=fact(n)/fact(n-r);
        System.out.println("result="+result);
    }
}
