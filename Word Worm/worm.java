import java.util.*;

public class worm {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine());
                int rows = Integer.parseInt(st.nextToken());
                int cols = Integer.parseInt(st.nextToken());

                char[][] grid = new char[rows][cols];
                for (int i = 0; i < rows; i++) { // fill array

                    StringTokenizer row = new StringTokenizer(input.nextLine());
                    for (int g = 0; g < cols; g++) {
                        String hold = row.nextToken();
                        grid[i][g] = hold.charAt(0);
                    }
                }

                int words = Integer.parseInt(input.nextLine());

                for (int i = 0; i < words; i++) {
                    String word = input.nextLine();
                    char[] wlist = word.toCharArray();

                    boolean found = false;
                    for (int h = 0; h < rows; h++) {
                        for (int g = 0; g < cols; g++) {
                            if (grid[h][g] == wlist[0] && !found) {
                                found = check(wlist, grid, h, g, 1);
                            }
                        }
                    }
                    if (found) {
                        System.out.println(word);
                    }
                }

            }
        }
    }

    public static boolean check(char[] list, char[][] chart, int r, int c, int listpos) {
        char comp = list[listpos];
        int maxr = chart.length - 1;
        int maxc = chart[0].length - 1;
        boolean checked = false;

        if (r < maxr) {
            if (chart[r + 1][c] == comp && !checked) {
                if (listpos == list.length - 1) {
                    checked = true;
                } else {
                    checked = check(list, chart, r + 1, c, listpos + 1);
                }
            }
            if (c < maxc) {
                if (chart[r + 1][c + 1] == comp && !checked) {
                    if (listpos == list.length - 1) {
                        return true;
                    } else {
                        checked = check(list, chart, r + 1, c + 1, listpos + 1);
                    }
                }
            }
            if (c > 0) {
                if (chart[r + 1][c - 1] == comp && !checked) {
                    if (listpos == list.length - 1) {
                        return true;
                    } else {
                        checked = check(list, chart, r + 1, c - 1, listpos + 1);
                    }
                }
            }
        }
        if (r > 0) {
            if (chart[r - 1][c] == comp && !checked) {
                if (listpos == list.length - 1) {
                    return true;
                } else {
                    checked = check(list, chart, r - 1, c, listpos + 1);
                }
            }
            if (c < maxc && !checked) {
                if (chart[r - 1][c + 1] == comp) {
                    if (listpos == list.length - 1) {
                        return true;
                    } else {
                        checked = check(list, chart, r - 1, c + 1, listpos + 1);
                    }
                }
            }
            if (c > 0) {
                if (chart[r - 1][c - 1] == comp && !checked) {
                    if (listpos == list.length - 1) {
                        return true;
                    } else {
                        checked = check(list, chart, r - 1, c - 1, listpos + 1);
                    }
                }
            }
        }

        if (c > 0) {
            if (chart[r][c - 1] == comp && !checked) {
                if (listpos == list.length - 1) {
                    return true;
                } else {
                    checked = check(list, chart, r, c - 1, listpos + 1);
                }
            }
        }

        if (c < maxc) {
            if (chart[r][c + 1] == comp && !checked) {
                if (listpos == list.length - 1) {
                    return true;
                } else {
                    checked = check(list, chart, r, c + 1, listpos + 1);
                }
            }
        }

        return checked;

    }

}
