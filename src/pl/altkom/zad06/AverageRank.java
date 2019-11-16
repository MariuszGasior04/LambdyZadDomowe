package pl.altkom.zad06;

import pl.altkom.Writer;

import java.util.List;
import java.util.OptionalDouble;

/*
Popraw poniższy program, aby wypisał średnią (arytmetyczną) ocen wszystkich pisarzy (kobiet i mężczyzn)
Function<Writer, Double> rank = writer -> writer.getRank()
 */

public class AverageRank {

    public static double getAverageRank(List<Writer> writers) {
        OptionalDouble avg = writers.stream()
                .mapToDouble(writer -> writer.getRank())
                .average();

        return avg.getAsDouble();
        /*
        double sum = 0.0;
        for (Writer writer : writers) {
            sum += writer.getRank();
        }
            double avgRank = sum/writers.size();
            return avgRank;
            */
        }

    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        System.out.println(getAverageRank(writers));
    }
}
