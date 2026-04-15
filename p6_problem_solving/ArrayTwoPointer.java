public class ArrayTwoPointer{
    // 11. Container with most water 
    public int maxArea(int[] height) {
     int i = 0;
     int j = height.length -1;
     int max = 0;
        
     while ( i < j){
         int w = j - i;
         int currentArea = Math.min(height[i], height[j]) * w;
         max = Math.max(max, currentArea);

         if(height[i] < height[j]){
             i++;
         } else{
             j--;
         }
     }

     return max;

    }
}