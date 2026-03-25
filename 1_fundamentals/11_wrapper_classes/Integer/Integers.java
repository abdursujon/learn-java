public class Integers{
    public static void main(String [] args){
        String input_str = "33";

        // 1. Integer.parseInt(arg) -> String to int
        System.out.println(Integer.parseInt(input_str));

        // 2. Integer.valueOf(arg) -> String to Integer Object
        System.out.println(Integer.valueOf("999"));

        // 3. Integer.toString(arg) -> int to String
        System.out.println(Integer.toString(44));

        // 4. Integer.MAX_VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 5. Integer.compare(a,b) -> Return -1, 0, 1
        System.out.println(Integer.compare(22, 33));
        System.out.println(Integer.compare(22, 22));
        System.out.println(Integer.compare(33, 22));
    }
}