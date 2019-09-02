package DrugaPracaDomowa;

import java.util.Random;
import java.util.Scanner;
//Zagadka matematyczna
public class Zadanie21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(10);
        int y = r.nextInt(10);



        System.out.println(x + " * " + y + " = ");
        int prawidlowyWynik = x * y;

        int licznikOdpowiedzi = 0;
        int podanyWynik;

        while (licznikOdpowiedzi > -1){
            podanyWynik = sc.nextInt();
            licznikOdpowiedzi++;
            if (podanyWynik == prawidlowyWynik ) {
                System.out.println(licznikOdpowiedzi + " próba była udana. " +  " Poprawna odpowiedz to: " + podanyWynik);
                break;
                }else {
                System.out.println("Spróbuj jeszcze raz ");
            }
        }

    }


}



