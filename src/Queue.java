import javax.swing.*;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Պետք է ստեղծել Queue ֆունկցիոնալ։
 * Stack - LIFO
 * Queue - FIFO
 */
public class Queue<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Ավելացնել էլեմենտ
     */
    public void add(T t) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(t);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println(stack1);
    }

    /**
     * Վերցնել առաջին էլեմենտը՝ ջնջելով այն
     */
    public T poll() {
        if (!stack1.isEmpty()) {
            return stack1.remove(0);
        }
        return null;
    }

    /**
     * Վերցնել առաջին էլեմենտը՝ առանց այն ջնջելու
     */
    public T peek() {
        if (!stack1.isEmpty()) {
            return stack1.elementAt(0);
        }
        return null;
    }

    public int size() {
        return stack1.size();
    }

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.add("Poxos");
        stringQueue.add("Simba");
        stringQueue.add("Krakos");
        stringQueue.add("Martiros");

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.size());
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.size());
    }
}