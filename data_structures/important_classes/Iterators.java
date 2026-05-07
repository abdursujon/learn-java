package important_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3));

        // 1. Create Iterator
        Iterator<Integer> it = list.iterator();

        // 2. hasNext() + next() traversal
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // reset list (iterator gets exhausted)
        it = list.iterator();

        // 3. remove using iterator safely
        while (it.hasNext()) {
            int val = it.next();
            if (val == 2) {
                it.remove();
            }
        }
        System.out.println(list);

    }
}
