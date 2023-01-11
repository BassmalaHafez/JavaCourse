package oop;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        //Linked list declaration
        LinkedList<String> linkedList = new LinkedList<String>();
        //Add Linked list
        linkedList.add("Item1");
        linkedList.add("Item4");
        linkedList.add("Item2");
        linkedList.add("Item3");

        System.out.println("Linked List contents " + linkedList);
            // add first and last items to linked list
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");

        System.out.println("Linked List content after adding new items " + linkedList);


        Object firstVar = linkedList.get(2);
        System.out.println("First Element " + firstVar);
//updating linkedlist
        linkedList.set(0, "Changed first item");
        Object secondVar = linkedList.get(0);
        System.out.println("First Element " + secondVar);
//Remove first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last " + linkedList);
// Add to position and remove from position
        linkedList.add(0 , "New Item");
        linkedList.remove(2);
        System.out.println("Final Content of linked list is " + linkedList);






    }
}
