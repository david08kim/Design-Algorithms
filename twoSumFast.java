// Q2
/*
 * Q2: TwoSum (Fast) (3 points)
 *
 * Convert the following code into Pseudocode and put it in twosum.txt.
 * Hint: for some loops, you should describe what it does in English.
 * There are no tests for this problem, so be sure to double check and
 * test your translation manually, similar to how we did in lecture.
 */
public class twoSumFast {

        public static void main (String[] args) {

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
/*
 * algorithm twoSumFast
 *   input: Empty HashSet that will store values from an array
 *   output: indices of two integers that add up to the target value
 *     empty hashset is created
 *     for each element in the array, create a variable and store the target value - current element
 *       in the array in the variable
 *     if the value of the variable is present in the HashSet, two integers whose sum is equal to the target
 *       value are present in the HashSet
 *     otherwise, add element to HashSet and loop through the array
 *     after looping through array, return {-1, -1} if two integers whose sum is equal to the target is not found
 */
