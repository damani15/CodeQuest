import java.util.*;

public class Prob01 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            
            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine(),":");
                double speed = Double.parseDouble(st.nextToken());
                double distance = Double.parseDouble(st.nextToken());
                if (distance / speed <= 1.0) {
                    System.out.println("SWERVE");
                }
                else if (distance / speed <= 5.0) {
                    System.out.println("BRAKE");
                }            
                else{
                    System.out.println("SAFE");
                }
            }
        }
    }
}