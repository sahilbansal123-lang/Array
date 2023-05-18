package arrays;

public class SubArray {

//---------------------------------------------------------------------------------------------------------------------

//    // Print Subarray and also print sum of sub array
//    public static void subArray(int[] arr){
//
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i; j < arr.length; j++ ) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                    sum = sum + arr[k];
//                }
//                System.out.print(" = " + sum);
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }

//---------------------------------------------------------------------------------------------------------------------

    // Maximum subarray sum BRUTEFORCE APPROACH

//    public static void maxSubArraySum(int arr[]){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i; j < arr.length; j++){
//                currSum = 0;
//                for (int k = i; k <= j; k++){
//                    currSum += arr[k];
//                }
//                System.out.println(currSum);
//                if (maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max Sub arrays.Array Sum = " + maxSum);
//    }

//    ------------------------------------------------------------------------------------------------------------------

//    Maximum subarray sum PREFIX APPROACH
//    public static void maxSubArraySum(int[] arr){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int[] prefix = new int[arr.length];
//
//        prefix[0] = arr[0];
//        // calculate prefix sum
//        for (int i = 1; i < arr.length; i++) {
//            prefix[i] = prefix[i-1] + arr[i];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                currSum = i == 0 ? prefix[j] :  prefix[j] - prefix[i-1];
//                if (maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max Sub arrays.Array Sum = " + maxSum);
//    }

//    -----------------------------------------------------------------------------------------------------------------

//    Maximum subarray sum KADANES ALGORITHM
    public static void maxSubArraySum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sub arrays.Array Sum is : " + maxSum);
    }


    public static void main(String[] args) {
        int[] arr = {-1};
//        subArray(arr);
        maxSubArraySum(arr);
    }
}
