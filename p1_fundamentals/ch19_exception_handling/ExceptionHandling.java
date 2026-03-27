import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling {

    protected int age;

    public static void initialiseArray(){
        int[] arr = new int[3];
        try{
            for(int i = 0; i < 4; i++){
                arr[i] = i;
                System.out.println(arr);            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Size is too large");
        } catch (RuntimeException rn){
            System.out.println("Runtime exception");
        }
    }

    public static void calculate(){
        try{
            int[] arr = new int[10];
            arr[10] = 40/ 0;
        } catch (ArithmeticException e){
            System.out.println("Task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Task 2 is completed");
        }
//        catch (EOFException e){
//            System.out.println("File is empty");
//        }
        finally {
            System.out.println("finally block is always executed");
        }
    }

    public int setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        return this.age = age;
    }

    public static void readFile(String path) throws IOException{
        FileInputStream file = new FileInputStream(path);
        int data;
        while((data = file.read()) != -1){
            System.out.print((char) data + " ");
        }
        file.close();
    }

    public static void main(String[] args) throws IOException{
        initialiseArray();
        calculate();
        ExceptionHandling ex = new ExceptionHandling();
        // ex.setAge(-78); // throws exception
        System.out.println(ex.setAge(78));
        readFile("/home/sujon/Project/learn-java/1_fundamentals/19_exception_handling/exception.csv");
//        int x = 1;
//        int y = x++ + x;
//        System.out.println("y is " + y);

        int x = 1;
        int y = x + x++;
        System.out.println("y is " + y);

    }
}