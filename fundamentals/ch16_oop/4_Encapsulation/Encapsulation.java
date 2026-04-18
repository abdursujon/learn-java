public class Encapsulation {
    private String name;
    private int id;


    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void etId(int i){
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args){
        Encapsulation en = new Encapsulation();
        en.setName("Sujon");
        System.out.println(en.getName());
    }

}