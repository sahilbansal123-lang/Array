package array2d;

import java.util.Scanner;

public class Array2d {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

//      inputs
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
//      output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

//      output
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



//    ------------------------------------------------------------------------------------------------------------------

//  Q3:   For a given matrix of N x M, print its transpose.
//
//
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int m = sc.nextInt();
//
//
//                int matrix[][] = new int[n][m];
//                for(int i=0; i<n; i++) {
//                    for(int j=0; j<m; j++) {
//                        matrix[i][j] = sc.nextInt();
//                    }
//                }
//
//
//                System.out.println("The transpose is : ");
//                //To print transpose
//                for(int j=0; j<m ;j++) {
//                    for(int i=0; i<n; i++) {
//                        System.out.print(matrix[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//
//


    }
}
