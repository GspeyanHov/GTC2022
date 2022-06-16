package homeWork.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //1.Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false

    public boolean isEmpty() {
        return this.size == 0;
    }
    //2.Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;

    public int getByIndex(int index) {
        if (index >= this.size || index < 0) {
            return -1;
        }
        return this.array[index];
    }
    //3.Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == this.array[i]) {
                return i;
            }
        }

        return -1;
    }
    //4.Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).

    public void set(int index, int value) {
        if (index >= this.size || index < 0) {
            System.out.println("Error array index! ");
            return;
        }
        this.array[index] = value;
    }
    //5.Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի

    public void add(int index, int value) {
        if (index >= this.size || index < 0) {
            System.out.println("Error array index! ");
            return;
        }
        for (int i = size - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = value;
        this.size++;
    }
    //6.Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

    public void delete(int index) {
        if (index >= this.size || index < 0) {
            System.out.println("Error array index! ");
            return;
        }
        int value = this.array[index];
        for (int i = index; i < size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
