public class Longs{
    public static void main(String [] args){
        String input_str = "33";

        // 1. Long.parseLong(arg) -> String to long
        System.out.println(Long.parseLong(input_str));

        // 2. Long.valueOf(arg) -> String to Long Object
        System.out.println(Long.valueOf("999"));

        // 3. Long.toString(arg) -> long to String
        System.out.println(Long.toString(44L));

        // 4. Long.MAX_VALUE / Long.MIN_VALUE
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 5. Long.compare(a,b) -> Return -1, 0, 1
        System.out.println(Long.compare(22L, 33L));
        System.out.println(Long.compare(22L, 22L));
        System.out.println(Long.compare(33L, 22L));
    }
}
