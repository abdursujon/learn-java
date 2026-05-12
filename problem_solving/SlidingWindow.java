import java.util.*;

public class SlidingWindow {
    /**
     * 1. Fixed-size sliding window (k given)
     * Example: max sum of subarray size k = 3
     */
    public static int maxSum(int[] nums, int k){
        int sum = 0;
        int max = sum;

        // first window
        for(int i = 0; i < k; i++){
            sum+= nums[i];
        }

        // sliding window one element at a time
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    /**
     * 2. Variable size dynamic sliding window (no length given)
     * Example: longest substring without repeating characters
     */
    public static int longestSubstringSize(String s){
        Set<Character> set = new HashSet<>();

        int left =  0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(maxLen, (right - left) + 1);
        }
        return maxLen;
    }

    // 187. Repeated DNA Sequences
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i = 0; i <= s.length() - 10; i++){
            String sub = s.substring(i, i + 10);
            if(seen.contains(sub)){
                repeated.add(sub);
            } else{
                seen.add(sub);
            }
        }
        return new ArrayList<>(repeated);
    }

    public static void main(String[] args){
        // 1. Fixed-size sliding window (k given)
        System.out.println(maxSum(new int[] {2, 1, 5, 1, 3, 2}, 3));

        // 2. Variable size dynamic sliding window (no length given)
        System.out.println(longestSubstringSize("abcabcbb")); // 3
        System.out.println(longestSubstringSize("bbbbb"));    // 1
        System.out.println(longestSubstringSize("pwwkew"));   // 3

        // 187. Repeated DNS Sequences
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
}
