package homeWork.collection;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Collections;

public class CollectionExample {

    public static void main(String[] args) {
        System.out.println(arrayToList(new String[]{"Veni", "Vidi", "Vici"}));
        List<String> newList = new ArrayList<>();
        newList.add(0, "Poghos");
        newList.add(1, "Petros");
        newList.add(2, "Firdus");
        newList.add(3, "Kirakos");
        newList.add(4, "Pighatos");
        newList.add(5, "Valerik");
        System.out.println(removeById(newList, 4));
        System.out.println(listToSet(newList));
        List<Integer> integers = new LinkedList<>();
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(18);
        integers.add(19);
        integers.add(20);
        System.out.println(listToLinkedList(integers));
        System.out.println(reverseNumbers(integers));
        printFirstFive(newList);
        System.out.println(sizeOfList(newList));

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);
            if (values.length == arrayList.size()) {
                return arrayList;
            }
        }
        return null;
    }


    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        List<String> nameList = new ArrayList<>();
        for (String s : list) {
            nameList.add(s);
            if (list.size() == nameList.size()) {
                nameList.remove(index);
                return nameList;
            } else if (index < 0 || index > list.size()) {
                return null;
            }
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> str = new HashSet<>();
        for (String s : list) {
            str.add(s);
            if (str.size() == list.size()) {
                return str;
            }
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (Integer integer : list) {
            integers.add(integer);
            if (integers.size() == list.size()) {
                return integers;
            }
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> integers = new ArrayList<>();
        for (Integer integer : list) {
            integers.add(integer);
            if (integers.size() == list.size()) {
                Collections.reverse(integers);
                return integers;
            }
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            newList.add(s);
           if(newList.size() == list.size()){
               System.out.println(newList.subList(0, 5));
           }
        }
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
       List<String> stringList = new ArrayList<>();
        for (String s : list) {
            stringList.add(s);
            if(stringList.size() == list.size()){
                return stringList.size();
            }
        }
        return 0;
    }

}