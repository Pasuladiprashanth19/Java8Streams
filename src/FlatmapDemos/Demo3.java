package FlatmapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Student{
    String sname;
    int sid;
    char grade;
    Student(String sname,int sid,char grade){
        this.sname= sname;
        this.sid=sid;
        this.grade= grade;

    }

}
public class Demo3 {
    public static void main(String[] args) {

        List<Student> studentlist1= new ArrayList<Student>();
        studentlist1.add(new Student("sai",101,'A'));
        studentlist1.add(new Student("shiva",102,'B'));
        studentlist1.add(new Student("satwik",103,'C'));


        List<Student> studentlist2= new ArrayList<Student>();
        studentlist2.add(new Student("ravi",104,'A'));
        studentlist2.add(new Student("raju",105,'B'));
        studentlist2.add(new Student("ramesh",106,'C'));

        List<List<Student>> studentlist = Arrays.asList(studentlist1,studentlist2);

        //Before java8
       /* for (List<Student>stu:studentlist)
        {
            for (Student s :stu){
            System.out.println(s.sname); /* op :sai
                shiva
                        satwik
                ravi
                        raju  ramesh
        }} */
        // Using Streams flatmap()

     List<String>namelist =  studentlist.stream().flatMap(stulist->stulist.stream()).
             map(slist->slist.sname).collect(Collectors.toList());
        System.out.println(namelist);  //[sai, shiva, satwik, ravi, raju, ramesh]
    }
}
