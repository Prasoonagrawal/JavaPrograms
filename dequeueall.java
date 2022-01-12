package prasoon.odessa;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueall {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();//array help us to create resizable array
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
