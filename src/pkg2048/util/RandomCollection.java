package pkg2048.util;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class RandomCollection<E> {
    private final NavigableMap<Double, E> map = new TreeMap<>();
    private final Random random;
    private double total = 0;

    public RandomCollection(){
        this.random = new Random();
    }
   
    public RandomCollection<E> addItem(double weight, E item){
        if (weight <= 0) return this;
        total += weight;
        map.put(total, item);
        return this;
    }
    
    public E nextItem(){
        double valor = random.nextDouble() * total;
        return map.higherEntry(valor).getValue();
    }
}