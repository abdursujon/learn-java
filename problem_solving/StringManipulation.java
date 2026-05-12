import java.util.*;

public class StringManipulation {
    // 13. Roman to Integer
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        Character[] romanChar = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] romanValue = {1, 5, 10, 50, 100, 500, 1000};

        int i = 0;
        while (i < romanChar.length) {
            mp.put(romanChar[i], romanValue[i]);
            i++;
        }

        int num = 0;
        int prev = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            int curr = mp.get(s.charAt(j));
            if (curr < prev) {
                num -= curr;
            } else {
                num += curr;
            }
            prev = curr;
        }

        return num;
    }

    public int romanToIntSecondMethod(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int num = 0;
        int prev = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            int curr = mp.get(s.charAt(j));
            if (curr < prev) {
                num -= curr;
            } else {
                num += curr;
            }
            prev = curr;
        }

        return num;
    }

    // 20. Valid Parentheses
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            boolean st = stack.isEmpty();

            if (st && (c == ')' || c == '}' || c == ']')) {
                return false;
            }

            if (!st && c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (!st && c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (!st && c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    // 28. Find the index of the first occurrence in a string
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    // 58. Length of last word
    public static int lengthOfLastWord(String s) {
        String newStr = s.trim();
        int len = 0;
        for (int i = newStr.length() - 1; i >= 0; i--) {
            if (newStr.charAt(i) == ' ') break;
            else len++;
        }
        return len;
    }

    // 3. Longest Substring Without Repeating Characters
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        int len = 1;

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))){
                break;
            }
            list.add(s.charAt(i));
            len += i;
        }
        int k = s.length();
        // continue adding char until a char found which already exist in the arraylist
        // when a char foud that already exist in the list, stop the loop
        // return the size of the arraylist

        return list.size();
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();

        // 13. Roman to Integer
        System.out.println(sm.romanToInt("XXVII"));
        System.out.println(sm.romanToIntSecondMethod("XXVII"));

        // 20. Valid Parentheses
        System.out.println(sm.isValid("()"));
        System.out.println(sm.isValid("()[]{}"));
        System.out.println(sm.isValid("(]"));
        System.out.println(sm.isValid("([])"));
        System.out.println(sm.isValid("([)]"));
        System.out.println(sm.isValid(")(){}"));
        System.out.println(sm.isValid(")(){}"));

        // 28. Find the index of the first occurrence in a string
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("butsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));

        // 58. Length of last word
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("Hello"));
        System.out.println(lengthOfLastWord("luffy is still joyboy   "));
    }

}
