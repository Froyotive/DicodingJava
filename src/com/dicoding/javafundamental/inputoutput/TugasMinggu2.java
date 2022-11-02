package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class TugasMinggu2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Program Menghitung Nilai Mahasiswa");
            System.out.print("Masukkan Nama : ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM : ");
            int nim = scanner.nextInt();
            System.out.print("Masukkan Nilai Tubes : ");
            int tubes = scanner.nextInt();
            System.out.print("Masukkan Nilai Quiz : ");
            int quiz = scanner.nextInt();
            System.out.print("Masukkan Nilai Tugas : ");
            int tugas = scanner.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            int uts = scanner.nextInt();
            System.out.print("Masukkan Nilai UAS : ");
            int uas = scanner.nextInt();
            double hasil = ((0.3*tubes) + (0.1*quiz) + (0.1*tugas) + (0.25*uts) + (0.25*uas) ) ;
            System.out.println("Nama : " + name);
            System.out.println("NIM  : " + nim);
            System.out.println("Nilai Matakuliah Pemgrograman Berorientasi Objek : " + hasil);
        }
    }
