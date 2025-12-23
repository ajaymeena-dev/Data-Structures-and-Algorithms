import java.util.HashMap;

public class FindFrequency {
    public static Object checkFreq(int arr[], int count) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int elm : arr) {
            hashMap.put(elm, hashMap.getOrDefault(elm, 0) + 1);
        }
        return hashMap;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 3, 7, 5, 7, 9, 1 };
        int count = 0;
        Object obj = checkFreq(arr, count);
        System.out.println(obj);
    }
}

// Approach: Best & optimized
// Time Complexity: O(n)
// Space Complexity: O(n)