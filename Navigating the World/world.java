import java.util.*;

public class world {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine());
                double zoom = Integer.parseInt(st.nextToken());
                Double lat = Double.parseDouble(st.nextToken());
                Double lon = Double.parseDouble(st.nextToken());
                int x = (int) (((lon + 180.0) / 360.00) * (Math.pow(2.00, zoom)));
                int y = (int) (((1.0
                        - ((Math.log(Math.tan(lat * (Math.PI / 180.0)) + (1.0 / (Math.cos(lat * (Math.PI / 180.0)))))))
                                / Math.PI))
                        * (Math.pow(2.00, zoom - 1)));

                System.out.println("http://tile.openstreetmap.org/" + (int) zoom + "/" + x + "/" + y + ".png");
            }
        }
    }
}

// 17min