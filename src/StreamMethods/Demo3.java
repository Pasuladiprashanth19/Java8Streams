package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("A","B","C","1","2","3");

        //Reduce()
       Optional<String> list=stringList.stream().reduce((value, combinevalu)-> {return combinevalu+value;
    });
        System.out.println(list.get()); //321CBA
    }
}
