package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {

    int max;
    int min;

public Randoms(int min, int max){
    this.min = min;
    this.max = max;

}

public Randoms() {

}


    public int Randomms(Randoms random) {
        Random a = new Random();
        int dif = random.max - random.min;
        int i = a.nextInt(dif + 1);
        return random.min + i;

    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                    return true;
                }


            @Override
            public Integer next() {
                Integer i = Randomms(new Randoms(90, 100));
                return i;
            }

            @Override
            public void remove() {
                Iterator.super.remove();
            }

            @Override
            public void forEachRemaining(Consumer<? super Integer> action) {
                Iterator.super.forEachRemaining(action);
            }
        };
    }

}
