import java.util.*;

public class ArrayManipulation {
    // 35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxPro = Math.max(maxPro, prices[j] - prices[i]);
            }
        }
        return maxPro;
    }

    // 283. Move Zeroes
    public static void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        int i = 0;
        while (i < list.size()) {
            nums[i] = list.get(i);
            i++;
        }

        for (int j = list.size(); j < nums.length; j++) {
            nums[j] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    // 169. Majority Element
    public static int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i : nums) {
            for (int j : nums) {
                if (i == j) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return i;
            }
            count = 0;
        }

        return major;
    }

    public static int majorityElementAlterNativeSolution(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // 349. Intersection of two arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> intersectSet = new HashSet<>();
        for(int n: nums1){
            seen.add(n);
        }

        for(int n: nums2){
            if(seen.contains(n)){
                intersectSet.add(n);
            }
        }

        int[] result = new int[intersectSet.size()];
        int i = 0;
        for(int n: intersectSet){
            result[i++] = n;
        }

        return result;
    }

    // 350. Intersection of two arrays ii
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int i = 0; int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[list.size()];
        int k = 0;
        for(int n: list){
            ans[k++] = n;
        }

        return ans;
    }

    // 414. Third Maximum number
    public static int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int n: nums){
           if(!list.contains(n)){
               list.add(n);
           }
        }
        Collections.reverse(list);

        if(list.size() == 1){
            return list.getFirst();
        } else if(list.size() == 2){
            return Collections.max(list);
        } else {
            return list.get(2);
        }
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        // 283. Move Zeroes
        moveZeroes(new int[]{0, 0, 0, 7, 1, 5, 3, 6, 4});

        // 169. Majority Element
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement(new int[]{3, 3, 4}));
        System.out.println(majorityElementAlterNativeSolution(new int[]{3, 3, 4}));

        intersection(new int[] {3,3,4}, new int[] {3,3,4});

        // 414. Third Maximum number
        System.out.println(thirdMax(new int[] {2,2,3,1}));
    }
}
