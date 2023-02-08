package ParallelStreams;

import java.util.Arrays;
import java.util.List;

class  student{
    String sname;
    int score;
    student(String sname,int score) {
        this.sname = sname;
        this.score = score;
    }
    public String getSname(){
        return this.sname;
    }

    public int getScore() {
        return this.  score;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        List<student> studentList= Arrays.asList(
                new student("ravi",90),
                new student("rahul",70),
                new student("deepu",80),
                new student("raju",82),
                new student("sai",60),
                new student("ramu",65)
        );
        //using streams--sequentially

        studentList.stream().filter(stu->stu.getScore()>=80)
                .limit(3)
                .forEach(s-> System.out.println(s.getSname()+" "+ s.getScore()));/*ravi 90
        deepu 80
        raju 82*/

        //using parallel
        studentList.parallelStream().filter(stu->stu.getScore()>=80)
                .limit(3)
                .forEach(s-> System.out.println(s.getSname()+" "+ s.getScore()));
    }
}
