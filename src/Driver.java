public class Driver {
    public static void main(String[] args) {
        Order order = new Order(101);

        order.attach(new QuantityObserver());
        order.attach(new PriceObserver());



        order.addItem(50);
        order.addItem(40);
        order.addItem(120);
        order.addItem(30);
        order.addItem(25);
        order.addItem(10);


        System.out.println(order);
    }
}
