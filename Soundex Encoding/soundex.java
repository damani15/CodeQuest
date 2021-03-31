import java.util.*;
import java.io.*;

class soundex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("soundex.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("soundex.out")));

        int testcases = Integer.parseInt(br.readLine());
        char[][] groups = { { 'b', 'f', 'p', 'v' }, { 'c', 'g', 'j', 'k', 'q', 's', 'x', 'z' }, { 'd', 't' }, { 'l' },
                { 'm', 'n' }, { 'r' }, { 'h', 'w' }, { 'a', 'e', 'i', 'o', 'u' } };

        for (int i = 0; i < testcases; i++) {
            int lines = Integer.parseInt(br.readLine());
            pw.println("OUTPUT");
            HashMap<String, Integer> codes = new HashMap<String, Integer>();

            for (int j = 0; j < lines; j++) {
                String currentName = br.readLine();

                ArrayList<Character> chars = new ArrayList<Character>();
                for (char c : currentName.toCharArray()) {
                    chars.add(c);
                }
                // step 1 (adjacent removal based on groups)
                int index = -1;
                int group = -1;
                boolean found = false;
                for (int x = 0; x < chars.size(); x++) {
                    for (int k = 0; k < 6; k++) {
                        index = -1;
                        group = -1;

                        for (int z = 0; z < groups[k].length; z++) {

                            if (Character.toLowerCase(chars.get(x)) == groups[k][z]) {
                                found = true;
                                index = x;
                                group = k;
                                break;
                            }

                        }
                        if (found) {
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
                if (index != -1) {
                    boolean remove = true;
                    while (index + 1 < chars.size() && remove) {
                        remove = false;
                        for (int z = 0; z < groups[group].length; z++) {
                            if (chars.get(index + 1) == groups[group][z] || chars.get(index + 1) == 'h'
                                    || chars.get(index + 1) == 'w') {
                                chars.remove(index + 1);
                                remove = true;
                            }
                        }
                    }
                }
                // step 2 (vowels and wild)
                for (int k = 1; k < chars.size(); k++) {
                    if (chars.get(k) == 'a' || chars.get(k) == 'e' || chars.get(k) == 'i' || chars.get(k) == 'o'
                            || chars.get(k) == 'u' || chars.get(k) == 'y' || chars.get(k) == 'h'
                            || chars.get(k) == 'w') {
                        chars.remove(k);
                        k--;
                    }
                }
                // step 3 (group numbers)
                for (int x = 1; x < chars.size(); x++) {
                    for (int k = 0; k < 6; k++) {
                        for (int z = 0; z < groups[k].length; z++) {
                            if (chars.get(x) == groups[k][z]) {
                                chars.set(x, (char) (k + 49));
                            }
                        }
                    }
                }
                // step 4 (add 0s)
                chars.set(0, Character.toUpperCase(chars.get(0)));
                int cnt = 0;
                for (int k = 0; k < chars.size(); k++) {
                    if (46 < (int) chars.get(k) && (int) chars.get(k) < 58) {
                        cnt += 1;
                        if (cnt > 3) {
                            chars.remove(k);
                            k--;
                        }
                    }
                }

                while (cnt < 3) {
                    cnt += 1;
                    chars.add('0');
                }

                // adding to hashmap
                String output = "";
                for (Character c : chars) {
                    output += c;
                }
                if (codes.containsKey(output)) {
                    codes.put(output, codes.get(output) + 1);
                } else {
                    codes.put(output, 1);
                }
            }
            Map<String, Integer> map = new TreeMap<String, Integer>(codes);
            for (Map.Entry<String, Integer> item : map.entrySet()) {
                pw.println(item.getKey() + " " + item.getValue());
            }
        }
        br.close();
        pw.close();
    }
}