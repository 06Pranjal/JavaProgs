package JavaProgs.Leetcode;

class Q283 {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }



        }
        for(int i=c;i<nums.length;i++){
            nums[i]=0;
        }

        //just to avoid time in execution printing can be commented


        for(int i=0;i<nums.length;i++){
          System.out.print(nums[i]+" ");
        }

    }
    public static void main(String args[]){
        Q283 ob=new Q283();
        ob.moveZeroes(new int[]{0,1,0,3,12});
    }
}