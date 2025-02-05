package JavaProgs.Leetcode;
import java.lang.*;

public class Q5 {
    public String longestPalindrome(String s) {
        String c="";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String a=s.substring(i,j);
                StringBuilder b = new StringBuilder(a);
                if(b.reverse().toString().equals(a)&& a.length() > c.length())
                {
                    c=a;
                }
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Q5 ob =new Q5();
        System.out.println(ob.longestPalindrome("babad"));
    }
}
