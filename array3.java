public class SparseMatrixDemo {

    static class SparseMatrix {
        private int[][] sparseMatrix;
        private int size;

        public SparseMatrix(int maxSize) {
            sparseMatrix = new int[maxSize][3];
            size = 0;
        }

        public void addElement(int row, int col, int value) {
            if (value != 0) {
                sparseMatrix[size][0] = row;
                sparseMatrix[size][1] = col;
                sparseMatrix[size][2] = value;
                size++;
            }
        }

        public void display() {
            System.out.println("Row\tColumn\tValue");
            for (int i = 0; i < size; i++) {
                System.out.println(sparseMatrix[i][0] + "\t" + sparseMatrix[i][1] + "\t" + sparseMatrix[i][2]);
            }
        }

        public int[][] toDenseMatrix(int rows, int cols) {
            int[][] denseMatrix = new int[rows][cols];
            for (int i = 0; i < size; i++) {
                denseMatrix[sparseMatrix[i][0]][sparseMatrix[i][1]] = sparseMatrix[i][2];
            }
            return denseMatrix;
        }
    }

    public static void main(String[] args) {
        // Assume we know there will be at most 5 non-zero elements
        SparseMatrix sparseMatrix = new SparseMatrix(5);

        // Example: Adding non-zero elements to the sparse matrix
        sparseMatrix.addElement(0, 0, 10);
        sparseMatrix.addElement(0, 3, 20);
        sparseMatrix.addElement(1, 1, 30);
        sparseMatrix.addElement(2, 2, 40);
        sparseMatrix.addElement(3, 0, 50);

        // Display the sparse matrix
        sparseMatrix.display();

        // Convert to dense matrix and display
        int[][] denseMatrix = sparseMatrix.toDenseMatrix(4, 4);
        System.out.println("\nDense Matrix:");
        for (int i = 0; i < denseMatrix.length; i++) {
            for (int j = 0; j < denseMatrix[i].length; j++) {
                System.out.print(denseMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
