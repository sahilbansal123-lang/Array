package array2d;

import java.util.Scanner;

public class DiognalSum {

    public static int diognalSum(int matrix[][]) {


//        BRUTE FORCE

//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                } else if (i + j == matrix.length-1){
//                    sum += matrix[i][j];
//                }
//            }
//        }
//
//        return sum;


//        LINEAR COMPLEXITY CODE(OPTIMIZED)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // pd
            sum += matrix[i][i];
            if (i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
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

        System.out.println(diognalSum(matrix));
    }

}
