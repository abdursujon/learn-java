import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class CollectionClassInJava {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3));

        // 1. sort
        Collections.sort(list);
        System.out.println(list);

        // 2. reverse
        Collections.reverse(list);
        System.out.println(list);

        // 3. shuffle
        Collections.shuffle(list);
        System.out.println(list);

        // 4. max / min
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // 5. frequency
        System.out.println(Collections.frequency(list, 2));

        // 6. fill
        Collections.fill(list, 0);
        System.out.println(list);

        // 7. copy (needs destination list size)
        List<Integer> dest = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        System.out.println(dest);
        Collections.copy(dest, list);
        System.out.println(dest);

        // 8. binarySearch (list must be sorted)
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 2));
        System.out.println(Collections.binarySearch(list, 0));

        // 9. replaceAll
        Collections.replaceAll(list, 0, 99);
        System.out.println(list);

        // 10. unmodifiableList
        List<Integer> readOnly = Collections.unmodifiableList(list);
        // readOnly.add(89); will lead to -> Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(readOnly);

        // 11. singletonList (create a list with exactly one item)
        List<Integer> single = Collections.singletonList(10);
        System.out.println(single);
    }
}