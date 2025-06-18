import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int itemCount;
    private double itemCost;
    private double shippingCost = 10.0;
    private double totalPrice;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void addItem(double price) {
        this.itemCount++;
        this.itemCost += price;
        notifyObserver();
    }

    public void notifyObserver() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    // Nouvelle méthode pour mise à jour centralisée si besoin
    public void updateTotalPrice() {
        this.totalPrice = this.itemCost + this.shippingCost;
    }

    // Getters
    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Setters
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order #" + id + " | Items: " + itemCount + " | ItemCost: $" + itemCost +
                " | Shipping: $" + shippingCost + " | Total: $" + totalPrice;
    }
}
