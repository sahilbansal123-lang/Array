public class SubArray {

    // Print Subarray and also print sum of sub array
    public static void subArray(int arr []){

        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++ ) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    // Maximum subarray sum

    public static void maxSubArraySum(int arr[]){

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}
