package FlatmapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("sai","ravi","raghu");
        List<String> teamB = Arrays.asList("shiva","sunny","deepu");
        List<String> teamC = Arrays.asList("satwik","ramesh","raju");


        List<List<String>>PlayersinWorldcup = new ArrayList<List<String>>();

        PlayersinWorldcup.add(teamA);
        PlayersinWorldcup.add(teamB);
        PlayersinWorldcup.add(teamC);
        //befor java8
        /*for (List<String> team:PlayersinWorldcup){
            for ( String name: team)
            {
                System.out.println(name);   //sai ravi raghu shiva sunnydeepu satwik ramesh raju
            }

        }*/

        //Using streams Flatmap()
       List<String> names=PlayersinWorldcup.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(names); //[sai, ravi, raghu, shiva, sunny, deepu, satwik, ramesh, raju]

    }
}
