public class FirstOccurance {
    static int findFistOccurance(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value){
                ans = mid;
                end = mid -1;
            }
            if (arr[mid] > value) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }


    static int findLastOccurance(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value){
                ans = mid;
                start = mid + 1;
            }
            if (arr[mid] > value) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int value){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) return mid;
            if (arr[mid] > value) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
