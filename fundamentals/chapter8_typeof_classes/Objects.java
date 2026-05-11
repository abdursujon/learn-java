/**
 1. toString()
 2. equals(Object obj)
 3. hashCode()
 4. getClass()
 5. clone()
 7. wait()
 8. wait(long timeout)
 9. wait(long timeout, int nanos)
 10. notify()
 11. notifyAll()
 */
public class Objects{
    private class Person{
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return "Name:" + name + ", Age: " + age;
        }

    }
    public static void main(String[] args){

    }
}