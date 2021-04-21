import java.util.*;

public class rectangle {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), ",");
            int gridx = Integer.parseInt(st.nextToken());
            int gridy = Integer.parseInt(st.nextToken());

            boolean[][] canvas = new boolean[gridx][gridy];
            for (boolean[] r : canvas) {
                Arrays.fill(r, true);
            }

            String line = input.nextLine();

            while (line != null) {

                StringTokenizer st1 = new StringTokenizer(line);
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ",");
                StringTokenizer st3 = new StringTokenizer(st1.nextToken(), ",");

                int x1 = Integer.parseInt(st2.nextToken());
                int y1 = Integer.parseInt(st2.nextToken());
                int x2 = Integer.parseInt(st3.nextToken());
                int y2 = Integer.parseInt(st3.nextToken());

                int startx = x1;
                int endx = x2;
                int starty = y1;
                int endy = y2;

                if (x1 > x2) {
                    startx = x2;
                    endx = x1;
                }
                if (y1 > y2) {
                    starty = y2;
                    endy = y1;
                }

                for (int i = startx; i < endx; i++) {
                    for (int j = starty; j < endy; j++) {
                        canvas[i][j] = !canvas[i][j];
                    }
                }

                if (input.hasNextLine()) {
                    line = input.nextLine();
                } else {
                    break;
                }
            }

            // print

            for (int i = gridx - 1; i > -1; i--) {
                for (int j = gridy - 1; j > -1; j--) {
                    if (canvas[j][i] == false) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
