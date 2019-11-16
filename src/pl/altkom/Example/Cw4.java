package pl.altkom.Example;


import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Cw4 {

    private static int fib(int n){
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    private static IntPredicate isPrime = n-> {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    };

    private static IntSupplier primesGenerator2 = new IntSupplier() {
        int a = 1;
        @Override
        public int getAsInt() {
            do{
                a++;
            }while(!isPrime.test(a));
            return a;
        }
    };

    public static  int countSum(IntFunction<Double> f){
        int sum =  0;
        for(int i = 0; fib(i)<= 100; i++){
            sum += f.apply(fib(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countSum( x -> (double)x));
        System.out.println(countSum( x -> (double)x*x));
        System.out.println(countSum( x -> (double)x*x*x));
        System.out.println(countSum(Math::sqrt));
    }
}
