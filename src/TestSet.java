import java.util.*;

public class TestSet {
    public static void main(String[] args){
        Set<String> s=new HashSet<>();//无序没有重复元素
        s.add("one");
        s.add("two");
        s.add("three");
        //s.add("one");

        System.out.println(s.size());

        List<Student> ss=new ArrayList<>();
        ss.add(new Student("1","dog"));
        ss.add(new Student("2","pig"));

        print0(s);
//        print0(ss);

        print(s);
        print(ss);
    }




    static void print0(Collection<String> c){
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }

    static<T> void print(Collection<T> c){
        Iterator<T> it=c.iterator();
        while(it.hasNext()){
            T t=it.next();
            System.out.println(t);
        }
    }
}
