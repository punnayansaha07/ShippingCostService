import java.util.ArrayList;
import java.util.List;

public abstract class Orders {
     protected int n;
     protected int[] containerNumber;
     protected double[] containerSize;

     Orders(int n,int[] containerNumber,double[] containerSize){
         this.n = n;
         this.containerNumber = containerNumber;
         this.containerSize = containerSize;
     }
};
