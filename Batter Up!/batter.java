import java.util.*;
import java.io.*;


class batter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("batter.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("batter.out")));

        int numcases = Integer.parseInt(br.readLine());

        for(int i=0; i< numcases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),  ", :");
            pw.print(st.nextToken()+"=");//name
            double atbats=0;
            
            double points=0;
            //load data
            while(st.hasMoreTokens()){
                String hold = st.nextToken();
                atbats++;
                if(hold.equals("1B")){
                    points++;
                }
                if(hold.equals("2B")){
                    points+=2;
                }
                if(hold.equals("3B")){
                    points+=3;
                }
                if(hold.equals("HR")){
                    points+=4;
                }
                if(hold.equals("BB")){
                    atbats--;
                }
            }

            double score = points/atbats;
            
            pw.println(String.format("%.3f", score));

        }
        br.close();
        pw.close();
    }
    
}