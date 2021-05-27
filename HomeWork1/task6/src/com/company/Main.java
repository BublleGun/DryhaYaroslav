package com.company;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public void addPrice(int p_applesPrice) {
            this.applesPrice += p_applesPrice;
        }
    }
}