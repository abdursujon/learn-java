public class TryCatchFinally {
    public static void main(String[] args){
        try{
            int result = 10 / 0;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
        } finally {
            System.out.println("Finally block always runs");
        }


        int[] nums = {1, 5, 6, 7};
        try{
            System.out.println(nums[6]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally{
            int i = nums[1];
            System.out.println(i);
            System.out.println("Finally block always runs");
        }

        try {
            System.out.println("No exception thrown");
        } catch (Exception e) {
            System.out.println("Won't run");
        } finally {
            System.out.println("Finally still runs even with no exception");
        }
    }
}
