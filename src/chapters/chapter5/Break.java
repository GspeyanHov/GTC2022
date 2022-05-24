package chapters.chapter5;

public class Break {

    public static void main(String[] args) {

        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("comes before break loop. ");
                    if(t){
                        break second;
                    }
                    System.out.println("this statement wont be executed ");
                }
                System.out.println("this statement wont be executed ");
            }
            System.out.println("this statement follows the block second. ");
        }

    }
}
