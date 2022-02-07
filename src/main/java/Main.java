import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list=new LinkedList<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(4);
        deque=new ArrayDeque<>();

        System.out.println(deque);

    }
}
