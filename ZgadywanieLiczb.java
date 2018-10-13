package Zgadywanie_liczb;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class ZgadywanieLiczb {

    public static void main(String[] args) {

        Random los = new Random();
        Scanner skan = new Scanner(System.in);

        int liczba = los.nextInt(100) + 1;

        System.out.println("Zgadnij liczbę z zakresu 1 do 100: ");

        try{

        int twoja = skan.nextInt();

        while (twoja != liczba) {
            if (twoja < liczba) {
                System.out.println("Za mala powtórz: ");
                twoja = skan.nextInt();

            } else if (twoja > liczba) {
                System.out.println("Za duza powtórz: ");
                twoja = skan.nextInt();
            }
        }
        }catch (InputMismatchException e) {
            System.err.println("To nie liczba!!! " + e);
        }System.out.println("Zgadles");
        skan.close();
    }

//POWRÓT  && Integer.parseInt(cos) <=100 && Integer.parseInt(cos) >= 1
//Podstawy programowania w Javie
//Zadania
//Gra w zgadywanie liczb
//Symulator LOTTO
//Gra w zgadywanie liczb 2
//Kostka do gry
//Wyszukiwarka najpopularniejszych słów
//Gra w zgadywanie liczb
//Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:
//
//wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
//sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.
