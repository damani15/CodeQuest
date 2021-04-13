import java.util.*;
import java.io.*;

class compression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("compression.in"));
        int numCases = Integer.parseInt(br.readLine());
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("compression.out")));
        

        for(int i=0; i<numCases; i++){
            int numvals = Integer.parseInt(br.readLine());
            double max= Double.NEGATIVE_INFINITY; //negative infinity
            double min=Double.POSITIVE_INFINITY; //positive infinity
            ArrayList<Double> vals = new ArrayList<Double>();
            
            for(int j=0; j<numvals; j++){ //loading the data
                vals.add(Double.parseDouble(br.readLine()));
            }
            for(int j=0; j<vals.size(); j++){ //get the max and min
                max = Math.max(max, vals.get(j));
                min = Math.min(min, vals.get(j));
                
            }
            for(int j=0; j<vals.size(); j++){ //running the formula
                double ret;
                ret = ((vals.get(j) - min)/(max-min))*255;
                
                pw.println(Math.round(ret)); //rounding to nearest integer and print
            }
        }


        br.close();
        pw.close();
    }
}