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
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if (numbers[i][j] == x){
                    System.out.println("Your number is at location: " + "(" + i + " " + j+ ")");
                }
            }
        }
        System.out.println("Number not present in the matrix");
    }

//  -------------------------------------------------------------------------------------------------------------------

//    Q2: Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]




}
