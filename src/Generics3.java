public class Generics3 {
    public static void main(String[] args){
        MyClsas<String> m1=new MyClsas<>();
        MyClsas<Integer> m2=new MyClsas<>();
    }
}

class MyClsas<T>{
    public void method(T t){

    }

    public T method2(){
        return null;
    }
}

class MyArrayList<T>{
    private T[] os;
    private int index;
    public void add(T t){}

}