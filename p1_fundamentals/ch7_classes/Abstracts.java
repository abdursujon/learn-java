package ch7_classes;

public abstract class Abstracts {
    public abstract void humanSound(double weight);
    public void speak(){
        System.out.println("pewwwwwwwwww");
    }
}

class Person extends Abstracts{

    @Override
    public void humanSound(double weight){
        if(weight > 90){
            System.out.println("Snoring koooogg");
        } else{
            System.out.println("Ssssssssssssssh");
        }
    }

    public void speak(){
        System.out.println("Meowwwwwwww");
    }
}