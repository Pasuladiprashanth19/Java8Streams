package FilterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Malvika","prashanth","ravikrishna","prasanna");
        List<String> hugenames = new ArrayList<String>();
       /*hugenames = names.stream().filter(str->str.length()>6 && str.length()<9).collect(Collectors.toList());
        System.out.println(hugenames); //op [Malvika, prasanna]
        */
        //names.stream().filter(str->str.length()>6 && str.length()<9).forEach(str-> System.out.println(str));
        names.stream().filter(str->str.length()>6 && str.length()<9).forEach(System.out::println);
    }
}
