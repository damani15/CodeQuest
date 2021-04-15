import java.util.*;

public class encode {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            
            for (int testcase = 0; testcase < testCases; testcase++) {

                String toEncode = input.nextLine();
                ArrayList<Integer> spaces = new ArrayList<Integer>();
                
                for (int i = 0; i < toEncode.length(); i++) {
                    if (toEncode.charAt(i) == ' ') {
                        spaces.add(i);
                    }
                }
                toEncode = toEncode.replaceAll(" ", "");
                String keyWord = input.nextLine();
                char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                String out = "";

                for (int i = 0; i < toEncode.length(); i++) {
                    char current = toEncode.charAt(i);
                    char keyChar = keyWord.charAt(i%keyWord.length());

                    int place1 = -1;
                    int place2 = 0;
                    for (int j = 0; j < alphabet.length; j++) {
                        if (alphabet[j] == current) {
                            place1 = j;
                        }
                        if (alphabet[j] == keyChar) {
                            place2 = j;
                        }
                    }
                    if (place1 == -1) {
                        out += " ";
                        continue;
                    }
                    out += alphabet[(place1+place2)%26];
                }
                int count = 0;
                for (int i = 0; i < out.length() + spaces.size(); i++) {
                    boolean space = false;
                    for (int j = 0; j < spaces.size(); j++) {
                        if (spaces.get(j) == i) {
                            space = true;
                            break;
                        }
                    }
                    if (space) {
                        System.out.print(" ");
                        count++;
                    } else {
                        System.out.print(out.charAt(i-count));
                    }
                    if (i == out.length()+spaces.size()-1) {
                        System.out.println();
                    }
                }
            }
        }
    }
}