abstract class TV{
    abstract void turnoff();
    abstract void turnon();
}
class TVremote extends TV{
    void turnoff(){
        System.out.println("Tv is turnoff");
    }
     void turnon(){
        System.out.println("Tv is turnon");
    }
}
public class Abstraction{
    public static void main (String[] args) {
        TV remote = new TVremote();
        remote.turnon();
        remote.turnoff();
    }
}
