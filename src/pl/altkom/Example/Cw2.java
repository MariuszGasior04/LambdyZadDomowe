package pl.altkom.Example;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Cw2 {
    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier randomGenerator1 =
                () ->random.nextInt();

        IntSupplier randomGenerator2 =
                random::nextInt;

        IntUnaryOperator randomGenerator3 =
                random::nextInt;

    }
}
