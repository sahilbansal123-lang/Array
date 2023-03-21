import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        Array: List of items of the same types
//        syntax: type[] arrayName = new type[size];
//                        or
//        syntax: type[] arrayName = {1,2,3,4,5};
/*        for ex:
            int[] List = new int[10];
            List[0] = 100;
            List[1] = 90;
            List[2] = 99;

        */

//        int [] marks = new int[3];
//                    or
//          int marks[] = new int[3];
//                    or
//        int marks[] = {97, 98, 99};
//                    or
//            marks[0] = 97;
//            marks[1] = 98;
//            marks[2] = 99;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("size of the array: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        System.out.println("Enter the number to the array");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be find: ");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("Your Number is at location: " + i);
            }
        }
            System.out.println("number can't present in the array");
    }
}


