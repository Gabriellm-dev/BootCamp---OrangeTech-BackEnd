package collections.streamapi;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "10", "9", "3", "4", "5", "6", "8");

        System.out.println("Imprima todos os elementos dessa lista de string: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 ultimos primeiro e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaiores = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .toList();
        System.out.println(listParesMaiores);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova todos os números impares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> (integer%2 !=0));
        System.out.println(numerosAleatoriosInteger);












    }
}