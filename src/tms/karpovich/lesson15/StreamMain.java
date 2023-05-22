package tms.karpovich.lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 10, 50, 3);
        Stream<Integer> valuesStream = values.stream();
        Stream<String> stream = Stream.of("A","B","C");
        Stream<String> myRows = Files.lines(Paths.get("file.txt"));
        Stream<Integer> firstStream = Stream.iterate(0, n -> n = n + 1);
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(100));
        Stream<List<Integer>> listStream = Stream.of();

        List<Integer> result = valuesStream
                .skip(2)
                .limit(3)
                .distinct()
                .peek(x -> System.out.println(x))
                .sorted((o1,o2) -> o2.compareTo(o1))
                .filter(val -> val%2 == 0)
                .map(x -> x*x)
                .collect(Collectors.toList());
        listStream.flatMap(Collection::stream).allMatch(x -> x >3);//.findFirst().orElseThrow();//.max((o1, o2) -> o1.compareTo(o2)).orElseThrow();//.count();//.collect(Collectors.toSet());
        valuesStream
                .skip(2)
                .limit(3)
                .distinct()
                .peek(x -> System.out.println(x))
                .sorted((o1,o2) -> o2.compareTo(o1))
                .filter(val -> val%2 == 0)
                .map(x -> x*x)
                .forEach(x -> System.out.println(x));
//                .reduce((a,b) -> a*b);
    }
}
