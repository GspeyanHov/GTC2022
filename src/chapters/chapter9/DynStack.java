package chapters.chapter9;

public class DynStack implements IntStack{
    private int[] stCk;
    private int tos;

    DynStack(int size) {
        stCk = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos == stCk.length - 1){
            int[]tmp = new int[stCk.length * 2];
            for (int i = 0; i < stCk.length; i++) {
                tmp[i] = stCk[i];
            }
            stCk = tmp;
            stCk[++tos] = item;
        }else{
            stCk[++tos] = item;
        }
    }
    public int pop(){
        if(tos < 0){
            System.out.println("stack underflow");
            return 0;
        }else{
           return stCk[tos--];
        }
    }
}
class IfTest2{
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 12; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            myStack2.push(i);
        }
        System.out.println("stack in mystack1: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("stack in mystack2 ");
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
