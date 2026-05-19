import java.util.*;

/***
 * 1. 5 easy leetcode
 * 2. 10 medium leetcode
 * 3. 5 hard leetcode
 */
public class TwoPointers {

    /*====================5 EASY LEETCODE START=======================*/

    // 1. Valid Palindrome (Leetcode 125)
    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(char i: s.toCharArray()){
            if(Character.isLetterOrDigit(i)) {
                sb.append(Character.toLowerCase(i));
            }
        }
        int l = 0, r = sb.length() - 1;
        while(l < r){
            if(sb.charAt(l) != sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // 2. LinkedList Cycle (Leetcode 141)
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }

        return false;
    }

    // 3. Intersection of Two Linked Lists (160)
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        Set<ListNode> nodeSet = new HashSet<>();

        while(pointerA != null){
            nodeSet.add(pointerA);
            pointerA = pointerA.next;
        }

        while(pointerB != null){
            if(nodeSet.contains(pointerB)) return pointerB;
            pointerB = pointerB.next;
        }

        return null;
    }

    // 4. Happy Number(202)
    public boolean isHappy(int n){

        // Floyd’s cycle detection starts
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);
        // Floyd’s cycle detection ends

        return slow == 1;
    }

    public int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int remainder = n % 10; // gives the last digit
            ans += remainder * remainder;
            n = n/10; // for each iteration get rid of the last digit
        }
        return ans;
    }


    // 5.
    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        char[] ans = new char[s.length];
        while(l < s.length){
            ans[l++] = s[r--];
        }
        l = 0;
        for(char c: ans){
            s[l++] = c;
        }
        System.out.println(Arrays.toString(ans));
    }
    /*====================5 EASY LEETCODE END=======================*/

    /*====================10 MEDIUM LEETCODE START=======================*/
    // 1.
    // 2.
    // 3.
    // 4.
    // 5.
    // 6.
    // 7.
    // 8.
    // 9.
    // 10.
    /*====================10 MEDIUM LEETCODE END=======================*/

    /*====================5 HARD LEETCODE START=======================*/
    // 1.
    // 2.
    // 3.
    // 4.
    // 5.
    /*====================5 HARD LEETCODE END=======================*/

    public static void main(String[] args){

        /*====================5 EASY LEETCODE START=======================*/

        // 1. Valid Palindrome (Leetcode 125)
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(""));

        // 2. LinkedList Cycle (Leetcode 141)
        TwoPointers tp = new TwoPointers();
        ListNode l1 = tp.new ListNode(7);
        ListNode l2 = tp.new ListNode(5);
        ListNode l3 = tp.new ListNode(9);
        ListNode l4 = tp.new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l1;
        System.out.println(hasCycle(l4));

        // 3. Intersection of Two Linked Lists (160)
        ListNode connectionNode = tp.new ListNode(7);
        ListNode connectionNodeTwo = tp.new ListNode(8);
        connectionNode.next = connectionNodeTwo;

        // ListA
        ListNode a1 = tp.new ListNode(1);
        ListNode a2 = tp.new ListNode(2);
        ListNode a3 = tp.new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        a3.next = connectionNode;
        a3.next.next = connectionNodeTwo;

        // ListB
        ListNode b1 = tp.new ListNode(4);
        ListNode b2 = tp.new ListNode(5);
        ListNode b3 = tp.new ListNode(6);
        b1.next = b2;
        b2.next = b3;
        b3.next = connectionNode;
        b3.next.next = connectionNodeTwo;

        System.out.println(getIntersectionNode(a1, b1));


        // 4.
        // 5.
        reverseString(new char[] {'h','e','l','l','o'});

        /*====================5 EASY LEETCODE END=======================*/

        /*====================10 MEDIUM LEETCODE START=======================*/
        // 1.
        // 2.
        // 3.
        // 4.
        // 5.
        // 6.
        // 7.
        // 8.
        // 9.
        // 10.
        /*====================10 MEDIUM LEETCODE END=======================*/

        /*====================5 HARD LEETCODE START=======================*/
        // 1.
        // 2.
        // 3.
        // 4.
        // 5.
        /*====================5 HARD LEETCODE END=======================*/
    }
}
