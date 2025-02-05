package JavaProgs.Leetcode;

class Q27 {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }


        }
        return c;
    }
    public static void main(String args[])
    {
        Q27 ob =new Q27();
        System.out.println(ob.removeElement(new int[]{3,2,2,3},3));
    }
}
