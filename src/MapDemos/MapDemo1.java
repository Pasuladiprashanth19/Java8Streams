package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vechiles = Arrays.asList("bus","car","bicyclce","flight","train");
        List<String> vechilesListtoUpperCase = new ArrayList<String>();
        //without using streams//before java8
       /* for (String name:vechiles)
        {
            vechilesListtoUpperCase.add(name.toUpperCase());
        }*/

        //Using Streams -map
        vechilesListtoUpperCase=vechiles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vechilesListtoUpperCase);

    }
}
