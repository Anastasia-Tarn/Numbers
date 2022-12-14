import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
