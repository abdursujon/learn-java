public class Floats{
    public static void main(String [] args){
        String input_str = "33.3";

        // 1. Float.parseFloat(arg) -> String to float
        System.out.println(Float.parseFloat(input_str));

        // 2. Float.valueOf(arg) -> String to Float Object
        System.out.println(Float.valueOf("999.9"));

        // 3. Float.toString(arg) -> float to String
        System.out.println(Float.toString(44.4f));

        // 4. Float.MAX_VALUE
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        // 5. Float.compare(a,b) -> Return -1, 0, 1
        System.out.println(Float.compare(22.2f, 33.3f));
        System.out.println(Float.compare(22.2f, 22.2f));
        System.out.println(Float.compare(33.3f, 22.2f));
    }
}
