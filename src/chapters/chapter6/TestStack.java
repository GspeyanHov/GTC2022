package chapters.chapter6;

public class TestStack {

    public static void main(String[] args) {
        Stack myStack1 = new Stack(20);
        Stack myStack2 = new Stack(20);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("Stack in myStack1 ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2 ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }


    }
}
