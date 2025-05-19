package shipping;
import orders.Order;
public interface ShippingStrategy {
    default double calculateCost(Order orders){
        return 0.0;
    }
}
