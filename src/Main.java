import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        Collections.addAll(list, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int x : list) {
            if (x > 0 && x % 2 == 0) {
                newList.add(x);
            }
        }
        newList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(newList.toArray()));

    }


}