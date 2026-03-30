class LeetCode {
   // SECTION - ARRAYS:
   // 217. Contains Duplicate   
   public static boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>(); 
        for(int n : nums){
            if(set.contains(n)){
                return true; 
            }
            set.add(n);
        }
        return false; 
    }

   // 268. Missing Number 
   public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0; 

        if(nums[0] != 0){
           return result = 0; 
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] + 1 != nums[i]){
                return result = nums[i - 1] + 1; 
            }
        }
        return result = nums[nums.length - 1] + 1; 
    }

}
