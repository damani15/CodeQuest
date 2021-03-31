import java.util.*;
import java.io.*;

class gcas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("gcas.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gcas.out")));

        int testcases = Integer.parseInt(br.readLine());
        for (int t = 0; t < testcases; t++) {
            int length = Integer.parseInt(br.readLine());
            ArrayList<Integer> groundlevels = new ArrayList<Integer>();
            ArrayList<Integer> altitudes = new ArrayList<Integer>();

            groundlevels.add(0);
            groundlevels.add(0);
            altitudes.add(0);

            for (int i = 0; i < length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), ",");

                altitudes.add(Integer.parseInt(st.nextToken()));
                groundlevels.add(Integer.parseInt(st.nextToken()));
            }
            int futurealtitude = 0;

            for (int j = 0; j < altitudes.size(); j++) {
                if (j > 0) {
                    futurealtitude = altitudes.get(j) + (altitudes.get(j) - altitudes.get(j - 1));
                    if (futurealtitude < groundlevels.get(j + 1)) {
                        pw.println("PULL UP!");
                    } else if (altitudes.get(j) - groundlevels.get(j) <= 500) {
                        pw.println("Low Altitude");
                    } else {
                        pw.println("ok");
                    }
                }
            }
        }
        br.close();
        pw.close();
    }
}