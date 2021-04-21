import java.util.*;
import java.io.*;

class carrier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("carrier.in"));
        int numCases = Integer.parseInt(br.readLine());
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("carrier.out")));
        

        for(int i=0; i<numCases; i++){
            int numvals = Integer.parseInt(br.readLine());
            
            for(int j=0; j<numvals; j++){ 
                pw.print(br.readLine() + ", "); 
                //loading in data
                double px;
                double py;
                double sx;
                double sy;
                double ex;
                double ey;
                StringTokenizer position = new StringTokenizer(br.readLine(),  ",");
                px = Double.parseDouble(position.nextToken());
                py = Double.parseDouble(position.nextToken());
                StringTokenizer start = new StringTokenizer(br.readLine(),  ",");
                sx = Double.parseDouble(start.nextToken());
                sy = Double.parseDouble(start.nextToken());
                StringTokenizer end = new StringTokenizer(br.readLine(),  ",");
                ex = Double.parseDouble(end.nextToken());
                ey = Double.parseDouble(end.nextToken());
                

                //do the calculations
                if ((py-sy)/(px-sx) <= -.8 && (py-sy)/(px-sx) >= -1.6){ //check start slope
                    if((py-ey)/(px-ex) <= -.8 && (py-ey)/(px-ex) >= -1.6){ //check end slope
                        pw.println("Clear To Land!");
                    }
                    else{
                        pw.println("Abort Landing!");
                    }
                }
                else{
                    pw.println("Abort Landing!");
                }
                
            }
        }

        pw.close(); 
        br.close();
    }
}