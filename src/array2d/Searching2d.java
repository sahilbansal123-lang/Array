package array2d;

import java.util.Scanner;

public class Searching2d {

    public static void searching(int[][] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == x) {
                    System.out.println( "("+ i + "," + j + ")");
                }
            }
        }
        System.out.println("Number not present in the matrix");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter the number You want to find: ");
        int x = sc.nextInt();

//      inputs
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//      output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        searching(arr, x);
    }


}