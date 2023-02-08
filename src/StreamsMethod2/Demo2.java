package StreamsMethod2;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruits=  new HashSet<String>();
        fruits.add("one apple");
        fruits.add("one banana");
        fruits.add("two mango  ");
        fruits.add("more apple");

        //Anymatch

       Boolean result= fruits.stream().anyMatch(value->{ return value.startsWith("one"); });
        System.out.println(result);//true

        //allmatch
        result= fruits.stream().allMatch(value->{ return value.startsWith("one"); });
        System.out.println(result);//false

        //none match
        result= fruits.stream().noneMatch(value->{ return value.startsWith("one"); });
        System.out.println(result); //false





    }
}
