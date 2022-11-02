package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5= "+ hasil);

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 10;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -10 = "+ hasil2);

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 9;
        nilaiAwal3++;
        System.out.println("Hasil 9++ = "+nilaiAwal3);

        System.out.println("Operator Pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 2;
        nilaiAwal4--;
        System.out.println("Hasil 2-- = " + nilaiAwal4);

        System.out.println("Operator komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false = " + !sukses);
    }
}
