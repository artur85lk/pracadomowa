package DrugaPracaDomowa;


import java.util.Scanner;

//Kalkulator konsolowy *
public class Zadanie23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int i = 1;
while (i < 2) {

    System.out.println("Podaj dwie liczby i znak");
    int x = sc.nextInt();
    int y = sc.nextInt();
    String zznak = sc.nextLine();  // nie wiem, ale bez tego nie dziala
    String rodzajDzialania = sc.nextLine();

    if ("+".equals(rodzajDzialania)) {
        System.out.println(x + y);
    } else if ("-".equals(rodzajDzialania)) {
        System.out.println(x - y);

    } else if ("*".equals(rodzajDzialania)) {
        System.out.println(x * y);

    } else if ("/".equals(rodzajDzialania)) {
        System.out.println(x / y);

    } else {
        System.out.println("Error");
        break;
    }

}


    }

}







