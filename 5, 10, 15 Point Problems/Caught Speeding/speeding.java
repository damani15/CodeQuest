import java.util.*;
import java.io.*;


class speeding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        int numcases = Integer.parseInt(br.readLine());
        for(int i=0; i< numcases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            if (st.nextToken().equals("true")){  //if it is the drivers birthday
                if (speed<=65){
                    pw.println("no ticket");
                }
                else if (speed>=66 && speed<=85){
                    pw.println("small ticket");
                }
                else {
                    pw.println("big ticket");
                }
            } else {
                if (speed<=60){
                    pw.println("no ticket");
                }
                else if (speed>=61 && speed<=80){
                    pw.println("small ticket");
                }
                else {
                    pw.println("big ticket");
                }
            }
            

        }

        br.close();
        pw.close();
    }

}