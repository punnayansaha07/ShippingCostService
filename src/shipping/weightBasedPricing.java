package shipping;
import orders.Order;
public class weightBasedPricing  implements ShippingStrategy {
    public final int rate;
    public weightBasedPricing(int rate) {
        this.rate = rate;
    }

    @Override
    public double calculateCost(Order orders) {
        double totalWeight = 0.0;
        for(int i = 0 ; i < orders.n ; i++){
            totalWeight += orders.containerNumber[i]*orders.containerSize[i];
        }
        return totalWeight*rate;
    };
};
