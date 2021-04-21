import java.util.*;

public class euclidean {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            
            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine(),",");
                int minuend = Integer.parseInt(st.nextToken());
                int subtrahend = Integer.parseInt(st.nextToken());
                if(minuend<subtrahend){
                    int swap = minuend;
                    minuend = subtrahend;
                    subtrahend = swap;
                }
                int difference = minuend - subtrahend;
                while (difference != 0){
                    System.out.println(minuend + "-" + subtrahend + "=" + difference);
                    if (subtrahend > difference){
                        minuend = subtrahend;
                        subtrahend = difference;
                        difference = minuend - subtrahend;
                    }
                    else if (difference > subtrahend){
                        minuend = difference;
                        difference = minuend - subtrahend;
                    }
                    else {
                        minuend = difference;
                        subtrahend = minuend;
                        difference = 0;
                        System.out.println(minuend + "-" + subtrahend + "=" + difference);

                    }
                }
                if (subtrahend == 1 && minuend == 1){
                    System.out.print("COPRIME");
                }
                else {
                    System.out.print("NOT COPRIME");
                }
                if(testcase!=testCases-1){
                    System.out.println("");
                }
            }
        }
    }
}