package MapDemos;

import java.util.Arrays;
import java.util.List;

public class MapDEmo2 {
    public static void main(String[] args) {
        List<String> vechiles = Arrays.asList("bus","car","bicyclce","flight","train");
        //Without Using streams before java
       /* for (String name:vechiles
             )
        {
            System.out.println(name.length());

        }*/
        //Using streams map

        vechiles.stream().map(vname->vname.length()).forEach(len-> System.out.println(len));
    }
}
