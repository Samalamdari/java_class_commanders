package week_6.day_2.topics;

public class ProsAndConsOfLinekdList {

      /*
    *
    * Pros:

    Dynamic Sizing:
        Unlike arrays which have a fixed size once declared, LinkedList can grow or shrink in size dynamically as elements are added or removed.
        *  You don't have to handle resizing manually or worry about exceeding the capacity.

    Efficient Insertions/Deletions:
        Adding or removing elements from the beginning or middle of a LinkedList can be done in constant time O(1)O(1) if you have a reference to the
        *  (e.g., through an iterator). This is particularly efficient compared to structures like ArrayList, which might need to shift elements
        *  during such operations.

    Double-Ended Operations:
        LinkedList in Java implements the Deque (double-ended queue) interface, allowing it to efficiently add or remove elements from both ends.
        * This makes it versatile as both a stack and a queue.


    Cons:

    Memory Overhead:
        Each element in a LinkedList is wrapped in a node which has the overhead of two references (for next and previous nodes).
        * This makes it more memory-intensive than simple array-backed structures like ArrayList.

    Sequential Access:
        Random access, like fetching the nth item in the list, is O(n)O(n) because you may have to traverse from the start (or end) to
        * reach the desired position.
        * In contrast, array-backed lists provide constant time O(1)O(1) random access.

    Not Cache-Friendly:
        Due to its non-contiguous memory allocation, LinkedList doesn't utilize cache memory efficiently. Modern CPUs benefit from data locality,
        * and array-backed structures like ArrayList can often be faster for certain operations due to better cache coherence and less cache misses.
    *
    * */


}
