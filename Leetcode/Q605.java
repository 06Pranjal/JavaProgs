package JavaProgs.Leetcode;

class Q605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        int l=flowerbed.length;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0)&&(i==l-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                c++;
                if(c>=n){
                    return true;
                }
            }
        }
        return c>=n;

    }
    public static void main(String args[]){
        Q605 ob=new Q605();
        int arr[]={1,0,0,0,1};
        System.out.println(ob.canPlaceFlowers(arr,1));
    }
}
