
package ch5_control_flow;
/**
 * 1. if/else
 * 2. switch
 * 3. ternary
 */
public class ConditionalStatements{
    public static void main(String [] args){
        int a = 30;
        int b = 30;

        // 1. if/else
        if(a > b){
            System.out.println("a is greater");
        } else if(a == b){
            System.out.println("a and b is equal");
        } else {
            System.out.println("b is greater");
        }

        // 2. switch
        int month = 2;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("I don't know");
                break;
        }

        // 3. ternary: (condition) ? valueIfTrue : valueIfFalse;
        int max = (a < b) ? a:b;
        System.out.println(max);

        String nameOne = "Sujon";
        String nameTwo = "Ryan";
        String name = (nameOne.length() > nameTwo.length()) ? nameOne : nameTwo;
        System.out.println(name);

    }
}