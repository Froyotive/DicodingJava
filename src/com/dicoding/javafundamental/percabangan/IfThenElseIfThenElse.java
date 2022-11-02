package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;

public class IfThenElseIfThenElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Anda : ");
        int nilaiujian = scanner.nextInt();
        char indeksPrestasi;

        if (nilaiujian >= 90){
            indeksPrestasi = 'A';
        } else if (nilaiujian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiujian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiujian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiujian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }
        System.out.println("Indeks prestasi anda adalah "+ indeksPrestasi);
    }
}
