package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args){
        int value = 5;
        int value2 = 4;
        boolean result;
        result = value == value2;

        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != value2;
        System.out.println("Hasil 'value != value2' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > value2;
        System.out.println("Hasil 'value > value2' adalah "+ result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= value2;
        System.out.println("Hasil 'value >= value2' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < value2;
        System.out.println("Hasil 'value < value2' adalah" +result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= value2;
        System.out.println("Hasil 'value <= value2' adalah "+result);
        System.out.println();
    }

}
