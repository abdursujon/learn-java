public class Human implements Animal, Speaker{
    @Override
    public void sleep() {
        System.out.println("Human needs 8 hour sleep everyday.");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {
        System.out.println("I love coffee");
    }

    @Override
    public void goodSpeaker() {
        System.out.println("Human is often good speakers");
    }

    public void drink(){
        System.out.println("Human loves drinking");
    }
}