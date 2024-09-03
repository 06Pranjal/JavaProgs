package JavaProgs.SelfProgs;

import java.io.*;

class Sparse {
    int[][] sparseMatrix;
    int rows, cols;

    public Sparse(int[][] matrix) {
        rows = matrix.length;
        cols = matrix[0].length;
        sparseMatrix = convertToSparseMatrix(matrix);
    }

    public int[][] convertToSparseMatrix(int[][] matrix) {
        int nonZeroCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        int[][] sparseMatrix = new int[nonZeroCount][3];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    sparseMatrix[k][0] = i;
                    sparseMatrix[k][1] = j;
                    sparseMatrix[k][2] = matrix[i][j];
                    k++;
                }
            }
        }

        return sparseMatrix;
    }

    public void display() {
        System.out.println("Sparse Matrix Representation (Array):");
        for (int i = 0; i < sparseMatrix.length; i++) {
            System.out.println(sparseMatrix[i][0] + " " + sparseMatrix[i][1] + " " + sparseMatrix[i][2]);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = Integer.parseInt(reader.readLine());

        System.out.print("Enter the number of columns in the matrix: ");
        int cols = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            String[] inputLine = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(inputLine[j]);
            }
        }

        Sparse sparseMatrix = new Sparse(matrix);
        sparseMatrix.display();
    }}

