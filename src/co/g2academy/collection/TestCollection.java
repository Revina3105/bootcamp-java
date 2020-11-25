package co.g2academy.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Revina");
        list.add("Vina");
        list.add("Revina");
        list.add("Utami");

        // cara 1
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //enhanced loop
        for(String element: list) {
            System.out.println(element);
        }

        //iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
