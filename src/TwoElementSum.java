import java.util.HashSet;

public class TwoElementSum {
    static void printTwoElementWhoseSum(int[] arr, int sum){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i<arr.length -1 ; i++){
            hashSet.add(arr[i]);
        }

        for (int j : arr) {
            if (hashSet.contains(sum - j)) { // arr[i] + desiredItem = sum => desiredItem = sum - arr[i]
                System.out.println("item1: " + j + " item2: " + (sum - j));
                break;
            }
        }
    }

    static int[] getPrefixSum(int[] arr){
        for (int i = 1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
