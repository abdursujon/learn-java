public class Doubles{
    public static void main(String [] args){
        String input_str = "33.3";

        // 1. Double.parseDouble(arg) -> String to double
        System.out.println(Double.parseDouble(input_str));

        // 2. Double.valueOf(arg) -> String to Double Object
        System.out.println(Double.valueOf("999.9"));

        // 3. Double.toString(arg) -> double to String
        System.out.println(Double.toString(44.4));

        // 4. Double.MAX_VALUE
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        // 5. Double.compare(a,b) -> Return -1, 0, 1
        System.out.println(Double.compare(22.2, 33.3));
        System.out.println(Double.compare(22.2, 22.2));
        System.out.println(Double.compare(33.3, 22.2));
    }

}