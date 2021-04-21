import java.util.*;
import java.io.*;


public class message {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("message.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("message.out")));

        int numcases = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < numcases; i++){
            int numlines = Integer.parseInt(br.readLine());
            ArrayList<char[]> first = new ArrayList<char[]>();
            ArrayList<char[]> cover = new ArrayList<char[]>();
            String ret = "";
            for(int j = 0; j < numlines; j++){
                first.add(br.readLine().toCharArray());
            }
            StringTokenizer coords = new StringTokenizer(br.readLine(), ",");
            int srow = Integer.parseInt(coords.nextToken());
            int scolumn = Integer.parseInt(coords.nextToken());

            int numlines2 = Integer.parseInt(br.readLine());

            for(int j = 0; j < numlines2; j++){
                cover.add(br.readLine().toCharArray());
            }
            for(int j=0; j<cover.size(); j++){
                for(int k=0; k<cover.get(j).length; k++){
                    if (cover.get(j)[k] == 'O'){
                        ret += first.get(j+srow)[k+scolumn];
                    }
                        
                    }
                }
                pw.println(ret);
            }

        br.close();
        pw.close();
        }

    }