import java.util.*;

public class assemble {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer st = new StringTokenizer(input.nextLine());
                HashMap<String, Integer> agents = new HashMap<String, Integer>();
                while (st.hasMoreTokens()) {
                    String current = st.nextToken();
                    String agent = current.substring(0, 1);
                    int num = Integer.parseInt(current.substring(2));
                    agents.put(agent, num);
                }
                ArrayList<Integer> values = new ArrayList<Integer>();
                for (int i : agents.values()) {
                    values.add(i);
                }
                Collections.sort(values);
                ArrayList<ArrayList<Integer>> tests = new ArrayList<ArrayList<Integer>>();
                for (int i = 0; i < values.size(); i++) {
                    int current = values.get(i);
                    ArrayList<Integer> test = new ArrayList<Integer>();
                    test.add(current);
                    int max = current + 10;
                    int min = current - 10;
                    for (int j = 0; j < values.size(); j++) {
                        if (j != i) {
                            if (Math.abs(values.get(j) - current) <= 10) {
                                test.add(values.get(j));
                            }
                        }
                    }
                    Collections.sort(test);
                    if (Math.abs(test.get(0) - test.get(test.size()-1)) <= 10) {
                        tests.add(test);
                    } else {
                        ArrayList<Integer> s = new ArrayList<Integer>();
                        ArrayList<Integer> s2 = new ArrayList<Integer>();
                        for (int j = 0; j < test.size()-2; j++) {
                            s.add(test.get(j));
                        }
                        for (int j = 1; j < test.size()-1; j++) {
                            s2.add(test.get(j));
                        }
                        if (Math.abs(s.get(0) - s.get(s.size()-1)) <= 10) {
                            tests.add(s);
                        }
                        if (Math.abs(s2.get(0) - s2.get(s2.size() - 1)) <= 10) {
                            tests.add(s2);
                        }
                    }
                }
                for (ArrayList<Integer> s : tests) {
                    System.out.println(Arrays.toString(s.toArray()));
                }
                // int max = tests.get(0).size();
                // for (ArrayList<Integer> s : tests) {
                //     if (s.size() > max) {
                //         max = s.size();
                //     }
                // }
                // for (int i = 0; i < tests.size(); i++) {
                //     if (tests.get(i).size() < max) {
                //         tests.remove(i);
                //     }
                // }
                // if (tests.size() == 1) {
                //     printAgents(agents, tests.get(0));
                // }
            }
        }
    }
    public static void printAgents(HashMap<String, Integer> agents, ArrayList<Integer> values) {
        ArrayList<String> names = new ArrayList<String>();
        for (Map.Entry<String, Integer> s : agents.entrySet()) {
            String name = s.getKey();
            int value = s.getValue();
            if (values.contains(value)) {
                names.add(name);
            }
        }
        Collections.sort(names);
        for (int i = 0; i < names.size(); i++) {
            if (i == names.size()-1) {
                System.out.println(names.get(i));
            } else {
                System.out.print(names.get(i) + " ");
            }
        }
    }
}
