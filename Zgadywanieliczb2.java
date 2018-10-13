package Zgadywanie_liczb_2;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanieliczb2 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        int zakres = 1001;

        Random los = new Random();

        int grDol = 1;

        int num;

        String decyzja;

        int n = (int)(Math.log(zakres)/ Math.log(2));

        System.out.println(" Wymyœl jak¹s liczbê od  1 do 1000.");

        num = los.nextInt(zakres - grDol) + grDol;

        System.out.println("jeaeli jest wiéksza niz " + num + " W, jesli mniejsza M");

        decyzja = skan.nextLine();

        for (int i = 0; i < n + 5; i++) {

            if (decyzja.equals("W") || decyzja.equals("w")) {

                grDol = num;

            } else if (decyzja.equals("M") || decyzja.equals("m")) {

                zakres = num;

            } else if (decyzja.equals("T") || decyzja.equals("t")){ continue;}

            num = los .nextInt(zakres - grDol + 1)+ grDol;

            System.out.print("Czy to liczba: " + num + " ");

            decyzja = skan.nextLine();
        }

        System.out.print("Twoja liczna to: " + num);
        skan.close();
    }

}

