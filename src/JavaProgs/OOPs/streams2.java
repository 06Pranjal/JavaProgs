package JavaProgs.OOPs;

public class streams2 {
    public static void main(String[] args) {

        interface Mathoperation{
            int operate(int a,int b);
        }

        Mathoperation sumoperation =(a,b)->a+b;

        int res=sumoperation.operate(3,4);
        System.out.println(res);


    }
}
