package JavaProgs.Leetcode;

class Q566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rl=mat.length;
        int cl=mat[0].length;
        if(rl*cl!=r*c){
            return mat;
        }


        int arr[][]=new int[r][c];

        for (int i = 0; i < rl * cl; i++) {
            arr[i / c][i % c] = mat[i / cl][i % cl];
        }

        return arr;
    }

    public static void main(String args[]){
        Q566 ob=new Q566();
        int a[][]={{1,2},{3,4}};
        System.out.println(ob.matrixReshape(a,1,4));
    }

}

