import java.util.*;
import java.io.*;
import java.math.*;

public class choose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("choose.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("choose.out")));
        String line = br.readLine();

        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            pw.println(binomial(n, k));

            line = br.readLine();
        }
        br.close();
        pw.close();
    }

    public static BigInteger binomial(final int N, final int K) {
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N - k)).divide(BigInteger.valueOf(k + 1));
        }
        return ret;
    }
}
