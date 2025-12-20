class QuickSort {
    public static int partition() {
        
        return 0;
    }

    public static void sortAlgo(int arr[], int low, int high) {
        if (high > low) {
            int pivIdx = partition();

            sortAlgo(arr, low, pivIdx - 1);
            sortAlgo(arr, pivIdx + 1, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 8, 9, 12, 10 };
        int n = arr.length;

        sortAlgo(arr, 0, n - 1);
    }
}