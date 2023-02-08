package FilterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
      /*  ArrayList<Integer> numbersList = new ArrayList<Integer>();

        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);
        numbersList.add(35);
        */


        List<Integer> NumbersList = Arrays.asList(10,20,25,30,35);
        List<Integer> evenNumbersList =new ArrayList<>();

        //without using Streams
        /*for (int n:NumbersList) {
           /* if(n%2==0) {
                evenNumbersList.add(n);
            }
            System.out.println(evenNumbersList);


        }*/
        //with streams
      /* evenNumbersList= NumbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList); op{10 ,20,30]



        */
       // NumbersList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        NumbersList.stream().filter(n->n%2==0).forEach(System.out::println);
        //op10
        //20
        //30

          }


}
