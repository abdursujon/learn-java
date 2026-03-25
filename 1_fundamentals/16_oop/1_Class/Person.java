public class Person{
  public String name;
  public int age;
  
  public Person(String name, int age){
    this.name = name;
    this.age = age; 
  }
  
  public Person(){}

  public void setAge(int age){ this.age = age;};
  public int getAge() {return age;};

   public static void main(String args[]){
    Person p = new Person();
    p.setAge(34);
    System.out.println("Age = " + p.getAge());
  }
}
