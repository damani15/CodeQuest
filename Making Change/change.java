import java.util.*;
import java.io.*;


public class change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("change.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("change.out")));
        String line = br.readLine();

        while(line!=null){
            StringTokenizer st = new StringTokenizer(line, ",");
           
            double cost = Double.parseDouble(st.nextToken());
            double given = Double.parseDouble(st.nextToken());
            double change = given-cost;
            String changeString = String.format("%.2f", change);
            if (change == 0){
                pw.print("NONE");
                continue;
            }
            else if (change < 1) {
                changeString = changeString.substring(1);
            }
            pw.print("$" + changeString);

            int twenty = (int)(change/20);
            change%=20.0;
            int ten = (int)(change/10);
            change%=10.0;
            int five = (int)(change/5);
            change%=5.0;
            int one = (int)(change);
            change*=100.0;
            change%=100.0;
            int quarter = (int)(change/25);
            change%=25;
            int dime = (int)(change/10);
            // System.out.println(change + " " + dime);
            change=Math.round(change%10);

            int penny = (int)(change);

            // System.out.println("Twenty: " + twenty + " Ten: " + ten + " Five: " + five + " One: " + one);
            // System.out.println(" quarter" + quarter + " dime" + dime + " penny" + penny);

            if(twenty>0){
                pw.print(", TWENTY=" + twenty);
            }
            if(ten>0){
                pw.print(", TEN=" + ten);
            }
            if(five>0){
                pw.print(", FIVE=" + five);
            }
            if(one>0){
                pw.print(", ONE=" + one);
            }
            if(quarter>0){
                pw.print(", QUARTER=" + quarter);
            }
            if(dime>0){
                pw.print(", DIME=" + dime);
            }
            if (penny>0){
                pw.print(", PENNY=" + penny);
            }
            
            pw.println();
            line = br.readLine();
            
        }
        

        br.close();
        pw.close();
    }

}