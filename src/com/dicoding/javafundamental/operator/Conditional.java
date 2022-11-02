package com.dicoding.javafundamental.operator;

public class Conditional {
    public static void main(String[] args) {
        int value = 10;
        int value2 = 20;

        System.out.println("Conditional AND");
        boolean result = value == 3 && value2 == 5;
        boolean result2 = value != 3 && value2 == 5;

        System.out.println("Hasil Operator AND pada syarat value == 3 dan value2 == 5 adlaah" + result);
        System.out.println("Hasil Operator AND pada sayart value != 3 dan value2 == 5 adalah" + result2);
        System.out.println();
        System.out.println("Conditional OR");

        result = value == 3 || value2 == 5;
        result2 = value != 3 || value2 == 5;

        System.out.println("Hasil Operator OR pada syarat value == 3 dan value2 == 5 adalah" + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan value2 == 5 adlaah" + result2);
        System.out.println();

    }
}
