package PierwszaPracaDomowa;

import java.util.Scanner;

public class zadanie1 {

    static String Doskonala(long x) {
        long d = 0; // zmienna do dzielników
        long g = x; // zmienna pomocnicza x poczatkowe
        String j = "jeste liczbą doskonałą";
        String n = "nie jest liczbą doskonała";

        while (x > 1) {

            if (g % x == 0) {
                long z = g / x; // dzielniki
                d += z; // suma dzielników

                if (d == g) {
                    return j;
                }
            }
            --x;
        }
        return n;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        String rezultat = Doskonala(x);

        long czasRozpoczecia = System.currentTimeMillis();

        System.out.println(rezultat);

        long czasZakonczenia = System.currentTimeMillis();
        long czasTrwania = czasZakonczenia - czasRozpoczecia;
        System.out.println("Czas trwania obliczen: " + czasTrwania);

        sc.close();
    }
}
