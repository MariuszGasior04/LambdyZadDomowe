package pl.altkom.zad03;

import pl.altkom.Gender;
import pl.altkom.Nationality;
import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
Popraw program, tak aby wypisał pisarzy narodowości polskiej
 */
public class PolishMales {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Predicate<Writer> polish = polWriter -> polWriter.getNationality() == Nationality.POLISH;
        Predicate<Writer> male = maleWriter -> maleWriter.getGender() == Gender.MALE;
        Predicate<Writer> polishMale = polish.and(male).negate();
        Consumer<Writer> printer = writer -> System.out.println(writer.toString());
        writers.removeIf(polishMale);
        writers.forEach(printer);

    }
}
