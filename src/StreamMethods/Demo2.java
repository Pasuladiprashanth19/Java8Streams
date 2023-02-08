package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> numberlist= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Count()
        Long Evennumbers=  numberlist.stream().filter(num->num%2==0).count();
        System.out.println(Evennumbers);  //5

        //min()
        Optional<Integer>min =numberlist.stream().min((val1, val2)->
        { return val1.compareTo(val2);
        });
        System.out.println(min.get());  //1

        //max()
        Optional<Integer>max =numberlist.stream().max((val1, val2)->
        { return val1.compareTo(val2);
        });
        System.out.println(max.get());  //10

        //reduce

    }
}
