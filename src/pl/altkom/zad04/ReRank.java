package pl.altkom.zad04;

import pl.altkom.Gender;
import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/*
Popraw program, aby wypisał pisarzy z zaktualizowaną oceną:
- mężczyznom odejmij punkt
- kobietom dodaj punkt
 */
public class ReRank {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Consumer<Writer> printer = print -> System.out.println(print.toString());
        UnaryOperator<Writer> updater = writer -> {
            if(writer.getGender() == Gender.MALE){
                writer.setRank(writer.getRank()-1.0);
            }else{
                writer.setRank(writer.getRank()+1.0);
            }
            return writer;
        };
        writers.replaceAll(updater);
        writers.forEach(printer);
    }
}
