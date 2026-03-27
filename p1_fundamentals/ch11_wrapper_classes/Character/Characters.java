public class Characters{
      public static void main(String [] args){
          char ch = 'A';

          // 1. Character.isLetter(arg) -> checks if it's a letter
          System.out.println(Character.isLetter(ch));

          // 2. Character.isDigit(arg) -> checks if it's a digit
          System.out.println(Character.isDigit('9'));

          // 3. Character.isUpperCase(arg) -> checks if uppercase
          System.out.println(Character.isUpperCase(ch));

          // 4. Character.isLowerCase(arg) -> checks if lowercase
          System.out.println(Character.isLowerCase('a'));

          // 5. Character.toUpperCase(arg) -> converts to uppercase
          System.out.println(Character.toUpperCase('a'));

          // 6. Character.toLowerCase(arg) -> converts to lowercase
          System.out.println(Character.toLowerCase('A'));

          // 7. Character.isWhitespace(arg) -> checks if space/tab/newline
          System.out.println(Character.isWhitespace(' '));

          // 8. Character.toString(arg) -> char to String
          System.out.println(Character.toString(ch));
      }
  }