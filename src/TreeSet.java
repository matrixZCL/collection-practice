import java.util.*;

public class TreeSet {
    public static void main(String[] args){
//        Set<String> s=new java.util.TreeSet<>();//维护集合顺序
//        s.add("one");
//        s.add("two");
//        s.add("three");
//
//        for(String str:s){
//            System.out.println(str);
//        }
        List<Student> list=new ArrayList<>();
        list.add(new Student("1","tom"));
        list.add(new Student("3","jin"));
        list.add(new Student("2","linda"));
//        Comparator<Student> c=new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//               return Integer.parseInt(o1.getId())-Integer.parseInt(o2.getId());
//            }
//        };
//        Collections.sort(list,c);
//
//        for(Student s : list){
//            System.out.println(s.toString());
//        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.parseInt(o1.getId())-Integer.parseInt(o2.getId());
            }
        });
    }
}
