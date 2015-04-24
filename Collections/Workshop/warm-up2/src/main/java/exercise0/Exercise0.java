package exercise0;

import java.util.HashMap;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 *          print all its elements.
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughMap(){

        // TODO Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        HashMap<Integer,String> myHash = new HashMap<Integer, String>();
        myHash.put(1,"Fotbal");
        myHash.put(2,"Basket");
        myHash.put(3,"Volei");
        // TODO Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map

        // TODO Exercise #0 b) Iterate over the Map using keySet() method and print all its elements

        for (Integer key : myHash.keySet()) {
            System.out.println("key=" + key);
        }
        // TODO Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]
        for (Integer key : myHash.keySet()) {
            System.out.println("key=" + myHash.get(key));
        }
        
    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}