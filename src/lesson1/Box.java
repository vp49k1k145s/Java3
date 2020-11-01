package lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> items;

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T item: items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
}
