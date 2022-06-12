package homeWork.bracechecker;

import chapters.chapter6.Stack;

public class BraceChecker {

    String string;

    BraceChecker(String string) {
        this.string = string;
    }

    void check() {
        char[] chars = string.toCharArray();
        Stack stack = new Stack(chars.length);
        char lastChar;
        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]) {
                case '(':
                case '[':
                case '{':
                    stack.push(chars[i]);
                    break;
                case ']':
                    lastChar = (char) stack.pop();
                    if (lastChar == 0) {
                        System.err.println("Error: closed  " + chars[i] + " but not opened" + " at " + i);
                    } else if (lastChar != '[') {
                        System.err.println("Error: opened  " + lastChar + "  but closed  " + chars[i] + " at " + i);
                    }
                    break;
                case ')':
                    lastChar = (char) stack.pop();
                    if (lastChar == 0) {
                        System.err.println("Error: closed  " + chars[i] + " but not opened" + " at " + i);
                    } else if (lastChar != '(') {
                        System.err.println("Error: opened  " + lastChar + "  but closed  " + chars[i] + " at " + i);
                    }
                    break;
                case '}':
                    lastChar = (char) stack.pop();
                    if (lastChar == 0) {
                        System.err.println("Error: closed  " + chars[i] + " but not opened" + " at " + i);
                    } else if (lastChar != '{') {
                        System.err.println("Error: opened  " + lastChar + "  but closed  " + chars[i] + " at " + i);
                    }
            }
        }
        System.err.print("Quantity of opened  but not closed is  ");
        stack.checkStack();


    }

}

