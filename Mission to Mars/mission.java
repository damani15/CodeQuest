import java.util.*;
import java.io.*;

class mission {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mission.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mission.out")));

        int numcases = Integer.parseInt(br.readLine());
        for(int i=0; i< numcases; i++){
            pw.print("Time to Mars: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            double distance = Double.parseDouble(st.nextToken());
            double speed = Double.parseDouble(st.nextToken());
            distance *= 1000000;

            double hourtime = distance/speed;
            

            int days = (int)(hourtime/24.0);
            hourtime = hourtime - days*24;
            
            int hours = (int)(hourtime);
            hourtime -= hours;
            hourtime*=60;

            int minutes = (int)(hourtime);
            
            hourtime -= minutes;
            
            hourtime*=60;

            int seconds = (int)(hourtime);
            pw.print(days + " days, ");
            pw.print(hours + " hours, ");
            pw.print(minutes + " minutes, ");
            pw.println(seconds + " seconds");
        }
        
        br.close();
        pw.close();
    }
}