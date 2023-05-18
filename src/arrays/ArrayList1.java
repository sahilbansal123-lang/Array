package arrays;
//            ArrayList: class is a resizable array, which can be found in the java.util package.

import java.util.ArrayList;
import java.util.Collections;

//                       The difference between a built-in array and an ArrayList in Java, is that the size of an array
//                       cannot be modified (if you want to add or remove elements to/from an array, you have to create
//                       a new one). While elements can be added and removed from an ArrayList whenever you want.
//                       The syntax is also slightly different:
//
//                         Declare an ArrayList of different Types
//                            1. Add Element
//                            2. Get Element
//                            3. Add Element at a specific Index
//                            4. Set Element at a specific Index
//                            5. Delete Element from an Index
//                            6. Size of the List
//                            7. Loop/Iterate on the List
//                            8. Sort the List



public class ArrayList1 {
    public static void main(String[] args) {

          ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);


        //add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);


        //set element
        list.set(0,0);
        System.out.println(list);


        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);


        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

    }
}
