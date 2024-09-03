package JavaProgs.SelfProgs;
import java.util.Arrays;

class concat {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int arr[]=new int[l*2];
        for(int i=0;i<l;i++)
        {
            arr[i]=nums[i];
            arr[i+l]=nums[i];
        }

        return arr;
    }
    public static void main(String args[])
    {
        concat ob=new concat();
        int result[]=ob.getConcatenation(new int[]{1,2,1});
        System.out.println("the array is "+ Arrays.toString(result));
    }


}

