import java.util.*;
import java.io.*;


class triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("triangle.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangle.out")));

        int numcases = Integer.parseInt(br.readLine());
        
        for(int i=0; i< numcases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), ", ");
            int side1 = Integer.parseInt(st.nextToken());
            int side2 = Integer.parseInt(st.nextToken());
            int side3 = Integer.parseInt(st.nextToken());
        
            if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1){
                if (side1 == side2 && side2 == side3){
                    pw.println("Equilateral");
                }
                else if (side1 == side2 || side2 == side3 || side3 == side1){
                    pw.println("Isosceles");
                }
                else {
                    pw.println("Scalene");
                }
            } else {
                pw.println("Not a Triangle");
            }
        
        }

        br.close();
        pw.close();
    }

}