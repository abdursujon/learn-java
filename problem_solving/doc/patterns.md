## How to Solve A Problem Sequence 
# R2 SPD IT 
- R2: Read Twice 
- S: Sudo code 
- P: Pattern 
- D: Data structure 
- I: Implementation 
- T: Test

## First Priority 
- Array Manipulation
- String Manipulation 1, 2 
- Hash Table (HashMap, HashSet)
- Math
- Sorting
- Two Pointers
- Fast and Slow Pointers

## Sliding Window
Two Common Type Of Sliding Window 

1. Fixed size window → often one pointer + math
```java
// Max sum of subarray of size k
public static int maxSum(int[] nums, int k) {
    int sum = 0;

    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }

    int max = sum;

    for (int i = k; i < nums.length; i++) {
        sum += nums[i] - nums[i - k];
        max = Math.max(max, sum);
    }

    return max;
}

// String slicing (single loop)
public static List<String> find(String s) {
    Set<String> seen = new HashSet<>();
    Set<String> res = new HashSet<>();

    for (int i = 0; i <= s.length() - 10; i++) {
        String sub = s.substring(i, i + 10);

        if (!seen.add(sub)) {
            res.add(sub);
        }
    }

    return new ArrayList<>(res);
}
```

2. Variable size window (two pointers)
```java
// Longest substring without repeating characters
public static int longestSubstring(String s) {
    Set<Character> set = new HashSet<>();

    int left = 0, max = 0;

    for (int right = 0; right < s.length(); right++) {

        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }

        set.add(s.charAt(right));

        max = Math.max(max, right - left + 1);
    }

    return max;
}

```
- Binary Search
- Stack
- Queue
- Linked List
- Recursion
- Tree
- Binary Tree
- Depth First Search
- Breadth First Search 
- Greedy
- Heap (Priority Queue)
- Backtracking
- Dynamic Programming
- Divide and Conquer
- Merge Sort
- Prefix sum 
- Mid-Level 
- Subsets 


Second Priority 
14. Modified Binary Search
15. Merge Intervals
16. Top K Elements
17. Cyclic Sort
18. Two Heaps
19. K-way Merge
20. Topological Sort