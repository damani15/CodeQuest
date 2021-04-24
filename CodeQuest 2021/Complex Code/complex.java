import java.util.*;

public class complex {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine());
                int numLines = Integer.parseInt(st.nextToken());
                int highestC = Integer.parseInt(st.nextToken());
                int highestN = Integer.parseInt(st.nextToken());
                ArrayList<String> lines = new ArrayList<String>();
                for (int i = 0; i < numLines; i++) {
                    lines.add(input.nextLine());
                }
                int cycComplex = 1;
                int nesting = 0;
                for (int i = 0; i < numLines; i++) {
                    if (lines.get(i).length() > 3 && lines.get(i).substring(0, 2).equals("If")) {
                        nesting++;
                    }
                    if(lines.get(i).length()==1){
                        
                    }
                }
                cycComplex = nesting+1;
                System.out.print(cycComplex + " " + nesting + " ");
                if (cycComplex <= highestC && nesting <= highestN) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
            }
        }
    }
}
