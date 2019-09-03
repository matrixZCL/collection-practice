import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class TestMap {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"dog");
        map.put(2,"pig");
        map.put(3,"tiger");

        for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }
        System.out.println(map);

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("pig"));

        Set<Integer> key=map.keySet();
        System.out.println(key);
        //实现forEach接口遍历
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+s);
            }
        });
    }



}
