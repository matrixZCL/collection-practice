import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args){
        Set<String> s=new java.util.LinkedHashSet<>();//HashSet子类，维护添加顺序
        s.add("one");
        s.add("two");
        s.add("Three");

        for(String str :s){
            System.out.println(str);
        }
    }



}
