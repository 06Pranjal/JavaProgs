package JavaProgs.DSA_Scratch.functiions;

public class rotateArray {
    void rotate(int a[],int k){
        int n=a.length;
        int temp[]=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+"   ");
        }

    }

    public static void main(String[] args) {
        rotateArray ob =new rotateArray();
        ob.rotate(new int[]{1,2,3,4,5,6},3);
    }
}
