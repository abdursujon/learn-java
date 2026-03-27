class TVRemote extends TV{

    @Override
    void turnOn() {
        System.out.println("Tv is on, enjoy!");
    }

    @Override
    void turnOf() {
        System.out.println("Tv is off, see you soon.");

    }

    @Override
    void increaseVolume() {
       System.out.println("Increased Volume");
    }

    @Override
    void decreaseVolume() {
        System.out.println("Decreased Volume.");
    }

    public static  void main(String[] args){
        TVRemote remote = new TVRemote();
        remote.turnOn();
        remote.turnOf();
        remote.increaseVolume();
        remote.decreaseVolume();
    }
}