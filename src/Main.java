public class Main {
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();
        factory.registerObserver(new ToyShop("John"));
        factory.registerObserver(new ToyShop("Maven"));
        factory.notifyObservers("Rubick", 5, 15.5F);
        factory.notifyObservers("Buzz", 10, 20F);
        Product toy1 = factory.createToy("Rubick", 2, 25F);
        toy1.playInfo();
        Product toy2 = factory.createToy("Buzz", 40, 30F);
        toy2.playInfo();
    }
}