import java.util.*;
import java.io.*;


class sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sort.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sort.out")));

        String line = br.readLine();


        while(line != null){
            ArrayList<Integer> unsorted = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(line, ",");
            int length = new StringTokenizer(line, ",").countTokens();
            for(int i = 0; i < length; i++){
                unsorted.add(Integer.parseInt(st.nextToken()));
            }
            for (int i = 0; i < unsorted.size()-1; i++){
                for (int j = 0; j < unsorted.size() - i - 1; j++){
                    if (unsorted.get(j) > unsorted.get(j+1)){
                        int temp = unsorted.get(j);
                        unsorted.set(j, unsorted.get(j + 1));
                        unsorted.set(j + 1, temp);
                    }
                }
            }
            for (int i = 0; i < unsorted.size(); i++){
                if (i < unsorted.size()-1){
                    pw.print(unsorted.get(i) + ",");
                }
                else {
                    pw.println(unsorted.get(i));
                }
            }
            line = br.readLine();

        }
        br.close();
        pw.close();
    }

}