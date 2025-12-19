
public class selectionSort {
    public static int[] selSort(int[] L) {
        int n = L.length;
        for (int i = 0; i < n; i++) {
            int min = L[i];
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (L[j] < min) {
                    min = L[j];
                    minpos = j;
                }
            }
            int temp = L[i];
            L[i] = min;
            L[minpos] = temp;
        }
        return L;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 4, 68, 9, 3 };
        int asn[] = selSort(arr);
        for (int elm : asn) {
            System.out.println(elm);
        }
        System.out.println(asn);
    }
}