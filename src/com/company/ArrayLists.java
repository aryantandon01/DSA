package com.company;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayLists<Integer> list = new ArrayLists<>();     -> You can initialize this like this as well
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(8);

        System.out.println(list);

        // Read
        int x = list.get(2);     // Element at 2nd index
        System.out.println(x);

        // Create
        list.add(2, 6);    // I wanna add 6 at the 2nd index.
        System.out.println(list);

        // Update
        list.set(0, 5);           // Set the 0th index element to 5.
        System.out.println(list);

        // Delete
        list.remove(3);
        System.out.println(list);

        // Size
        int size = list.size();
        System.out.println(size);

        //Looping and Iteration
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size() - 1));

        // Sort
        Collections.sort(list);
        System.out.println(list);
    }
}
