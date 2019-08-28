package PierwszaPracaDomowa;

import java.util.Scanner;

public class zadanie2 {
    static String dzienTygodnia(int x) {

        if (x == 0) {
            return "poniedziałek";
        }
        if (x == 1) {
            return "wtorek";
        }
        if (x == 2) {
            return "sroda";
        }
        if (x==3) {
            return "czwartek";
        }
        if (x==4) {
            return "piatek";
        }
        if (x==5) {
            return "sobota";
        }
        if (x==6) {
            return "niedziela";

        } else
        return "to nie jest dzien tygodnia";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj nr dnia tygodnia od 0 ");
        int x = sc.nextInt();
        String f = dzienTygodnia(x);

        System.out.println(f);
    }
}


