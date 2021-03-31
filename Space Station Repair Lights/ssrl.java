import java.util.*;
import java.io.*;

class ssrl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ssrl.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ssrl.out")));

        int numCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < numCases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String output = "";
            int score = 0;
            if (st.nextToken().equals("BROKEN")) {
                score += 8;
            }
            if (st.nextToken().equals("BROKEN")) {
                score += 4;
            }
            if (st.nextToken().equals("BROKEN")) {
                score += 2;
            }
            if (st.nextToken().equals("BROKEN")) {
                score += 1;
            }

            int[] light = new int[2];

            light[0] = score / 4;
            light[1] = score % 4;

            for (int l : light) {
                if (l == 0) {
                    output += "off ";
                }

                else if (l == 1) {
                    output += "red ";
                } else if (l == 2) {
                    output += "green ";
                } else {
                    output += "blue ";
                }
            }
            output = output.trim();
            pw.println(output);
        }
        br.close();
        pw.close();
    }
}