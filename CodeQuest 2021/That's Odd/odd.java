import java.util.*;

public class odd {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                if (Integer.parseInt(input.nextLine()) % 2 == 0){
                    System.out.println("EVEN");
                }
                else {
                    System.out.println("ODD");
                }
            }
        }
    }
}
