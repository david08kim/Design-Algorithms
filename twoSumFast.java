import java.util.*;

public class twoSumFast {

    public static void main(String[] args) {
        int [] testResult5 = twoSumFast(new int[] {1, 2, 3, 4, 5}, 9);
        System.out.println(Arrays.toString(testResult5)); // should output [-1,-1]
    }

    public static int[] twoSumFast(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int j = 0; j < arr.length; j++) {
            int otherAddend = target - arr[j];
            if (seen.contains(otherAddend)) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == otherAddend)  {
                        return new int[] {i, j};
                    }
                }
            } else {
                seen.add(arr[j]);
            }
        }
        return new int[] {-1, -1};
    }

}
