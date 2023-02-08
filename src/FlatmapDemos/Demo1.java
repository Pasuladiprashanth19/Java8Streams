package FlatmapDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        //map()
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer>list2=list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list2); //[11, 12, 13, 14, 15, 16]

        //Flatmap()
        List<Integer> lst1= Arrays.asList(1,2);
        List<Integer> lst2= Arrays.asList(3,4);
        List<Integer> lst3= Arrays.asList(5,6);
       List< List<Integer>> Finallist= Arrays.asList(lst1,lst2,lst3);
       List<Integer> FinalResult=Finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());

        System.out.println(FinalResult); //[1, 2, 3, 4, 5, 6]
        List<Integer> FinalResult1  =Finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(FinalResult1);            //[11, 12, 13, 14, 15, 16]
}
}