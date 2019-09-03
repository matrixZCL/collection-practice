import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.addFirst("x");
        list.forEach(System.out::println);
        list.remove(3);
        list.forEach(System.out::println);
        list.removeLast();
        list.removeFirst();
        list.addLast("a");
    }
}
