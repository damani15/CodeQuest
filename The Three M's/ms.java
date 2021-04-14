import java.util.*;
import java.io.*;


public class ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ms.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ms.out")));
        String line = br.readLine();
        int set = 1;

        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            ArrayList<Double> numbers = new ArrayList<Double>();

            while (st.hasMoreTokens()) {
                numbers.add(Double.parseDouble(st.nextToken()));
            }

            Collections.sort(numbers);

            double mean;
            double median;
            double mode;

            double size = numbers.size();
            double sum = 0.0;

            // calculating average
            for (double i : numbers) {
                sum += i;
            }
            mean = sum/size;

            // calculating median
            if (size%2 == 1) {
                median = numbers.get((int)(size/2));
            } else {
                median = (numbers.get((int)(size/2)) + numbers.get((int)(size/2 - 1)))/2;
            }

            // calculating mode
            HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

            for (double d : numbers) {
                if (count.containsKey((int)d)) {
                    count.put((int)d, count.get((int)d)+1);
                } else {
                    count.put((int)d, 1);
                }
            }

            ArrayList<Integer> modes = new ArrayList<Integer>();
            int max = 1;

            for (Integer i : count.values()) {
                if (i > max) {
                    max = i;
                }
            }
            for (Integer d : count.keySet()) {
                if (count.get(d) == max) {
                    modes.add(d);
                }
            }
            Collections.sort(modes);

            String modeString = "";
            for (int i = 0; i < modes.size(); i++) {
                modeString += modes.get(i).toString();
                if (i != modes.size()-1) {
                    modeString += ",";
                }
            }

            pw.print("Set " + set + ": Mean=");
            if (mean % 1 == 0) {
                pw.print((int)mean);
            } else {
                pw.print(String.format("%.1f", mean));
            }
            pw.print(", Median=");
            if (median % 1 == 0) {
                pw.print((int)median);
            } else {
                pw.print(String.format("%.1f", median));
            }
            pw.println(", Mode=" + modeString);
            

            line = br.readLine();
            set++;
        }
        

        br.close();
        pw.close();
    }
}