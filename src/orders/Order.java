package orders;
public abstract class Order {
    public int n;
    public int[] containerNumber;
    public double[] containerSize;

    Order(int n,int[] containerNumber,double[] containerSize){
        this.n = n;
        this.containerNumber = containerNumber;
        this.containerSize = containerSize;
    }
}
