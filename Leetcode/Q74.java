package JavaProgs.Leetcode;

class Q74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;

    }
    public static void main(String args[]){
        Q74 ob=new Q74();
        int a[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(ob.searchMatrix(a,3));
    }
}
