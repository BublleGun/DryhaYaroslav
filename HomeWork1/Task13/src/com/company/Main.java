package com.company;

import java.io.IOException;
import java.util.Random;


public class Main {


    public static int[] getArray() throws IOException {

        Random r = new Random();

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100) - 0;
            System.out.println(mas[i]);
        }
        return mas;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++)
            max = Math.max(max, array[i]);

        return max;
    }


    public static void main(String[] args) throws Exception {
        int[] array = getArray();
        int max = max(array);
        System.out.println("Max is: " + max);
    }

}
