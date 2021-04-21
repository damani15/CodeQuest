import java.util.*;
import java.io.*;


class brick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("brick.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("brick.out")));

        int numcases = Integer.parseInt(br.readLine());
        for(int i=0; i< numcases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int small = Integer.parseInt(st.nextToken());
            int big = Integer.parseInt(st.nextToken());
            int goal = Integer.parseInt(st.nextToken());

            big += small/5;
            small = small%5;

            if(goal/5<=big && goal%5<=small){
                pw.println("true");
            }
            else{ 
                pw.println("false");
            }

        }
        br.close();
        pw.close();
    }

}