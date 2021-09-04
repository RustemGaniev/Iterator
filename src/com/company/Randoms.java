package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {

    List<Integer> myRandom = new ArrayList<>();


    public int Randoms(int min, int max) {
        Random a = new Random();
        int dif = max - min;
        int i = a.nextInt(dif + 1);
        return min + i;

    }

    public Randoms addRandoms(Integer i) {
        List<Integer> myRandom = new ArrayList<>();
        myRandom.add(i);
        return this;
    }


    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < myRandom.size()) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                Integer r = myRandom.get(next);
                next++;
                return r;
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
