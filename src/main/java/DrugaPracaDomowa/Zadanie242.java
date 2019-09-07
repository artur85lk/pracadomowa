package DrugaPracaDomowa;


import java.math.BigInteger;
import java.util.Scanner;

//wybrana liczba fibonaciego
public class Zadanie242 {

    static long fibonacci (long n) {

        if (n == 0) {
            return 0;
        } else if (n ==1) {
            return 1;
        }else {

            return fibonacci(n-1) + fibonacci(n-2);


        }

        }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long nLiczbaFibonacciego = fibonacci(n);

        System.out.println(n + " liczba Fibonacciego to " + nLiczbaFibonacciego);


    }
}
