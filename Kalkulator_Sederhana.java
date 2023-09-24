/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author riyan
 */
public class Kalkulator_Sederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pertama, kedua;
        char operasi;

        System.out.println("Masukkan angka pertama = ");
        pertama = input.nextDouble();

        System.out.println("Masukkan operasi perhitungan = ");
        operasi = input.next().charAt(0);

        System.out.println("Masukkan angka kedua = ");
        kedua = input.nextDouble();

        /*
        switch (operasi){
            case '+' -> System.out.println(pertama + kedua);
            case '-' -> System.out.println(pertama - kedua);
            case '*' -> System.out.println(pertama * kedua);
            case '/' -> System.out.println(pertama / kedua);
            case '%' -> System.out.println(pertama % kedua);
         */
        
        //gunakan else jika kondisi if tidak terpenuhi.
        //gunakan else if jika ingin menggunakan kondisi tertentu selain if
        if (operasi == '+') {
            System.out.println(pertama + kedua);
        } else if (operasi == '-') {
            System.out.println(pertama - kedua);
        } else if (operasi == '*') {
            System.out.println(pertama * kedua);
        } else if (operasi == '/') {
            System.out.println(pertama / kedua);
        } else if (operasi == '%') {
            System.out.println(pertama % kedua);
        }

    }
}
