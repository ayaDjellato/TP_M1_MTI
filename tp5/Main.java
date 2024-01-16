public class Main {
    public static void main(String[] args) {
        Iphone_publisher Iphone15 = new Iphone_publisher();
        ConcreteObs costumer1 = new ConcreteObs();
        ConcreteObs costumer2 = new ConcreteObs();

        Iphone15.register_obs(costumer1);
        Iphone15.register_obs(costumer2);

        costumer1.update();
    }
}
