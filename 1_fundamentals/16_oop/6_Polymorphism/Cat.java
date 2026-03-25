public class Cat implements Animal, Speaker{
    @Override
    public void sleep() {
        System.out.println("Cat sleeps 12/16 hours everyday!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    public void goodSpeaker() {
        System.out.println("Cat only speaks in meow");
    }
}