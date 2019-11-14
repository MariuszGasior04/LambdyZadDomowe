package pl.altkom.zad01;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/*
    Stwórz obiekt klasy IntSupplier, który będzie generował kolejne liczby pierwsze
    Oczekiwanym wyjściem z poniższego programu powinno byc:
    2
    3
    5
    7
    11
    13
    17
    19
    23

    Hint: Rozwiązanie z wykorzystaniem wyrażenia lambda jest trikowe i nieoczywiste, spróbuj inaczej
    Hint: Stwórz pomocniczy predykat, który wykorzystasz do sprawdzenia, czy liczba jest pierwsza
 */


public class Primes {


        public boolean test(int number){
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        IntSupplier primesGenerator = null;
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
    }
}
