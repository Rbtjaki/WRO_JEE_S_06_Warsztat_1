package Kostka_do_gry;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Character.isDigit;

public class KostkaDoGry {
    public static void main(String[] args) {


        Scanner skan = new Scanner(System.in);
        System.out.println("Do wyboru masz nastepujace kostki D3, D4, D6, D8, D10, D12, D20, D100");

        System.out.println("Podaj tryb losowania xDy + z: ");

        String text = skan.nextLine();

        int a,b;
        String kostka = "";

        for (int i = 2; i < (text.length() - 2); i++) {

            kostka = kostka + text.charAt(i);
        }
        int dodaj = Integer.parseInt(kostka);

        if (sprawdzDane(text)) {
            a = Integer.parseInt(String.valueOf(text.charAt(0)));
            b = Integer.parseInt(String.valueOf(text.charAt(text.length() - 1)));

            int tab[] = new int[a];

            tab = losowanie(a, dodaj, b);

            for (int i = 0; i < a; i++ ) {

                System.out.println(tab[i] + " ");
            }
        }
        skan.close();

    }public static int[] losowanie(int x, int y, int z){
        Random los = new Random();
        int[] num = new int[y];

        for (int i = 0; i < x; i++){

            num[i] = los.nextInt(y + 1) + 1;
            num[i]= num[i] + z;
        }return num;

    } private static boolean sprawdzDane(String dane){

        return (isDigit(dane.charAt(0)) && isDigit(dane.charAt(2)) && isDigit(dane.charAt(dane.length() - 1)));
    }
}

