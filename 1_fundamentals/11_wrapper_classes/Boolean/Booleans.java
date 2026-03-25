package Boolean;

public class Booleans{
      public static void main(String [] args){
          String input_str = "true";

          // 1. Boolean.parseBoolean(arg) -> String to boolean
          System.out.println(Boolean.parseBoolean(input_str));

          // 2. Boolean.valueOf(arg) -> String to Boolean Object
          System.out.println(Boolean.valueOf("false"));

          // 3. Boolean.toString(arg) -> boolean to String
          System.out.println(Boolean.toString(true));

          // 4. Boolean.compare(a,b) -> Return -1, 0, 1
          System.out.println(Boolean.compare(true, false));
          System.out.println(Boolean.compare(true, true));
          System.out.println(Boolean.compare(false, true));
      }
  }
