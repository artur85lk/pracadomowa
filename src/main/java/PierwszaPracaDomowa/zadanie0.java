package PierwszaPracaDomowa;

import java.util.Scanner;

public class zadanie0 {

    static boolean liczba(int x) {
        int g = x;
        if (x <= 1) {
            return false;
        }
        if (x == 4) {
            return false;
        } else {
            while (1 < x) {

                if (x != 1 && g != x && g % x == 0) {
                    return false;
                }
                if (x == 3 || x == 2) {
                    return true;
                }
                --x;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            boolean f = liczba(x);

        System.out.println(f);

    }
}


