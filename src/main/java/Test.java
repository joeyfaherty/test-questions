import java.util.*;

/**
 * Write a function which takes (x, y)
 * where x = [4, 92, 4, 7, 22] and y = [7, -2, 4, 4, 22, 92]
 * and the result is -2 as -2 is present in y but not in x
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> listX = new ArrayList<>(Arrays.asList(6, 2, 1, 4, 3, 2, 54, 999));
        ArrayList<Integer> listY = new ArrayList<>(Arrays.asList(4, 3, 6, 54, 999, -4, 1, 6, 2));

        List<Integer> remaining = new ArrayList<>();
        for (Integer e : listX) {
            if (!listY.contains(e)) {
                remaining.add(e);
            }
        }
        for (Integer e : listY) {
            if (!listX.contains(e)) {
                remaining.add(e);
            }
        }
        System.out.println(remaining);
    }
}
