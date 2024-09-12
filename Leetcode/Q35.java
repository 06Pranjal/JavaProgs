package JavaProgs.Leetcode;

class Q35{
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                c=i;
            else if(nums[i]<=target)
                c=i+1;
        }
        return c;
    }
    public static void main(String args[]){
        Q35 ob =new Q35();
        int num[]={1,3,5,6};
        System.out.println(ob.searchInsert(num,7));
    }
}
