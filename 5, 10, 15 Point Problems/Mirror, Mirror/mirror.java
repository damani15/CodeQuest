import java.util.*;
import java.io.*;


class mirror {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mirror.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mirror.out")));

        String line = br.readLine();
        while (line != null){
            String reversed="";
            for (int i = line.length(); i > 0; i--){
                reversed += line.substring(i-1,i);
            }
            pw.println(reversed);
            line = br.readLine();
        }



        br.close();
        pw.close();
    }

}