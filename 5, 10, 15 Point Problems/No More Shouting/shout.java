import java.util.*;

public class shout {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            
            for (int testcase = 0; testcase < testCases; testcase++) {
                String output=input.nextLine();
                System.out.println(output.toLowerCase());
            }
        }
    }
}