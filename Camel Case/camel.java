import java.util.*;
import java.lang.*;

public class camel {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String line = input.nextLine();

            while (true) {
                StringTokenizer st = new StringTokenizer(line, ";");
                String operation = st.nextToken();
                String type = st.nextToken();
                String words = st.nextToken();
                String output = "";

                if (operation.equals("S")) {
                    if (type.equals("M")) {
                        words = words.substring(0, words.length() - 2);
                    }
                    for (int i = 0; i < words.length(); i++) {
                        if (Character.isUpperCase(words.charAt(i))) {
                            if (i != 0) {
                                output += " ";
                            }
                            output += Character.toLowerCase(words.charAt(i));
                        } else {
                            output += words.charAt(i);
                        }
                    }
                } else {
                    boolean upp = false;
                    for (int i = 0; i < words.length(); i++) {
                        if (words.charAt(i) == ' ') {
                            upp = true;
                            continue;
                        }
                        if (i == 0 && type.equals("C")) {
                            output += Character.toUpperCase(words.charAt(0));
                            continue;
                        }
                        if (upp) {
                            output += Character.toUpperCase(words.charAt(i));
                            upp = false;
                        } else {
                            output += words.charAt(i);
                        }
                    }
                    if (type.equals("M")) {
                        output += "()";
                    }
                }
                System.out.println(output);

                if (input.hasNextLine()) {
                    line = input.nextLine();
                } else {
                    break;
                }
            }
        }
    }
}
