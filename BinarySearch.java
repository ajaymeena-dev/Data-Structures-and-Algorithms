public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        if (end >= start) {
            int mid = start + end / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
                return end;
            } else {
                start = mid + 1;
                return start;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 20;

        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

// Time Complexity***

// O(log n) -> very fast
// Space: O(1)