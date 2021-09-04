package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> random = new ArrayList<>();
        Randoms ran = new Randoms();

        while (true) {
            int a = ran.Randoms(90, 100);
            random.add(a);
            for (int r : random) {
                System.out.println("Случайное число " + r);
                if (r == 100) {
                    System.out.println("Выпало число 100 давайте на этом закончим ");
                    return;
                }
            }
        }
    }
}