package java21;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollection {
    public static void main(String[] args) {
        //introduced AddFirst and AddLast methods
        List<String> list = new ArrayList<>();
        list.addLast("Sathya");
        list.addLast("Priya");
        //getFirst and getLast
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
