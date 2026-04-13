package ch16_oop.Polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;


public class PolymorphicCollections {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        list.add("Sujon");
        list.add(22);
        list.add("I love coffee");
        list.add(44.55);
        list.add(new Cat());
        list.add(new Human());
        System.out.println(list);
        ArrayList<Speaker> speak = new ArrayList<>();
        speak.add(new Human());
        speak.add(new Cat());

        for(Speaker s: speak){
            s.speak();
        }

        LinkedList<Speaker> speakTwo = new LinkedList<>();
        speakTwo.add(new Human());
        speakTwo.add(new Cat());
        for(Speaker s: speakTwo){
            s.speak();
            s.goodSpeaker();
        }


        ArrayList<Animal> animals = new ArrayList();
        animals.add(new Human());
        animals.add(new Cat());
        for(Animal a: animals){
            a.sleep();
        }
    }
}