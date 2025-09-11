package JavaProgs.DSA_Scratch;

public class Profit {
    public static int min(int[] arr){
        int minNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minNum){
                minNum=arr[i];
            }
        }
        return minNum;
    }


    public static int max(int[] arr){
        int maxNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int []arr2={7,1,5,3,6,4};
        System.out.println(max(arr2)-min(arr2));
    }
}
