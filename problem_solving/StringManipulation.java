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

    // 67. Add Binary
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int digitA = 0;
            if(i >= 0){
                digitA = a.charAt(i) - '0';
                i--;
            }

            int digitB = 0;
            if(j >= 0){
                digitB = b.charAt(j) - '0';
                j--;
            }

            int sum = digitA + digitB + carry;
            carry = sum / 2;
            int currDigit = sum % 2;
            result.append(currDigit);
        }

        return result.reverse().toString();
    }


    // 168. Excel sheet column title
    public static String convertToTitle(int columnNumber) {
        if(columnNumber == 0) return "";
        columnNumber--;
        char lastLetter = (char) ('A' + columnNumber % 26);
        String leftPart = convertToTitle(columnNumber / 26);
        return leftPart + lastLetter;
    }

    public String convertToTitleTwo(int n) {
        StringBuilder ans = new StringBuilder();
        while(n > 0){
            n--;
            int curr = n % 26;
            n = n / 26;
            ans.append((char)('A' + curr));
        }

        return ans.reverse().toString();
    }


    // 171. Excel Sheet Column Number
    public static int titleToNumber(String columnTitle) {
        int ans = 0;

        for(int i = 0; i < columnTitle.length(); i++){
            ans = ans * 26 + (columnTitle.charAt(i) - 'A') + 1;
        }

        return ans;
    }

    // 205. Isomorphic Strings
    public static boolean isIsomorphic(String s, String t) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            if(list.contains(s.charAt(i))){
                return false;
            }
            list.add(s.charAt(i));
        }
        System.out.println(list);
        return true;
    }


    // 242. Valid Anagram
    public static boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen != tLen){
            return false;
        }

        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        System.out.println(cs);
        char[] ts = t.toCharArray();
        Arrays.sort(ts);
        System.out.println(ts);

        for(int i = 0; i < sLen; i++){
            if(cs[i] != ts[i]){
                return false;
            }
        }
        return true;
    }

    // 383. Ransom Note
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char c:  magazineChars){
            // map.getOrDefault(c, 0) + 1 we are counting how many times we have seen c
           map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: ransomNoteChars){
            // if character in ransomNoteChars does not exist in the map return false
            if(map.getOrDefault(c, 0) == 0) return false;
            // if we have found c in the map for character in ransomNote decrease count by 1 so we can declare if we have enough character of ransomNote in magazine
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return true;
    }

    public boolean canConstructTwo(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map.getOrDefault(c, 0) == 0) return false;
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return true;
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

        // 67. Add Binary
        System.out.println(addBinary("1", "1"));

        char a = 'A';
        int i = a;
        System.out.println(i);

        System.out.println(convertToTitle(1));

        // 171. Excel Sheet Column Number
        System.out.println(titleToNumber("B"));

        // 205. Isomorphic Strings
        System.out.println(isIsomorphic("egg", "add"));

        isAnagram("rat", "cat");

        // 383. Ransom Note
        System.out.println(canConstruct("aa", "ab"));
    }

}
