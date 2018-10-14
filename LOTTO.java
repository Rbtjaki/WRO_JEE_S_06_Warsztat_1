package SymulatorLOTTO;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LOTTO {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Random los = new Random();

        System.out.println("Podaj 6 liczb z zakresu 1 - 49, bo tylko takie moga wygrac: ");

        final int z = 49;


        int[] zakres = new int[z];
        int num = 0;
        int n = 0;

        int licznik = 0;

        for (int i = 0; i < z; i++) {
            zakres[i] = n++;
        }
        int[] user = new int[6];
        for (int j = 0; j < 6; j++) {
            user[j] = skan.nextInt();
            for (int k = 0; k < j; k++){
                while (user[j] == user[k]){
                    System.out.println("Liczba sie powtorzyla, musisz wybrac inna: ");
                    user[k] = skan.nextInt();
                }
                while (user[k] > 49){
                    System.out.println("Liczba jest za duza, musisz wybrac inna: ");
                    user[k] = skan.nextInt();
                }
                while (user[k] < 0){
                    System.out.println("Liczba jest za mala, musisz wybrac inna: ");
                    user[k] = skan.nextInt();
                }
            }
        }
        int bufor = user[0];
        int[] nowa = new int[user.length];
        for (int i = 0; i < user.length; i++){
            bufor = user[0];
            for (int j = 0; j < user.length; j++){
                if (bufor > user[j]){
                    bufor = user[j];
                    licznik = j;
                }
            }nowa[i] = bufor;
            user[licznik] = 51;
            System.out.print(" " + nowa[i]);
        }
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int x = los.nextInt(49+1)+1;
            for (int j = 0; j < 49; j++) {
                if (x == i + 1 && x == 0) {
                    zakres[i] = -1;
                }
            }lotto[i] = x;
            System.out.println(lotto[i] + " ");
        }
        int check = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (nowa[i] == lotto[j]) {
                    check++;
                }
            }
        }
        if (check <= 3) {
            System.out.print("Przegra³eœ");
        } else if (check == 3) {
            System.out.print("Trafi³eœ 3");
        } else if (check == 4) {
            System.out.print("Trafi³eœ 4");
        } else if (check == 5) {
            System.out.print("Trafi³eœ 5");
        } else {
            System.out.print("Trafi³eœ 6");
        }
        skan.close();
    }
}
}
