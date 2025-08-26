import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,20));
        Collections.rotate(list,3);
        System.out.println(list);
        Collections.unmodifiableCollection(list);
    }
}
