import java.util.Arrays;

public class DivideAndConquer {
    public static int findTheIndexOfTargetElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            } else if( target < nums[mid]){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

    // data structure: array, string builder , parseInteger from string builder
    public static int[] plusOne(int[] digits) {

        int[] result = new int[digits.length];
        int[] specialCase = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 0, digits.length - 1);
        StringBuilder sb = new StringBuilder();
        for(int n : digits){
            sb.append(n);
        }

        // when digit length is one add 1 to the number
        // but then create an array with one extra element when the total is >= 10

        String s = sb.toString();
        char c = s.charAt(s.length() - 1);
        for(int i = 0; i < digits.length; i++){
            if(digits.length == 1){
                if(digits[0] + 1 >= 10){
                    specialCase[i] = s.charAt(i);
                }
            }
        }
        int last = Integer.parseInt(String.valueOf(c)) + 1;
        result[result.length -1] = last;
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 3));
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 9));
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 4));
        System.out.println(plusOne(new int[]{1, 2, 3}));
        System.out.println(plusOne(new int[]{9}));
    }
}
