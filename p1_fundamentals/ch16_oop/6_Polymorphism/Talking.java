public class Talking {
    public static void main(String[] args){
        Speaker current;
        current = new Cat();
        current.speak();

        current = new Human();
        current.speak();
        ((Human)current).drink();
    }
}