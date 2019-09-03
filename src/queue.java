import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        //System.out.println(queue.peek());

        String s1=queue.poll();
        String s2=queue.poll();
        String s3=queue.poll();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(queue.size());
    }
}
