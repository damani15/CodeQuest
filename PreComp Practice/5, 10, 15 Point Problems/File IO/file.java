import java.util.*;
import java.io.*;


class file {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
        
        String hold = br.readLine();
  
        while(hold!=null){
            pw.println(hold);

            hold=br.readLine();
        }
        br.close();
        pw.close();
    }

}