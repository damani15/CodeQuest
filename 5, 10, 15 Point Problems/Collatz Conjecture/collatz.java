import java.util.*;
import java.io.*;


public class collatz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("collatz.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("collatz.out")));

        int numcases = Integer.parseInt(br.readLine());
        
        for(int i=0; i< numcases; i++){
            int sNumber = Integer.parseInt(br.readLine());
            int oNumber = sNumber;
            int length = 0;
            while (sNumber != 1){
                if (sNumber % 2 == 0){
                    sNumber /= 2;
                    length += 1;
                } 
                else {
                    sNumber = (sNumber * 3) + 1;
                    length += 1;
                }
            }
            pw.println(oNumber + ":" + (length+1));
        }


        br.close();
        pw.close();
    }

}