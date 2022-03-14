public class TrappingRainWater {
    //TC O(n)+O(n) = O(n)
    static int trappedWater(int[] arr){
        int[] leftMax = fillLeftMax(arr); //TC O(n)
        int[] rightMax = fillRightMax(arr); //TC O(n)
        int rainTrappedUnit = 0;
        for(int i = 0; i<arr.length -1 ; i++){ //TC O(n)
            rainTrappedUnit += Integer.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return rainTrappedUnit;
    }

    //TC O(n), SC O(n)
    private static int[] fillLeftMax(int[] arr) {
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            leftMax[i] = Integer.max(leftMax[i-1], arr[i]);
        }
        for(int i:leftMax)
            System.out.print(" "+i);
        return leftMax;
    }

    //TC O(n), SC O(n)
    private static int[] fillRightMax(int[] arr) {
        int[] rightMax = new int[arr.length];
        int n = arr.length;
        rightMax[n - 1] = arr[n - 1];
        for(int i = n - 2; i>=0; i--){
            rightMax[i] = Integer.max(rightMax[i+1], arr[i]);
        }
        System.out.println("\n");
        for(int i:rightMax)
            System.out.print(" "+i);
        return rightMax;
    }
}
