import java.util.*;

public class go {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine(), " ");
                int us = Integer.parseInt(st.nextToken());
                int team = Integer.parseInt(st.nextToken());
                int result = us - team;
                if (result == -15){
                    System.out.println(2);
                }
                else if (result == -14){
                    System.out.println(1);
                }
                else if (result == -13){
                    System.out.println(2);
                }
                else if (result == -12){
                    System.out.println(1);
                }
                else if (result == -11){
                    System.out.println(2);
                }
                else if (result == -10){
                    System.out.println(2);
                }
                else if (result == -9){
                    System.out.println(1);
                }
                else if (result == -8){
                    System.out.println(2);
                }
                else if (result == -7){
                    System.out.println(1);
                }
                else if (result == -6){
                    System.out.println(1);
                }
                else if (result == -5){
                    System.out.println(2);
                }
                else if (result == -4){
                    System.out.println(2);
                }
                else if (result == -3){
                    System.out.println(1);
                }
                else if (result == -2){
                    System.out.println(2);
                }
                else if (result == -1){
                    System.out.println(1);
                }
                else if (result == 0){
                    System.out.println(1);
                }
                else if (result == 1){
                    System.out.println(2);
                }
                else if (result == 2){
                    System.out.println(1);
                }
                else if (result == 3){
                    System.out.println(1);
                }
                else if (result == 4){
                    System.out.println(1);
                }
                else if (result == 5){
                    System.out.println(2);
                }
                else if (result == 6){
                    System.out.println(1);
                }
                else if (result == 7){
                    System.out.println(1);
                }
                else if (result == 8){
                    System.out.println(1);
                }
                else if (result == 9){
                    System.out.println(1);
                }
                else if (result == 10){
                    System.out.println(1);
                }
                else if (result == 11){
                    System.out.println(1);
                }
                else if (result == 12){
                    System.out.println(2);
                }
                else {
                    System.out.println(1);
                }

            }
        }
    }
}
