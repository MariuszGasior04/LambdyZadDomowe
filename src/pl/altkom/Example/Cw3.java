package pl.altkom.Example;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class Cw3 {
    public static void main(String[] args) {
        Date  d = new Date();
        System.out.println(d);

        Supplier<Date> dateGenerator =
                Date::new;

        Function<Long, Date> dateGenerator2 =
                Date::new;

    }

}
