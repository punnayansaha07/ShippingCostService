public interface ShippingStrategy {
    default double calculateCost(Orders orders){
        return 0.0;
    }
}