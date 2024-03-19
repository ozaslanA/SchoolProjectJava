package com.Okul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmenler {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void fakeOgretmenEkle() {
        ogretmenlerMap.put("1234568785456", "Ali,Can,1980,Matematik");
        ogretmenlerMap.put("12345687854256", "ahmet,Can,1980,fizik");
        ogretmenlerMap.put("12345687285456", "berk,Can,1980,turkce");
        ogretmenlerMap.put("12345687845456", "mehmet,Can,1980,kimya");

    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {

            System.out.println(
                    "\t  1-Ogretmen Listesi \t\t\t \n" +
                            "\t  2-Soyisimden Ogretmen Bulma \n" +
                            "\t  3-Branstan ogretmen bulma  \t\t \n " +
                            "\t  4-Bilgilerini Girerek Ogretmen Ekleme  \t\t \n " +
                            "\t  5-Kimlik No girerek Öğretmen Bulma  \t\t \n " +
                            "\t  A-ANAMENU  \t\t \n " +
                            "\t  Q-ÇIKIŞ \n");
            tercih = scanner.nextLine();

            switch (tercih) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    System.out.println("Programdan çıkılıyor...");
                    return;

                default:
                    System.out.println("Lütfen geçerli tercih seçiniz");
            }

        } while (!tercih.equalsIgnoreCase("q"));

    }

    public static void soyisimdenOgretmenBulma() {
        System.out.println("Aradığınız Ogretmennin soyismini yazın");
        String istenenSoyisim = scanner.nextLine();
    }

    public static void ogretmenListesiYazdir() {
        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println(" -------------YILDIZ KOLEJİ--------\n" +
                "-------------ÖĞRETMEN LİSTESİ --------- \n" +
                "TC No                        Isim         Doğum Yılı     Brans");
        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachkey = each.getKey();
            String eachValue = each.getValue();
            String eachValuarr[] = eachValue.split(",");
            System.out.printf("%-13s%-13s%-13s%-13s%s%n", eachkey, eachValuarr[0], eachValuarr[1], eachValuarr[2], eachValuarr[3]);

        }

    }
}
