package JavaProgs.DSA_Scratch.functiions;
import java.io.*;
public class digitFrequency {
     static int count(int n,String num){
        int c=0;
        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            if(a==n){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(count(9,"94758679451"));

    }
}
