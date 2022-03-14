package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        GenericValue<Integer> gv = new GenericValue<>();

        System.out.println(gv.getMethod(arrayList, scanner.nextInt()));
    }
}



class GenericValue <V>{
    private V value1;
    private V value2;

    public GenericValue(V value1, V value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public GenericValue(){}
    public V getValue1(){
        return value1;
    }
    public V getValue2(){
        return value2;
    }
    public void setValue2(V value2) {
        this.value2 = value2;
    }
    public void setValue1(V value1) {
        this.value1 = value1;
    }
    public String getString(V value1, V value2){
        return "value 1 = " + value1 + " value 2 = " + value2;
    }

    public V getMethod(List<V> arrayList, int value){
        return arrayList.get(value);
    }

}