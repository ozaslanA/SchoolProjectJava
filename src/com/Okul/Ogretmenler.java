package com.Okul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogretmenler {
    static Scanner scanner = new Scanner(System.in);
    static Map<String , String> ogretmenlerMap=new HashMap<>();

    public static void  fakeOgretmenEkle(){
        ogretmenlerMap.put("1234568785456","Ali,Can,1980,Matematik");
        ogretmenlerMap.put("12345687854256","ahmet,Can,1980,fizik");
        ogretmenlerMap.put("12345687285456","berk,Can,1980,turkce");
        ogretmenlerMap.put("12345687845456","mehmet,Can,1980,kimya");

    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do {

            System.out.println(" -------------YILDIZ KOLEJİ--------\n" +
                    "-----------------ANA MENU------------ \n" +
                    "\n" +
                    "\t  1-Ogretmen Listesi \t\t\t \n" +
                    "\t  2-Soyisimden Ogretmen Bulma \n" +
                    "\t  3-Branstan ogretmen bulma  \t\t \n " +
                    "\t  Q-ÇIKIŞ \n" );
            tercih = scanner.nextLine();

            switch (tercih){
                case "1":
                    break;
                case "2":
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
               break;

                default:
                    System.out.println("Lütfen gecerli tercih seciniz");
            }

        }while (!tercih.equalsIgnoreCase("q"));
    }
}
