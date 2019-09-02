package DrugaPracaDomowa;

import java.util.Random;
import java.util.Scanner;

//Zgadnij liczbę z zakresu
public class Zadanie22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(999);

        System.out.println("Zgadnij o jakiej liczbie od 0 do 999 myślę? ");

        int licznikOdpowiedzi = 0;
        int podanyWynik;

        while (licznikOdpowiedzi > -1){

            podanyWynik = sc.nextInt();
            licznikOdpowiedzi++;
            if (podanyWynik == x) {
                System.out.println(licznikOdpowiedzi + " próba była udana. " +  " Poprawna odpowiedz to: " + podanyWynik);
                break;
                }
            if (podanyWynik > x){
                System.out.println("ta liczba jest za duża ");
                System.out.println("Spróbuj jeszcze raz ");
            }
            if (podanyWynik < x){
                System.out.println("ta liczba jest za mała ");
                System.out.println("Spróbuj jeszcze raz ");
            }
        }
    }

}






