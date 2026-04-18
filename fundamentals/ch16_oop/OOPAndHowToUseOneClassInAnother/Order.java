package ch16_oop.OOPAndHowToUseOneClassInAnother;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public static void main(String[] args){
        List<Customer> customer = new ArrayList<>();
        customer.add(new Customer("Alice", 59595, new Integer[]{200, 233, 66, 23}));
        customer.add(new Customer("Sujon", 9898, new Integer[]{200, 233, 66, 23}));

        // Loop through all customers
        for(Customer c: customer){
            System.out.println(c.getName() + " " + c.getId());
        }

        // Loop through item that only needed
        int sum = 0;
        for(Customer c: customer){
           for(int p: c.getPrice()){
               sum += p;
           }
        }
        System.out.println("Sum is " + sum);

        // Access, modify, remove a specific customer
        Customer firstCustomer = customer.get(0);
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getId());
        firstCustomer.setName("Ryan");
        firstCustomer.setId(989);
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getId());
        customer.remove(0);
        firstCustomer.setName(null);
        System.out.println(firstCustomer.getName());
    }
}
