package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    int max;
    int min;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int randoms(Randoms random) {
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
                Integer i = randoms(new Randoms(90, 100));
                return i;
            }
        };
    }
}
