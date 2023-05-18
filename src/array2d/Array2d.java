package array2d;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows and cols: ");
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
////      inputs
//        int[][] numbers = new int[rows][cols];
//        System.out.println("Enter the numbers: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
////      output
//        System.out.println("Enter the number you want to find: ");
//        int x = sc.nextInt();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++){
//                if (numbers[i][j] == x){
//                    System.out.println("Your number is at location: " + "(" + i + " " + j+ ")");
//                }
//            }
//        }
//        System.out.println("Number not present in the matrix");


//  -------------------------------------------------------------------------------------------------------------------

//  Q2:   Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int matrix[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//
//        System.out.println("The Spiral Order Matrix is : ");
//        int rowStart = 0;
//        int rowEnd = n - 1;
//        int colStart = 0;
//        int colEnd = m - 1;
//
//
//        //To print spiral order matrix
//        while (rowStart <= rowEnd && colStart <= colEnd) {
//            //1
//            for (int col = colStart; col <= colEnd; col++) {
//                System.out.print(matrix[rowStart][col] + " ");
//            }
//            rowStart++;
//
//
//            //2
//            for (int row = rowStart; row <= rowEnd; row++) {
//                System.out.print(matrix[row][colEnd] + " ");
//            }
//            colEnd--;
//
//
//            //3
//            for (int col = colEnd; col >= colStart; col--) {
//                System.out.print(matrix[rowEnd][col] + " ");
//            }
//            rowEnd--;
//
//
//            //4
//            for (int row = rowEnd; row >= rowStart; row--) {
//                System.out.print(matrix[row][colStart] + " ");
//            }
//            colStart++;
//
//
//            System.out.println();
//        }

//    ------------------------------------------------------------------------------------------------------------------

//  Q3:   For a given matrix of N x M, print its transpose.


                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();


                int matrix[][] = new int[n][m];
                for(int i=0; i<n; i++) {
                    for(int j=0; j<m; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }


                System.out.println("The transpose is : ");
                //To print transpose
                for(int j=0; j<m ;j++) {
                    for(int i=0; i<n; i++) {
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }




    }
}
