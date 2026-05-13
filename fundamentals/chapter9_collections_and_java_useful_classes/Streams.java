import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

/**
 * stream()
 * 1. filter()
 * 2. map()
 * 3. flatMap()
 * 4. forEach()
 * 5. collect()
 * 6. reduce()
 * 7. sorted()
 * 8. distinct()
 * 9. limit()
 * 10. skip()
 * 11. count()
 * 12. findFirst()
 * 13. findAny()
 * 14. anyMatch()
 * 15. allMatch()
 * 16. noneMatch()
 * 17. min()
 * 18. max()
 * 19. toList()
 * 20. peek()
 */
public class Streams {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        // 1. stream() & filter()
        List<Integer> even = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = nums.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);

        // 2. map()
        List<Integer> trouple = nums.stream().map(n -> n * 3).collect(Collectors.toList());
        System.out.println(trouple);

        // 3. flatMap()
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(2, 4, 6), Arrays.asList(1, 3, 5), Arrays.asList(7, 9, 11), Arrays.asList(8, 10, 12));
        List<Integer> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
