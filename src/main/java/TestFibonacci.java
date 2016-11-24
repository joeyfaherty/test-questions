/*
 * Print the first ten integers of the Fibonacci sequence.
 *
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two.
 */
public class TestFibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + ", " + n1);
        for (int i = 2; i < 10; i++) {
            n2 = n0 + n1;
            System.out.print(", " + n2);
            n0 = n1;
            n1 = n2;
        }

    }
}
