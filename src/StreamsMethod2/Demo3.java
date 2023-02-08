package StreamsMethod2;
//find any

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//find first
public class Demo3 {
    public static void main(String[] args) {
        List<String> animallist=Arrays.asList("dog","cat","peacock");
        List<String> birdslist= Arrays.asList("peacock","parrpt","crow");

        Stream<String> stream1 = animallist.stream();
        Stream<String>steam2 = birdslist.stream();

        List<String> result = Stream.concat(stream1,steam2).collect(Collectors.toList());
        System.out.println(result); //dog, cat, peacock, peacock, parrpt, crow]

    }
}
