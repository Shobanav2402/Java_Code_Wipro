package Day_3;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jasmine");
        list.add("Tulip");
        list.add("orchids");
        list.add("Sunflower");
        System.out.println(list.get(0));
        System.out.println(list.get(3));

        list.set(0,"Lavender");

        list.remove(3);

        System.out.println(list.size());

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
