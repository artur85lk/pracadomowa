package testy;

import java.util.Scanner;

public class testy {
//    static long liczbaZCiąguFibonaciego (long n) {
//        long liczba = 1;
//        long wynik = 1;
//        long x = 1;
//        long y;
//        while ( x < n)
//            x++;
//        wynik++;
//        return wynik;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long d = 0; // zmienna do dzielników
        long g = x; // zmienna pomocnicza x poczatkowe
        long c = 1;
        boolean pierwasz = true;

        while (x > 1) {
            --x;
            ++c;

            if (x != 1 && g % x == 0) {
                if (c != x) {
                    System.out.println("nie jest liczbą pierwszą");
                    break;

                }
            }
            if (g / x == g) {
                System.out.println("jest liczbą pierwszą");
                break;


            }
        }
    }
}


