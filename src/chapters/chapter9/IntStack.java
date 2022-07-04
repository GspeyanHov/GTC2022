package chapters.chapter9;

public interface IntStack {

    void push(int item);

    int pop();


}

class FixedStack implements IntStack {
    private int[] stCk;
    private int tos;


    FixedStack(int size) {
        stCk = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stCk.length - 1) {
            System.out.println("stack is full");
        } else {
            stCk[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("stack underflow! ");
            return 0;
        } else {
            return stCk[tos--];
        }
    }
}
class IfTest{
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("stack in mystack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("stack in mystack2 ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
