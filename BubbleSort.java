public class BubbleSort {
    public static void sortAlgo(int arr[], int n) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        sortAlgo(arr, 0);

        for (int elm : arr) {
            System.out.println(elm);
        }
    }
}