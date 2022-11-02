package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello World!");

        Gitar.bunyi();
        Mobil.jumlahban();
        Kereta.jumlahban();
        Motor.jumlahban();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        String name = "Halo nama saya";
        System.out.println(name);

        char[] ejaan = {'H', 'e', 'l', 'l', 'o'};
        String ejaanString = new String(ejaan);
        System.out.println(ejaanString);

        String namasaya = "EVANDANI";
        int length = namasaya.length();
        System.out.println(length);
        char result = namasaya.charAt(0);
        System.out.println(result);
    }
}
