import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args){
        String[] ss=new String[]{"a","r","t"};
        List list= Arrays.asList(ss);


        List<Student> list1=Arrays.asList(new Student("11","tom"),new Student("22","god"));

        Collections.sort(list);
        System.out.println(list1);
        Comparator<Student> c=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -1;
            }
        };
    }
}
