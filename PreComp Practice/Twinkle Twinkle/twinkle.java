import java.util.*;
import java.io.*;

class twinkle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("twinkle.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("twinkle.out")));

        int numcases = Integer.parseInt(br.readLine());
        for (int i = 0; i < numcases; i++){

            //data loading
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sx = Double.parseDouble(st.nextToken());
            double sy = Double.parseDouble(st.nextToken());
            int points = Integer.parseInt(st.nextToken());
            double orad = Double.parseDouble(st.nextToken());
            double inrad = Double.parseDouble(st.nextToken());

            double[][] coordinates = new double[points*2][2];


            // distance between each point = 2pi/points
            // difference between each angle (in radians) = 2pi / points*2
            
            double difference = (2 * Math.PI)/(points*2.0);
            double crad;
            double angle = 0;

            
            for (int j = 0; j < points*2; j++){
                if(j%2==0){
                    crad = orad;
                }
                else{
                    crad = inrad;
                }
                coordinates[j][0] = (crad*Math.cos(angle) + sx);
                coordinates[j][1] = (crad*Math.sin(angle) + sy);
                angle -= difference;
            }
            
            
            
            
            for (int j = 0; j < coordinates.length; j++) {
                String x = String.format("%.2f", coordinates[j][1]);
                String y = String.format("%.2f", coordinates[j][0]);
                pw.print(x + "," + y);
            
                if (j != coordinates.length-1){
                    pw.print(" ");
                }
                else {
                    pw.println();
                }
            }
            

        }
        pw.close();
        br.close();
    }
}