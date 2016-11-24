/*
 * Given the list l as [4, 3, 5, 7, 8] and the key t as 12,
 * the function answer(l, t) would return the list [0, 2]
 * because the list l contains the sub-list [4, 3, 5]
 * starting at index 0 and ending at index 2, for which
 * 4 + 3 + 5 = 12, even though there is a shorter sequence
 * that happens later in the list (5 + 7).
 * <p>
 * On the other hand, given the list l as [1, 2, 3, 4] and
 * the key t as 15,
 * the function answer(l, t) would return [-1, -1] because
 * there is no sub-list of list l that can be summed up
 * to the given target value t = 15.
 */
public class Test2 {

    public static void main(String[] args) {
        int[] l = {1, 1, 1, 1, 1, 4, 3, 5, 7, 8};
        int t = 8;
        int[] answer = answer(l, t);
        System.out.println("" + answer[0] + " " + answer[1]);
    }

    public static int[] answer(int[] l, int t) {
        int[] result = {-1, -1};
        int sum;
        for (int i = 0; i < l.length; i++) {
            // reset the sum after we increment i
            sum = 0;
            for (int j = i; j < l.length; j++) {
                sum += l[j];
                if (sum > t) {
                    // if sum exceeds t, then we start from the next index of i
                    break;
                }
                if (sum == t) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}
