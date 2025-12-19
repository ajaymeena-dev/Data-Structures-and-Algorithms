// Find missing number in 1 to n
public class MissingNumber {

    public static int findMissing(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2; //main formula 
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7 };
        int n = 7;
        int missingNumer = findMissing(arr, n);
        System.out.println("Missing Number is -> " + missingNumer);
    }
}
