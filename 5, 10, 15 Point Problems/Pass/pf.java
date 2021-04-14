import java.util.*;
import java.io.*;

class pf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pf.in"));
        int numCases = Integer.parseInt(br.readLine());
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pf.out")));
        
        for(int i=0; i<numCases; i++){

            int grade = Integer.parseInt(br.readLine());
            if(grade>=70){
                pw.println("PASS");
            }
            else{
                pw.println("FAIL");
            }
        }

        br.close();
        pw.close();
    }
}