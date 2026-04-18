public class AnonymousClasses {
    public static void main(String[] args){
        // AnonymousClass which can implement the Animal interface without creating a subclass
        Animals myAnimal = new Animals(){
            public void makeSound(){
                System.out.println("Meow meow");
            }
        };

        myAnimal.makeSound();
    }
}

interface Animals {
    public void makeSound();
}
