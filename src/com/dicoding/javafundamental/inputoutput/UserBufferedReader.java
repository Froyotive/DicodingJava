package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int value2 = 0;
        try {
            System.out.print("Masukkan Angka Pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan Angka Kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = value + value2;
        System.out.println("Hasilnya adalah : " + hasil);
        }
    }
