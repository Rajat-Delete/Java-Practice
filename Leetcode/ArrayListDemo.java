import java.sql.Array;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        list.add(10);
        newList.add(20);
        list.add(30);
        newList.add(40);
        list.add(50);
        newList.add(60);
        list.forEach(value -> System.out.println(value));
        System.out.println("Size of the List is "+list.size());
        System.out.println("Is List Empty ?" + list.isEmpty());
        System.out.println("Does List Contains 10 ?" + list.contains(10));
        System.out.println("Converted List to Array of Objects "+list.toArray());
        System.out.println("New List"+list.addAll(newList));
        System.out.println("List equals or not "+list.equals(newList));
        System.out.println(list.remove(Integer.valueOf(10)));
        list.clear();
        System.out.println("Done");

        //Iterator<Integer> iterator = list.iterator();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
        //list.forEach(val-> System.out.println(val));





    }
}
