public class ArrayManipulation {
    // 35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(target < nums[mid]){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        for(int i = 0; i < prices.length; i++){
           for(int j = i + 1; j < prices.length; j++){
              maxPro =  Math.max(maxPro, prices[j] - prices[i]);
           }
        }
        return maxPro;
    }

    public static void main(String[] args){
    System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
}
