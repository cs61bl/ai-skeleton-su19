/**
 * An SLList is a list of integers, which encapsulates the
 * naked linked list structure.
 */
public class SLList {

    /** 
     * IntListNode is a nested class that represents a single node in the
     * SLList, storing an item and a reference to the next IntListNode.
     */
    private static class IntListNode {
        /* 
         * The access modifiers inside a private nested class are irrelevant:
         * both the inner class and the outer class can access these instance
         * variables and methods.
         */ 
        public int item;
        public IntListNode next;

        public IntListNode(int item, IntListNode next) {
            this.item = item;
            this.next = next;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private IntListNode sentinel;
    private int size;

    /** Creates an empty SLList. */
    public SLList() {
        sentinel = new IntListNode(42, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntListNode(42, null);
        sentinel.next = new IntListNode(x, null);
        size = 1;
    }

    /** Returns an SLList consisting of the given values. */
    public static SLList of(int... values) {
        SLList list = new SLList();
        for (int i = values.length - 1; i >= 0; i -= 1) {
            list.addFirst(values[i]);
        }
        return list;
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntListNode(x, sentinel.next);
        size += 1;
    }

    /** Return the value at the given index. */
    public int get(int index) {
        IntListNode p = sentinel.next;
        while (index > 0) {
            p = p.next;
            index -= 1;
        }
        return p.item;
    }

    /** Adds x to the list at the specified index. */
    public void add(int index, int x) {
        // TODO
    }

    /** Returns the reverse of this list. This method is destructive. */
    public void reverse() {
        // TODO
    }
}

