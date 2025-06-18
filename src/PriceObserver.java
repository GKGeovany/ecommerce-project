public class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        double itemCost = order.getItemCost();
        double discount = (itemCost > 200) ? 20.0 : 0.0;

        double discountedCost = itemCost - discount;
        double total = discountedCost + order.getShippingCost();

        order.setTotalPrice(total);

        if (discount > 0) {
            System.out.println("[PriceObserver] Discount applied: -$20 → New Total: $" + total);
        }
    }
}
