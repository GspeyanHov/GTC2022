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
        System.out.print(stack1.push(t) + " ");
    }
    /**
     * Վերցնել առաջին էլեմենտը՝ ջնջելով այն
     */
    public T poll() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    /**
     * Վերցնել առաջին էլեմենտը՝ առանց այն ջնջելու
     */
    public T peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
    public int size() {
        return stack2.size() + stack1.size();
    }
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.add("Poxos");
        stringQueue.add("Simba");
        stringQueue.add("Krakos");
        stringQueue.add("Martiros");


        System.out.println();
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.size());
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.size());
    }
}