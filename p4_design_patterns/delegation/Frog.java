package delegation;
import delegation.FrogInterface;

public class Frog implements FrogInterface{
    FrogInterface f = null;
    public Frog(FrogInterface f){
        this.f = f;
    }

    public void swim(){
        f.swim();
    }

    public void change (FrogInterface f){
        this.f = f;
    }

    public static void  main(String[] args){
        Frog f = new Frog(new Tadpole());
        f.swim();
        f.change(new AdultFrog());
        f.swim();
    }
}