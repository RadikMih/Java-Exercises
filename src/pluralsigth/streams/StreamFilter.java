package pluralsigth.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("four");

        List<String> list = new ArrayList<>();

//        stream
//                .filter(p1) // we can put predicate here directly
//                .forEach(System.out::println);

//        stream
//                .filter(p2.or(p3))
//                .forEach(System.out::println);

        stream
                .peek(System.out::println)
                .filter(p2.or(p3))
                .forEach(list::add);

        System.out.println("Done!");
        System.out.println("size = " + list.size());
    }
}
