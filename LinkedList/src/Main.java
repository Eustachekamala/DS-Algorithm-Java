import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
         * LinkedList = stores Node in 2 parts (data + address)
         *              Nodes are in non-consecutive memory locations
         *              Elements are linked using pointers
         *
         *                    **Singly Linked List**
         *         Node               Node                  Node
         *  [data | address] ->  [data | address] ->  [data | address]
         *
         *
         *                    **Double Linked List**
         *          Node                |                 Node
         *  [address | data | address]  <-> [address | data | address]
         *
         *     advantages:
         *          1. Dynamic Data Structure (allocates needed memory while running)
         *          2. Insertion and Deletion of Nodes is easy. O(1)
         *          3. No/Low Memory waste
         *
         *     disadvantages:
         *          1. Greater memory usage (additional pointer)
         *          2. No random access of elements (no index [i])
         *          3. Accessing/searching elements is more time consuming. O(n)
         *
         *     uses?
         *          1. implement Stacks/Queues
         *          2. GPS navigation
         *          3. music playlist
         */
        LinkedList<String> list = new LinkedList<>();
        list.push("A");
        list.push("B");
        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list.peekFirst());
        System.out.println(list);
    }
}