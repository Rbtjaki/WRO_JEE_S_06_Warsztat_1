package SymulatorLOTTO;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class LOTTO {

    // Walidacja danych - tylko liczba.
    public static int tylkoLiczba(String text) {
        int count = 0;
        int number;
        for (int i = 0; i < text.length(); i++) {
            if (isDigit(text.charAt(i))) {
                count++;
            }
        }
        if(text.length() == count){
            number = Integer.parseInt(text);
        } else return -1;
        return number;
    }
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Random los = new Random();

        System.out.println("Podaj 6 liczb z zakresu 1 - 49, bo tylko takie moga wygrac: ");

        final int z = 49;
        int[] zakres = new int[z];
        int n = 0;
        int licznik = 0;

        for (int i = 0; i < z; i++) {
            zakres[i] = n++;
        }
        //wprowadzanie liczb
        int k;
        int[] user = new int[6];
//        String cos = skan.nextLine();
//        int twoja = tylkoLiczba(cos);

        for (int j = 0; j < 6; j++) {
           int twoja = tylkoLiczba(skan.nextLine());
                while (user[j] == twoja ||twoja > 49 || twoja < 0){
                    System.out.println("Wpis nie jest liczbą, liczba sie powtorzyla, jest za duza, albo za mala, musisz wpisac inna: ");
                    twoja = tylkoLiczba(skan.nextLine());
                }
                user[j] = twoja;
        }
        //sortowanie liczb usera
        int bufor = user[0];
        int[] nowa = new int[user.length];
        for (int i = 0; i < user.length; i++){
            bufor = 51;
            for (int j = 0; j < user.length; j++){
                if (bufor > user[j]){
                    bufor = user[j];
                    licznik = j;
                }
            }nowa[i] = bufor;
            user[licznik] = 51;
            System.out.print("," + nowa[i]);
        }
        System.out.print("\n");
        // tworzenie tablicy wynikow losowan bez powtorzen
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int x = los.nextInt(49+1)+1;
            for (int j = 0; j < 49; j++) {
                if (x == i + 1 && x == 0) {
                    zakres[i] = -1;
                }
            }lotto[i] = x;
            System.out.print(lotto[i] + ",");
        }
        int check = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (nowa[i] == lotto[j]) {
                    check++;
                }
            }
        }
        // wskazanie trafnosci typowan
        if (check <= 3) {
            System.out.print("0 trafien, przegrales");
        } else if (check == 3) {
            System.out.print(" Trafiles 3");
        } else if (check == 4) {
            System.out.print(" Trafiles 4");
        } else if (check == 5) {
            System.out.print(" Trafiles 5");
        } else {
            System.out.print(" Trafiles 6");
        }
        skan.close();
    }
}
