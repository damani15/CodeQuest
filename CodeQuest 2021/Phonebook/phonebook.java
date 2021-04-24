import java.util.*;

public class phonebook {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine());
                char[] number = st.nextToken().toCharArray();
                String type = st.nextToken();

                if (type.equals("PARENTHESES")){
                    System.out.println("(" + (char)number[0] + "" + (char)number[1] + "" + (char)number[2] + ") " + (char)number[3] + "" + (char)number[4] + "" + (char)number[5] + "-" + (char)number[6] + "" + (char)number[7] + "" + (char)number[8] + "" + (char)number[9]);
                }
                else if (type.equals("DASHES")){
                    System.out.println((char)number[0] + "" + (char)number[1] + "" + (char)number[2] + "-" + (char)number[3] + "" + (char)number[4] + "" + (char)number[5] + "-" + (char)number[6] + "" + (char)number[7] + "" + (char)number[8] + "" + (char)number[9]);
                }
                else {
                    System.out.println((char)number[0] + "" + (char)number[1] + "" + (char)number[2] + "." + (char)number[3] + "" + (char)number[4] + "" + (char)number[5] + "." + (char)number[6] + "" + (char)number[7] + "" + (char)number[8] + "" + (char)number[9]);
                }
            }
        }
    }
}
