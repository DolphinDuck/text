/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loop_ll;
 import java.util.*;
        
public class Loop_LL {

    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means there is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;
 
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
 
            h = h.next;
        }
 
        return false;
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
 
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
 
        if (detectLoop(llist.head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}

