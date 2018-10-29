package S62;

public class Customer {
    public static void main(String[] args) {
        System.out.println("bmw");
        Car bmw = CarFactory.getCar("BMW");
        System.out.println(bmw.getInfo());
        System.out.println("benz");
        Car benz = CarFactory.getCar("Benz");
        System.out.println(benz.getInfo());

    }
}
