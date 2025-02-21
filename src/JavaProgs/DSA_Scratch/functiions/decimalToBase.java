package JavaProgs.DSA_Scratch.functiions;

public class decimalToBase {
    static String convert(int a ,int b){
        String num=" ";
        String digits="0123456789ABCDEF";
        while(a>0){
            int rem=a%b;
            num=digits.charAt(rem)+num;
            a=a/b;
        }
        return num;
    }

    public static void main(String[] args) {
        decimalToBase ob=new decimalToBase();
        System.out.println(ob.convert(31,2));
    }
}
