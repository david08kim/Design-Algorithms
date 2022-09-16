public class findMissingNumber {

        public static void main(String[] args) {
            System.out.println("-----Q1-----");
            int testResult1 = findMissing(new int[] {0, 1, 2, 4, 5});
            System.out.println(testResult1); // should output 3

            int testResult2 = findMissing(new int[] {5, 0, 4, 3, 1});
            System.out.println(testResult2); // should output 2

            int testResult3 = findMissing(new int[] {});
            System.out.println(testResult3); // should output 0

            int testResult4 = findMissing(new int[] {9, 3, 5, 1, 4, 8, 2, 10, 0, 6});
            System.out.println(testResult4); // should output 7

        }
        public static int findMissing(int[] arr) {

            int s = 0;
            int N = arr.length; // N is a variable that stores the length of an array, array length = array's last index + 1

            for(int i = 0; i < arr.length; i++) { // for loop to find the sum of all numbers in an array.
                s = s + arr[i];
            }
            int missingNumber = ((N * (N + 1)) / 2) - s;
            return missingNumber;
            /*
             *  accounts for an array with a missing element ranging from [0-N] and
             *  subtracts the sum of the given array and stores it in a variable named missingNumber
             */
        }
}


