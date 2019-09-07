package DrugaPracaDomowa;

import java.util.Scanner;
// suma Nieparzystych
public class Zadanie24 {
    static int sumaNieparzystych(int n){
        int liczbyNieparzyste = 1;
        int suma = 0;
        for(int i = 0; n > i; i++) {

            suma = suma + liczbyNieparzyste;
            liczbyNieparzyste+= 2;

        }
        return suma;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj ile kolejnych ilczb nieparzystych chcesz zsumować ");
        int n =sc.nextInt();
        int suma = sumaNieparzystych(n);
        System.out.println("suma " + n + " kolejnych liczb to " + suma);
    }


}
