import java.util.*;

public class bigger {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                ArrayList<Integer> scores = new ArrayList<Integer>();
                StringTokenizer st = new StringTokenizer(input.nextLine());
                int frequency = st.countTokens();

                for (int i = 0; i < frequency; i++){
                    scores.add(Integer.parseInt(st.nextToken()));
                }
                for (int i = 0; i < scores.size(); i++){
                    // System.out.println(scores.get(i));
                }
                int high = -1;
                for (int i = 0; i < scores.size(); i++){
                    if (scores.get(i) > high){
                        high = scores.get(i);
                    }
                }
                System.out.println(high);
            }
        }
    }
}
