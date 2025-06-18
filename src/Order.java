import java.util.List;

public class Order {
    private int id;
    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private double totalPrice;
    private List<OrderObserver> observers;

    public Order(int id) {
        // TODO: constructor logic
    }

    public void attach(OrderObserver observer) {
        // TODO: add observer
    }

    public void addItem(double price) {
        // TODO: update itemCount and itemCost, notify observers
    }

    public double getTotalPrice() {
        // TODO: return total price
        return 0;
    }

    public double getItemCost() {
        // TODO: return item cost
        return 0;
    }

    public int getItemCount() {
        // TODO: return item count
        return 0;
    }

    public double getShippingCost() {
        // TODO: return shipping cost
        return 0;
    }

    public void setTotalPrice(double totalPrice) {
        // TODO: set total price
    }

    public void setShippingCost(double shippingCost) {
        // TODO: set shipping cost
    }

    public void notifyObserver() {
        // TODO: notify observers
    }

    @Override
    public String toString() {
        // TODO: return string representation
        return null;
    }
}
