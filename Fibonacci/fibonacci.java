import java.util.*;
import java.io.*;

class fibonacci {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("fibonacci.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("fibonacci.out")));
        
        int numCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < numCases; i++){
            int n1 = 0;
            int n2 = 1;
            int n3 = 0;
            int count = Integer.parseInt(br.readLine());

            for (int j = 2; j < count; j++){ //finds fibonacci value based on nth position
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            } 
            pw.println(count + " = " + n3);
        }
        br.close();
        pw.close();
    }
}