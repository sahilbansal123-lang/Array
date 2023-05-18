package array2d;

import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int [][] matrix){

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix.length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }

            //2
            for (int row = rowStart+1; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }

            //3
            for (int col = colEnd-1; col >= colStart+1; col--) {
                if (colStart == colEnd){
                    break;
                }
                System.out.print(matrix[rowEnd][col] + " ");
            }

            //4
            for (int row = rowEnd-1; row >= rowStart+1; row--) {
                if (rowStart == rowEnd){
                    break;
                }
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            rowStart++;
            colEnd--;
            rowEnd--;




        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

//      inputs
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
//      output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        spiralMatrix(matrix);
    }
}