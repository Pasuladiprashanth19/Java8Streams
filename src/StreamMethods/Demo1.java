package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 //Non Terminal //processing methods
//distinct()
//limit()

//Terminal
//count()
//foreach()



public class Demo1 {
    public static void main(String[] args) {


        List<String> vechilelist= Arrays.asList("car","bike","bycyle","bus","car","bike","bycyle","bus");
        //Distinct()
      //  List<String>distinctvechile= vechilelist.stream().distinct().collect(Collectors.toList());
      //  System.out.println(distinctvechile); //[car, bike, bycyle, bus]
        vechilelist.stream().distinct().forEach(value-> System.out.println(value));
                         /* op car
                         bike
                         bycyle
                          bus*/
        //Count()
        long count=    vechilelist.stream().distinct().count();
        System.out.println(count);//4


        //limit()

      List<String> Limitedvechiles=  vechilelist.stream().limit(3).collect(Collectors.toList());
        System.out.println("limitedvechiles"+Limitedvechiles); //limitedvechiles[car, bike, bycyle]

            vechilelist.stream().limit(5).forEach(vslue-> System.out.println(vslue));
    }

}
