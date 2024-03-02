package DataStructure;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Portugal");
        countryNames.add("Brazil");
        countryNames.add("Bangladesh");
        countryNames.add("Caanda");
        countryNames.add("Germany");
        countryNames.addFirst("Korea");
        countryNames.addLast("Japan");
        countryNames.add(3, "Indonesia");
        // countryNames.remove();   //will remove the first element
        // countryNames.remove(5);
        // countryNames.remove("Germany");
        // countryNames.removeFirst();
        // countryNames.removeLast();


        // System.out.println(countryNames);

        //print with for each loop
        for(String country : countryNames) {
            System.out.println(country);
        }

        //size of the linked list using ".size()" method
        System.out.println("Size of the linked list : " + countryNames.size());

        //get element : getFirst(); getLast();
        System.out.println("First element : " + countryNames.getFirst());
        System.out.println("Last element : " + countryNames.getLast());

        countryNames.clear();
        System.out.println(countryNames);

    }
}
