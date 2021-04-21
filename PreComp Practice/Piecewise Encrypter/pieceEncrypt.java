import java.io.*;

class pieceEncrypt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pieceEncrypt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pieceEncrypt.out")));

        int numCases = Integer.parseInt(br.readLine());

        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        for (int i = 0; i < numCases; i++) {
            String currentWord = br.readLine();
            String output = "";

            for (int j = 0; j < currentWord.length(); j++) {
                int c = (int) currentWord.charAt(j) - 64;

                if (1 <= c && c <= 5) {
                    c += 6;
                } else if (6 <= c && c <= 10) {
                    c *= c;
                } else if (11 <= c && c <= 15) {
                    c = 5 * (c % 3) + 1;
                } else if (16 <= c && c <= 20) {
                    c = (c / 10 + c % 10) * 8;
                } else {
                    if (c % 2 != 0) {
                        int largest = 1;
                        for (int z = 1; z < c / 2; z++) {
                            if (c % z == 0 && z > largest) {
                                largest = z;
                            }
                        }
                        c = largest * 2;
                    }
                    // else do nothing
                }

                // convert c
                c %= 26;
                output += alphabet[c - 1];
            }
            pw.println(output);
        }

        br.close();
        pw.close();
    }
}