
public class WeightBasedRateShipping  implements ShippingStrategy {
   public final int rate;
    public WeightBasedRateShipping(int rate) {
        this.rate = rate;
    }

    @Override
    public double calculateCost(Orders orders) {
        double totalWeight = 0.0;
          for(int i = 0 ; i < orders.n ; i++){
              totalWeight += orders.containerNumber[i]*orders.containerSize[i];
          }
          return totalWeight*rate;
    };
};
