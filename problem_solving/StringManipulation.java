import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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

            if(st && (c == ')' || c == '}' || c == ']')){
                return false;
            }

            if (!st && c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else{
                    return false;
                }
            }
            if (!st && c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else{
                    return false;
                }
            }
            if (!st && c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else{
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
        System.out.println(sm.romanToInt("XXVII"));
        System.out.println(sm.romanToIntSecondMethod("XXVII"));
        System.out.println(sm.isValid("()"));
        System.out.println(sm.isValid("()[]{}"));
        System.out.println(sm.isValid("(]"));
        System.out.println(sm.isValid("([])"));
        System.out.println(sm.isValid("([)]"));
        System.out.println(sm.isValid(")(){}"));
        System.out.println(sm.isValid(")(){}"));
    }
}
