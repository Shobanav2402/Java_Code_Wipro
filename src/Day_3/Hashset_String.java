package Day_3;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_String {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("chennai");
        city.add("bangalore");
        city.add("Hyderabad");
        city.add("Mumbai");
        city.add("Pune");
        city.add("Bangalore");
        city.add("chennai");

        System.out.println("Display the city names without Duplicates");
        Iterator<String> itr = city.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---Checking the city chennai existing in the set = "+ city.contains("chennai")+"---");

        city.remove("Pune");

        System.out.println("---After removing the city pune the updated list---");

        Iterator<String> itr1 = city.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }

}
