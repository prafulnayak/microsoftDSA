import java.util.*;

public class Array {
    /*
    Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value.
     */
    static boolean findSumOfTwo(int[] A, int val) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i: A){
            hashSet.add(i);
        }
        for (int i: A){
            if(hashSet.contains(val - i)){
                return true;
            }
        }
        return false;
    }
    /*
    Given a two-dimensional array, if any element within is zero, make its whole row and column zero.
     */
    static int[][] make_zeroes(int[][] matrix) {
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i =0; i< matrix.length; i++){
            for(int j =0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(hashMap.containsKey(i)){
                        hashMap.get(i).add(j);
                    }else {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(j);
                        hashMap.put(i,arrayList);
                    }
                }
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> map : hashMap.entrySet()) {
            int i = map.getKey();
            for(int j =0; j< matrix[i].length; j++){
                matrix[i][j] = 0;
            }
            for (int j:map.getValue()){
                for (int ix =0; ix< matrix.length; ix++){
                    matrix[ix][j] = 0;
                }
            }
        }
        return matrix;
    }

    static int[] findTwoElement(int arr[], int size) {
        // code here
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {  //{5,6,1,2,3,7,4,4,9}
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = - arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }

        return null;
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i =0; i< arr.length; i++){
            if(arr[i] != target[i])
                return false;
        }
        return true;
    }

}
