package Zgadywanie_liczb;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class ZgadywanieLiczb {

    public static void main(String[] args) {

        Random los = new Random();
        Scanner skan = new Scanner(System.in);

        int liczba = los.nextInt(5)+1;
        String cos = "";

        System.out.println("Zgadnij liczbę z zakresu 1 do 100: ");

        cos = skan.nextLine();

        while (isDigit(Integer.parseInt(cos))){
            System.out.print("To nie jest liczba, powtórz wybór: ");
            cos = skan.nextLine();
        }
        int twoja = Integer.parseInt(cos);

        while (twoja != liczba){
            System.out.println("przeglales, powtórz: ");
            cos = skan.nextLine();
            twoja = Integer.parseInt(cos);
         }
    }
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