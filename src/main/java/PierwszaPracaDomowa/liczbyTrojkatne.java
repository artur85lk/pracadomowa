package PierwszaPracaDomowa;

import java.util.Scanner;

public class liczbyTrojkatne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int z=1;
        System.out.println("Podaj ile chcesz mieć liczb trojkatnych: ");
        int iloscLiczb = sc.nextInt();


        while ((iloscLiczb + 1) > z) {
            x = (z * (z + 1)) / 2;
            z++;

            System.out.println(x);
        }

    }


}





