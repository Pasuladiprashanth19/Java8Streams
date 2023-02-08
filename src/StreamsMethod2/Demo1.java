package StreamsMethod2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //sorted()
        List<Integer> list1 = Arrays.asList(3,2,5,1,4,6,7,8,9);
        List<Integer> sortedlist=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        List<Integer> reversesortedlist=list1.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(reversesortedlist); //[9, 8, 7, 6, 5, 4, 3, 2, 1]
        List<String> order=Arrays.asList("jay","ravi","madhu","laxmi");
        List<String>namesortedlist = order.stream().sorted().collect(Collectors.toList());
        System.out.println(namesortedlist);  //[jay, laxmi, madhu, ravi]
        List<String>reversnamesortedlist = order.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(reversnamesortedlist);

        //[ravi, madhu, laxmi, jay]
    }
}
