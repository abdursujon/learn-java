package LinkedList;

public  class Account{
    protected int balance = 0;
    String name = "";

    public Account(int b){
        this.balance = b;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String[] args){
        Account smith, jones;
        smith = new Account(250);
        jones = smith;
        System.out.println(smith.getBalance());
        System.out.println(jones.getBalance());
    }
}