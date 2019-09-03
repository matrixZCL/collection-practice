import java.util.ArrayList;
import java.util.List;

public class Generics2 {
    public static void main(String[] args){
        List<Object> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<Number> list3=new ArrayList<>();
        List<Integer> list4=new ArrayList<>();
        List<Double> list5=new ArrayList<>();
        List<Comparable> list6=new ArrayList<>();
//        print(list1);
//        print(list2);
//        print(list3);
//        print(list2);
//        print(list2);
//        print(list2);

//        copy(new Object[]{},11);
//        copy(new String[]{},22);
//        copy(new Number[]{},22);


    }
    //泛型的通配符,? 只能用extends，不能用implement  ？super A 表示A或A父类
//    static void print(List<? extends  Number> list){
//
//    }

    static <T extends Number & Comparable> void copy(T[] os,List<T> list){
        for(T o:os){
            list.add(o);
        }
    }

    static <T,S> void m(T t,S s){}
    static <T,S extends T> void m2(T t,S s){}
}
