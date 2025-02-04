package Day_3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntegers {
    public static void main(String[] args) {
        
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(24);
    arr.add(10);
    arr.add(05);
    arr.add(29);
    arr.add(18);

    arr.remove(2);
    arr.set(1,11);

    Iterator<Integer> itr = arr.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }

    }
}
