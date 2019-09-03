import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
//        System.out.println(list.size());
//        System.out.println(list.contains("ab"));
//        System.out.println(list.contains("a"));
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));
//        System.out.println(list.indexOf("b"));
//        System.out.println(list.lastIndexOf("a"));
        //只能遍历list不能遍历set，set没有下标
//        for(int i=0;i<list.size();i++){
//            Object o=list.get(i);
//            String s=(String) o;
//            System.out.println(s.toUpperCase());
//        }
//        for(int i=0;i<list.size();i++){
//            if("a".equals(list.get(i))){
//                list.remove(i);
//                continue;
//            }
//        }
//        System.out.println(list.size());

//        //迭代器遍历，遍历任何Collection
//        Iterator it= list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        //可以遍历数组和集合
//        for(Object o:list){
//            System.out.println(o);
//        }
//        list.forEach(new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println(o);
//            }
//        });

        list.forEach(System.out::println);



    }
}
