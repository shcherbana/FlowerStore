package flower.store;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Getter
public class FlowerBucket {
    @Setter
    private ArrayList<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}