import java.util.*;

public class csi {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                String original = input.nextLine();
                char[] orchars = original.toCharArray();

                int numcomp = Integer.parseInt(input.nextLine());
                HashMap<String, String> pairs = new HashMap<String, String>();
                for (int num = 0; num < numcomp; num++) {
                    // data entry
                    StringTokenizer st = new StringTokenizer(input.nextLine(), "=");
                    String name = st.nextToken();
                    String current = st.nextToken();
                    pairs.put(name, current);
                }

                HashMap<String, String> longest = new HashMap<String, String>();

                for (Map.Entry<String, String> pair : pairs.entrySet()) {
                    String name = pair.getKey();
                    String value = pair.getValue();

                    char[] currchars = value.toCharArray();

                    String sub = "";
                    int startIndex = 0;

                    for (int i = 0; i < orchars.length; i++) {
                        char c = orchars[i];
                        for (int j = startIndex; j < currchars.length; j++) {
                            if (currchars[j] == c) {
                                startIndex = j + 1;
                                sub += c;
                                break;
                            }
                        }
                    }

                    longest.put(name, sub);

                }
                String longname = "";
                int max = 0;
                ArrayList<String> names = new ArrayList<String>();
                for (Map.Entry<String, String> lon : longest.entrySet()) {
                    if (lon.getValue().length() > max) {
                        names.clear();
                        names.add(lon.getKey());
                        max = lon.getValue().length();
                    } else if (lon.getValue().length() == max) {
                        names.add(lon.getKey());
                    }
                }
                Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
                longname += names.get(0);
                for (int i = 1; i < names.size(); i++) {
                    longname += ", " + names.get(i);
                }
                System.out.println(longname);
            }
        }
    }
}
