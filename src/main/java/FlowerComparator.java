import flowerEntity.Flower;

import java.util.Comparator;

public class FlowerComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2){
        return f1.getName().compareTo(f2.getName());
    }
}
