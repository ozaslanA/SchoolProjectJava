package com.Okul;

import java.util.Scanner;

public class Depo {
    static Scanner scanner = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println(" -------------YILDIZ KOLEJİ--------\n" +
                    "-----------------ANA MENU------------ \n" +
                    "\n" +
                    "\t  1-Okul Bilgilerini Goruntule \t\t\t \n" +
                    "\t  2-Ogretmen Menu \n" +
                    "\t  3-Ogrenci Menu \t\t \n " +
                    "\t  Q-ÇIKIŞ \n"
            );
            System.out.println("Lütfen Seçiniz");
            tercih = scanner.nextLine();

            switch (tercih.toUpperCase()) {
                case "1":
                   Depo.okulBilgileriniYazdir();
                    break;
                case "2":
                    Ogretmenler.ogretmenMenu();
                    break;
                case "3":
                    // Öğrenci menüsüne geçiş işlemleri
                    break;
                case "Q":
                case "q":
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        } while (tercih.equalsIgnoreCase("q"));

    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println(" -------------YILDIZ KOLEJİ--------\n" + "\t\t Adres:" + School.adres + " \n\t\t " + "Telefon" + School.telefon);

        Thread.sleep(5000);
        Depo.anaMenu();

    }


    public static void main(String[] args) throws InterruptedException {
        Depo.anaMenu();
    }
}
