package DrugaPracaDomowa;

import java.util.Scanner;

//czy lizba jest liczbą pierwszą
public class Zadanie243 {

    static boolean czyPierwsza(long x) {

        long g = x; // zmienna pomocnicza x poczatkowe
        long c = 1;


        while (x > 1) {
            --x;


            if (x != 1 && g % x == 0) {

                    System.out.println("nie jest liczbą pierwszą");
                    return false;

                //}
            }
            if (g / x == g) {
                System.out.println("jest liczbą pierwszą");
                return true;


            }
        }
return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        boolean wynik = czyPierwsza(x);



        System.out.println(wynik);



        sc.close();
    }
}
