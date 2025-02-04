package Day_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("The Alchemist");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Moby Dick");
        books.add("Pride and Prejudice");

        books.remove("1984");
        System.out.println(books.contains("The Alchemist"));
        System.out.println(books.contains("Monkey bar"));

        Iterator<String> book = books.iterator();
        while(book.hasNext()){
            System.out.println(book.next());
        }

        Collections.reverse(books);

        System.out.println(books.size());

    }

}
