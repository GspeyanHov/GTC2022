package chapters.chapter9;

public interface IntStack1 {

    void push(int item);

    int pop();

    default int[] PopNElements(int n){
        return getElements(n);
    }
    default int[]SkipAndPopElements(int skip, int n){
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n){
        int []elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }
}
