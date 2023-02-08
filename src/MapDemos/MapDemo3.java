package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int empsalaray;
    Employee(int empid,String empname,int empsalaray)
    {
        this.empid =empid;
        this.empname=empname;
        this.empsalaray=empsalaray;
    }
}
public class MapDemo3 {
    public static void main(String[] args) {

    /*    List<Employee>emplist =new ArrayList<Employee>();
        emplist.add(new Employee(101,"Brain",10000));
        emplist.add(new Employee(102,"charles,20000));
        emplist.add(new Employee(103,"David",30000));
        emplist.add(new Employee(104,"Edward",40000));
        emplist.add(new Employee(105,"Alex",50000));
        */
        //we can also write directly

        List<Employee>employeeList= Arrays.asList(new Employee(101,"Alex",10000),

                new Employee(102,"Brain",20000),
                new Employee(103,"charles",30000),
                new Employee(104,"David",40000),
                new Employee(105,"Edward",50000)
                 );

            List<Integer>EmpSallist=employeeList.stream().
                filter(e->e.empsalaray>20000)//Filtering
                .map(e->e.empsalaray)
                .collect(Collectors.toList());
                System.out.println(EmpSallist);
    }
}
