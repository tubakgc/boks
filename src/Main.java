
public class Main {
    public static void main(String[] args) {
        Fighter Naim = new Fighter("Naim",15,100,90,50);
        Fighter Hamza= new Fighter("Hamza",10,95,100,40);
        Ring m= new Ring(Naim,Hamza,90,100);
        m.run();

    }
}