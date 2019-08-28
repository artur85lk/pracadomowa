package PierwszaPracaDomowa;

import java.util.Scanner;

public class zadanie3 {
    static int jakidzien(int dzienTygodnia, int liczba) {
        if ((dzienTygodnia + liczba)%7==0) {
            return dzienTygodnia;
        }
        if ((dzienTygodnia + liczba) > 7) {

            int z = (dzienTygodnia + liczba) % 7;
            return z;
        } else {
            int r = dzienTygodnia + liczba;
            return r;
        }
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("podaj dzień tygodnia ");
            int dzienTygodnia = sc.nextInt();

            System.out.println("podaj liczbe ");
            int liczba = sc.nextInt();

            jakidzien(dzienTygodnia, liczba);
            int dzienPoXDniach = jakidzien(dzienTygodnia, liczba);


            System.out.println(dzienPoXDniach + " dzień tygodnia");
        }

    }
