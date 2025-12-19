public class SelectionSort {

    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Step 1: Traverse array
        for (int i = 0; i < n - 1; i++) {

            // Step 2: Assume current index has minimum
            int minIndex = i;

            // Step 3: Find actual minimum in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Step 4: Swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}