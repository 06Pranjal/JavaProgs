package JavaProgs;

public class target {
    public Boolean findTarget(int[] arr, int t) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==t){
                    System.out.println("The Numbers are on :"+i+" and "+j);
                    return true;
                }


            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr1[]={2,7,11,15};
        int t1=26;
        target ob=new target();
        System.out.println(ob.findTarget(arr1,t1));
    }
}
