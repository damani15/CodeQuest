import java.util.*;

public class pig {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            
            String line = input.nextLine();
            while (line != null){

                StringTokenizer st = new StringTokenizer(line);
                int frequency = st.countTokens();

                for (int i = 0; i < frequency; i++){
                    // System.out.println(i);
                    char[] word = st.nextToken().toCharArray();
                    if (word[0] != 97 && word[0] != 101 && word[0] != 105 && word[0] != 111 && word[0] != 117){
                        if (word[1] == 97 || word[1] == 101 || word[1] == 105 || word[1] == 111 || word[1] == 117){
                            char temp1 = word[0];
                            int offset = 1;
                            if (temp1 == 'q'){
                                offset = 2;
                            }
                            for (int k = offset; k < word.length; k++){
                                System.out.print(word[k]);
                            }
                            System.out.print(temp1);
                            if (offset == 2){
                                System.out.print("u");
                            }
                            System.out.print("ay ");
                            if (i == frequency-1){
                                System.out.println();
                            }
                        }
                        else {
                            int offset = 0;
                            ArrayList<Character> wordM = new ArrayList<Character>();
                            for (int j = 0; j < word.length; j++){
                                if (word[j] != 97 && word[j] != 101 && word[j] != 105 && word[j] != 111 && word[j] != 117){
                                    wordM.add(word[j]);
                                    offset += 1;
                                }
                            }
                            
                            for (int j = offset; j < word.length; j++){
                                System.out.print(word[j]);
                            }
                            for (int j = 0; j < wordM.size(); j++){
                                System.out.print(wordM.get(j));
                            }
                            System.out.print("ay ");
                            if (i == frequency-1){
                                System.out.println();
                            }
                        }
                    } else {
                        for (int j = 0; j < word.length; j++){
                            System.out.print(word[j]);
                        }
                        System.out.print("yay ");
                        if (i == frequency-1){
                            System.out.println();
                        }
                    }
                }
                if (input.hasNextLine()){
                    line = input.nextLine();
                }
                else {
                    break;
                }
            }
        }
    }
}
