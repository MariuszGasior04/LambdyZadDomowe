package pl.altkom.Example;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Cw1 {
    public static void main(String[] args) {
        System.getProperties().entrySet().forEach(
                entry -> System.out.println(entry.getKey())
        );

        Function<String , String> propertyReader =
                property -> System.getProperty(property);

        Function<String, String> propertyReader2 =
                System::getProperty;

        System.out.println(propertyReader2.apply("user.language"));

        System.getProperties().entrySet().forEach(
                entry -> System.out.println(entry.getKey().toString() +" - "+ entry.getValue().toString())
        );

        BiFunction<String, String, String> propertyReader3 =
                (k,d) -> System.getProperty(k,d);
        BinaryOperator<String> propertyReader4 =
                System::getProperty;
    }
}
