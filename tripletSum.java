import java.util.HashSet;

public class tripletSum {
    public static void findTriplet(int[] arr, int target) {
        int n = arr.length;
        
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currSum = target - arr[i];
            
            for (int j = i + 1; j < n-1; j++) {
                if (set.contains(currSum - arr[j])) {
                    System.out.println(arr[i] + " " + arr[j] + " " + (currSum - arr[j]));
                }
                set.add(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;

        findTriplet(arr, target);
    }
}
