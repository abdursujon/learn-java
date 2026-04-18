package ch16_oop.OOPAndHowToUseOneClassInAnother;

public class Customer {
  private String name;
  private int id;
  private Integer[] price;
  
  public Customer(String name, int id, Integer[] price){
    this.name = name;
    this.id = id;
    this.price = price;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    if(name == null){
      return "No name provided";
    }
    return name;
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setPrice(Integer[] price){
    this.price = price;
  }

  public Integer[] getPrice(){
    return price;
  }
}
