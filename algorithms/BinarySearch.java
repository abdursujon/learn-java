public class BinarySearch {
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

    public static void main(String[] args) {
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 3));
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 9));
        System.out.println(findTheIndexOfTargetElement(new int[]{1, 2, 3, 5, 6, 8, 9}, 4));
    }
}
