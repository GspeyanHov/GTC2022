package chapters.chapter6;

public class Stack {

    int[] stck = new int[10];
    int tos;

    public Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is Full ");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow ");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public void checkStack() {
        System.out.print((tos + 1) + " -->  ");
        if (tos >= 0) {
            for (int i = 0; i <= tos; i++) {
                System.out.print((char) stck[i] + " ");
            }
        }

    }
}
