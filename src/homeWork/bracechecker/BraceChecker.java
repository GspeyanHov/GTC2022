package homeWork.bracechecker;

import chapters.chapter6.Stack;

public class BraceChecker {

    private String string;
    private Stack stack = new Stack(10);
    private Stack stackForIndex = new Stack(10);

    public BraceChecker(String string) {
        this.string = string;
    }

    public void check() {
        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            int last;
            switch (chars) {
                case '(':
                case '[':
                case '{':
                    stack.push(chars);
                    stackForIndex.push(i);
                    break;
                case ')':
                    last = stack.pop();
                    stackForIndex.pop();
                    if (last == 0) {
                        System.err.println("Error: closed  " + chars + " but not opened at " + i);
                    } else if (last != '(') {
                        System.err.println("Error: closed  " + chars + "  but opened " + (char) last + " at " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    stackForIndex.pop();
                    if (last == 0) {
                        System.err.println("Error: closed  " + chars + " but not opened at " + i);
                    } else if (last != '[') {
                        System.err.println("Error: closed  " + chars + "  but opened " + (char) last + " at " + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    stackForIndex.pop();
                    if (last == 0) {
                        System.err.println("Error: closed  " + chars + " but not opened at " + i);
                    } else if (last != '{') {
                        System.err.println("Error: closed  " + chars + "  but opened " + (char) last + " at " + i);
                    }
                    break;
            }
        }
//        int last;
//        while((last = stack.pop()) != 0) {
//            System.err.print("Error: opened " + (char)last + " but not closed");
//        }
        while (!stack.isEmpty()) {
            System.err.println("Error: opened " + (char) stack.pop() + " but not closed " + stackForIndex.pop());
        }

    }

}

