package chapters.chapter5;

public class Search {

    public static void main(String[] args) {

        int[]nums = {1,5,9,8,7,1,2,3,15};
        int val = 7;
        boolean found = false;

        for (int num : nums) {
            if(num == val){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Value found ");
        }
    }
}
