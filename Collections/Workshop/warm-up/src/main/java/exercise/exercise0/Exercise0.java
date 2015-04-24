package exercise.exercise0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0() {

    }

    public void iterateThroughList() {

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        // TODO Exercise #0 a) Hint: Don't forget to specify the type of the list (Integer, String etc.)

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("mere");
        arrayList.add("pere");
        arrayList.add("portocale");
        arrayList.add("ananas");

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(1);


        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements


        ListIterator iteratorL = linkedList.listIterator();

        System.out.print("LinkedList-ul genereat cu ListIterator  este: " );
        while (iteratorL.hasNext()) {

                    System.out.print(iteratorL.next() + ",");
        }

        System.out.print("\n\n" );

        ListIterator iteratorA = arrayList.listIterator();
        System.out.print("ArrayList-ul genereat cu ListIterator este: " );
        while (iteratorA.hasNext()) {

            System.out.print(iteratorA.next()+",");
        }
        System.out.print("\n\n " );
// TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        System.out.print("ArrayList-ul genereat cu for loop este: " );
        for(int i = 0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) +",");
        }

        System.out.print("\n\n" );

        System.out.print("LinkedList-ul genereat cu for loop este: " );
        for(int i = 0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i) +",");
        }
        System.out.print("\n\n" );
// TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements

        System.out.print("ArrayList-ul genereat cu forech loop este: " );

        for(String i : arrayList )
            System.out.print(i + ",");
        System.out.print("\n\n" );


        System.out.print("LinkedList-ul genereat cu forech loop este: " );

        for(Integer i : linkedList )
            System.out.print(i + ",");
        System.out.print("\n\n" );
//        while (arrayList.iterator().hasNext())
//            System.out.println(arrayList.iterator().next());
    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 ex = new Exercise0();
        ex.iterateThroughList();

    }

}
