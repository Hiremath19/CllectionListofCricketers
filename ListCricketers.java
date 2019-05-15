package Collectionslistcricketers;

// Example to show usage of HashSet, TreeSet
// and HashMap and TreeMap
//import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.*;

public class ListCricketers
{

    public static void main(String args[]) {
        System.out.println("\n*** Show usage of adding memebers to ArrayList individually ***");
        System.out.println("-----------------------------------------------------------------");
        List<String> cricketers = new ArrayList<>();

        cricketers.add("Mayank");
        cricketers.add("Rahul");
        cricketers.add("Pujara");
        cricketers.add("Kohli");
        cricketers.add("Rishabh");
        cricketers.add("Yadav");
        cricketers.add("Bumrah");

        System.out.println("Size of List " + cricketers.size());
        System.out.println("List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

        System.out.println("Get Specific element of List : say 3rd player");
        System.out.println(cricketers.get(2));
        System.out.println();

        System.out.println("Replace Rishabh with Dhoni");
        cricketers.set(4, "Dhoni");
        System.out.println("Updated List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

        System.out.println("Remove Rahul thru Index");
        cricketers.remove(1);
        System.out.println("Size of Updated List " + cricketers.size());
        System.out.println("Updated List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

        System.out.println("Remove Yadav thru Object");
        cricketers.remove("Yadav");
        System.out.println("Size of Updated List " + cricketers.size());
        System.out.println("Updated List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

        System.out.println("Sort the List");
        Collections.sort(cricketers);
        System.out.println("Size of Sorted List " + cricketers.size());
        System.out.println("Sorted List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

        System.out.println("clear the List");
        cricketers.clear();
        System.out.println("Size of Updated List " + cricketers.size());
        System.out.println("Updated List of Indian Cricketrers : \n" + cricketers);
        System.out.println();

    }

}