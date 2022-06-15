package chapters.chapter6;

public class Stack {

    int[] stCk = new int[20];
    int tos;

    public Stack(int size) {
        stCk = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stCk.length - 1) {
            System.out.println("Stack is Full ");
        } else {
            stCk[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
//            System.out.println("Stack underflow ");
            return 0;
        } else {
            return stCk[tos--];
        }
    }

    public boolean isEmpty(){
        return tos == -1;
    }
}
