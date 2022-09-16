public class countFives {

    public static void main(String[] args) {

        System.out.println(countFives(123467890)); // should output 0
        System.out.println(countFives(555555));    // should output 6
        System.out.println(countFives(15354));     // should output 2

    }

    public static int countFives(int num) {
        if(num == 0){ // base case
            return 0;
        } else if (num % 10 == 5) {
            return 1 + countFives(num / 10); // making the recursive call on the subproblem
        } else { //
            return countFives(num / 10);
        }
    }
}
/*
* lines 12 and 13 include the base case, assumes that there are no 5's in the number
* lines 14 and 15 make the recursive call on the sub problem. The % operator divides num by 10 and returns the remainder.
* If the num % 10 produces a remainder of 5, 1 is returned and countFives is called.
* In line 17, countFives is called when a remainder of 5 is not produced. The process repeats until the base case and
* num is zero.
 */