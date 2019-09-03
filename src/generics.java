import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class generics {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        String s=list.get(0);
        System.out.println(s);

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String i:list){
            System.out.println(i);
        }
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
