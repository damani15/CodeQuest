import java.util.*;

public class coin {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer productST = new StringTokenizer(input.nextLine());
                StringTokenizer dateST = new StringTokenizer(input.nextLine());
                double cHash = 0;
                for (double i = 0.0; i < 10.0; i++){
                    char[] product = productST.nextToken().toCharArray();
                    double date = Long.parseLong(dateST.nextToken());
                    double pValue = 0;
                    for (int j = 0; j < product.length; j++){
                        pValue += (product[j] - 96);
                    }
                    cHash = genHash(cHash,date,pValue,i+1.0);
                }
                System.out.printf("%.0f\n", cHash);
            }
        }
    }

    public static double genHash(double prevHash, double time, double productValue, double index){
        double result = 0;
        result = ((time + productValue + index + prevHash) * 50) / (147.0);
        return result;
    }
}
