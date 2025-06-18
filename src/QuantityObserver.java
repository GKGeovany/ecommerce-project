public class QuantityObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0.0);
        } else {
            order.setShippingCost(10.0);
        }
        System.out.println("[QuantityObserver] Shipping updated: $" + order.getShippingCost());
    }
}
