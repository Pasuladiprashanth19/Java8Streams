package FilterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Sky",null,"forest",null,"cup",null,"book");
        List<String> result = words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(result);
    }
}
