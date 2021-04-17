import java.util.*;

public class defender {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int aships = Integer.parseInt(input.nextLine());
                ArrayList<ship> ships = new ArrayList<ship>();
                for (int aship = 0; aship < aships; aship++) {
                    StringTokenizer st = new StringTokenizer(input.nextLine(), ", :, _");
                    ship add = new ship(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()));
                    ships.add(add);
                }
                ship min = new ship("", "", 100000000, 1000000);
                while (ships.size() > 0) {
                    min = new ship("", "", 100000000, 1000000);
                    for (ship s : ships) {
                        if (s.x < min.x) {
                            min = s;
                        } else if (s.x == min.x) {
                            if (s.y > min.y) {
                                min = s;
                            }
                        }
                    }
                    System.out.println("Destroyed Ship: " + min.name + " xLoc: " + min.x);

                    ships.remove(ships.indexOf(min));

                    for (ship s : ships) {
                        s.move();
                    }
                }
            }
        }
    }
}

class ship {
    String name;
    String type;
    int mult;
    int x;
    int y;

    ship(String n, String c, int xpos, int ypos) {
        name = n;
        type = c;
        x = xpos;
        y = ypos;
        mult = 1;
    }

    public void move() {
        if (x < 0) {
            mult = -1;
        } else {
            mult = 1;
        }
        if (type.equals("A")) {
            x -= 10 * mult;
        } else if (type.equals("B")) {
            x -= 20 * mult;
        } else if (type.equals("C")) {
            x -= 30 * mult;
        }
    }
}
