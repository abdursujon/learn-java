import java.util.Scanner;

public class Class {

    interface Animals {
        void animalSound();
    }

    class Dog implements Animals{
        void animalSound(){
            System.out.println("Woof Woof");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter animal type: ");

    }
}
