package JavaProgs.DSA_Scratch.Arrays;

public class reverse {
    void reverseArray( int a[],int size){
        int b[]=new int[size];
        for(int i=size-1;i>=0;i--){
            b[size-1-i]= a[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(b[i]+" ");
        }

    }

    public static void main(String[] args) {
        reverse ob=new reverse();
        ob.reverseArray(new int[]{1,2,3,4,5},5);
    }
}
