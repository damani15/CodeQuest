import java.util.*;
import java.io.*;

public class hot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("hot.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("hot.out")));
    
        int numcases = Integer.parseInt(br.readLine());
        for(int i = 0; i < numcases; i++){
            int conversions = Integer.parseInt(br.readLine());
            for (int j = 0; j < conversions; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String val = st.nextToken();
                double arbTemp = Double.parseDouble(val);
                pw.print(val);
                double oTemp;
                String tempType = st.nextToken();
                String oType;
                if (tempType.equals("C")){
                    oTemp = (arbTemp * 9.0/5.0) + 32.0;
                    oType = "F";
                } else {
                    oTemp = (arbTemp - 32.0) * (5.0/9.0);
                    oType = "C";
                }
                
                pw.println(" " + tempType + " " + "=" + " " + String.format("%.1f", oTemp) + " " + oType);
            }
        }
        
        
        br.close();
        pw.close();
    }

}