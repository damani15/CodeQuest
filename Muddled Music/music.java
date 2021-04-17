import java.util.*;

public class music {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int numPairs = Integer.parseInt(input.nextLine());
                ArrayList<ArrayList<String>> pairs = new ArrayList<ArrayList<String>>();
                for (int i = 0; i < numPairs; i++) {
                    StringTokenizer st = new StringTokenizer(input.nextLine(), "-");
                    ArrayList<String> current = new ArrayList<String>();
                    current.add(st.nextToken().trim());
                    String name = st.nextToken().trim();
                    if (name.length() > 3 && name.charAt(0) == 'T' && name.charAt(1) == 'h' && name.charAt(2) == 'e'
                            && name.charAt(3) == ' ') {
                        current.add(name.substring(4));
                        current.add("The ");
                    } else {
                        current.add(name);
                    }
                    pairs.add(current);
                }

                ArrayList<String> names = new ArrayList<String>();

                for (int i = 0; i < numPairs; i++) {
                    names.add(pairs.get(i).get(1));
                }
                ArrayList<String> names2 = new ArrayList<String>(new HashSet<>(names));
                Collections.sort(names2, String.CASE_INSENSITIVE_ORDER);

                for (int i = 0; i < names2.size(); i++) {
                    ArrayList<String> songsByArtist = new ArrayList<String>();
                    for (int j = 0; j < numPairs; j++) {
                        if (pairs.get(j).get(1).equals(names2.get(i))) {
                            songsByArtist.add(pairs.get(j).get(0));
                        }
                    }
                    Collections.sort(songsByArtist, String.CASE_INSENSITIVE_ORDER);
                    for (int j = 0; j < songsByArtist.size(); j++) {
                        boolean hasThe = false;
                        System.out.print(songsByArtist.get(j) + " - ");
                        for (int z = 0; z < numPairs; z++) {
                            if (names2.get(i).equals(pairs.get(z).get(1)) && pairs.get(z).size() == 3) {
                                hasThe = true;
                                break;
                            }
                        }
                        if (hasThe) {
                            System.out.print("The ");
                        }
                        System.out.println(names2.get(i));
                    }
                }
            }
        }
    }
}
