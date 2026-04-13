import java.util.*;

class LeetCode {
    // Section 1. Arrays, Arrays Two Pointers, Arrays Sliding Window
    // 217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    // 268. Missing Number
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;

        if (nums[0] != 0) {
            return result = 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 != nums[i]) {
                return result = nums[i - 1] + 1;
            }
        }
        return result = nums[nums.length - 1] + 1;

    }

    // 448. Find All Numbers Disappeared in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }


    // 1. Find the target value by adding two element from given array
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    //  2. Bit Manipulation
    //  3. Dynamic Programming
    //  4. Backtracking
    //  5. LinedList
    //  6. ArrayList
    //  7. HashSet
    //  8. HashMap
    //  9. Stacks
    //  10. Queues
    //  11. Binary Trees
    //  12. Binary Search Trees
    //  13. Heaps
    //  14. Graphs
    public static void main(String[] args) {
        // 1. Find the target value by adding two element from given array
        System.out.println(Arrays.toString(twoSum(new int[]{1, 4, 5, 6, 6, 6, 12, 34}, 12)));
    }
}
