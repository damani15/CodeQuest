import java.util.*;
import java.io.*;

class encryption {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("encryption.in"));
        int numCases = Integer.parseInt(br.readLine());
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("encryption.out")));

        for (int i = 0; i < numCases; i++) {
            String decision = br.readLine();
            String cipher = br.readLine();
            char[] calpha = cipher.toCharArray();

            System.out.println(Arrays.toString(calpha));

            int numLines = Integer.parseInt(br.readLine());
            String[] words = new String[numLines];
            for (int j = 0; j < numLines; j++) {
                words[j] = br.readLine();
            }

            if (decision.equals("ENCRYPT")) { // to encrypt
                for (int j = 0; j < words.length; j++) {
                    String currentWord = words[j];
                    String encryptedWord = "";
                    for (int z = 0; z < currentWord.length(); z++) {
                        char c = currentWord.charAt(z);
                        int h = (int) c;
                        if (64 < h && h < 91) {
                            encryptedWord += Character.toUpperCase(calpha[h - 65]);
                        } else if (96 < h && h < 123) {
                            encryptedWord += calpha[h - 97];
                        } else {
                            encryptedWord += c;
                        }
                    }
                    pw.println(encryptedWord);
                }
            }

            else { // to decrypt
                for (int j = 0; j < words.length; j++) {
                    String retur = "";
                    String word = words[j];

                    for (int k = 0; k < word.length(); k++) {

                        boolean up = false;
                        char ca = word.charAt(k);
                        if (Character.isUpperCase(ca)) {
                            up = true;
                        }

                        int h = -2;
                        for (int z = 0; z < calpha.length; z++) {
                            if (calpha[z] == Character.toLowerCase(ca)) {
                                h = z;
                            }

                        }
                        if (h < 0) { // space
                            retur += ca;
                        } else if (up) {
                            retur += Character.toUpperCase(alphabet[h]);
                        } else {
                            retur += alphabet[h];
                        }

                    }
                    pw.println(retur);

                }
            }
            if (i != numCases - 1) {
                pw.println();
            }
        }
        pw.close();
        br.close();
    }
}