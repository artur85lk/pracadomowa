package PierwszaPracaDomowa;

import java.util.Scanner;

public class zadanie5 {
    static double oblicz(double waga, double wzrost){
        double wynik = waga / Math.pow((wzrost/100), 2);

        return wynik;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj wage w kg");
        double waga = sc.nextDouble();

        System.out.println("podaj wzrost w cm");
        double wzrost = sc.nextInt();

        double bmi =oblicz(waga, wzrost);

        System.out.println("to jest Twoje BMI: " + String.format("%.2f", bmi));
    }
}
// czy widać mnie w github 15.43