public class AnonymousClasses {
    public static void main(String[] args){
        // AnonymousClass which can implement the Animal interface without creating a subclass
        Animal myAnimal = new Animal(){
            public void makeSound(){
                System.out.println("Meow meow");
            }
        };

        myAnimal.makeSound();
    }
}

interface Animal {
    public void makeSound();
}
