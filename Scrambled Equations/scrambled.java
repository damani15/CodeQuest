import java.util.*;
import java.io.*;

class scrambled {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("scrambled.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("scrambled.out")));

        int numCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numCases; i++) {

            // loading stuff
            String sh = br.readLine();
            StringTokenizer st = new StringTokenizer(sh);
            String split = st.nextToken();
            boolean possible = false;
            ArrayList<String> tokens = new ArrayList<String>();
            ArrayList<Character> operators = new ArrayList<Character>();
            ArrayList<String> nums = new ArrayList<String>();
            while (st.hasMoreTokens()) {
                tokens.add(st.nextToken());
            }

            st = new StringTokenizer(split, ":");
            int goal = Integer.parseInt(st.nextToken());
            tokens.add(st.nextToken());

            for (String s : tokens) {
                try {
                    Integer.parseInt(s);
                    nums.add(s);
                } catch (NumberFormatException e) {
                    operators.add(s.charAt(0));
                }
            }

            // solving problem

            // add operands
            String[] equation = new String[nums.size() + operators.size()];
            ArrayList<String[]> npermutations = new ArrayList<String[]>();
            ArrayList<String[]> opermutations = new ArrayList<String[]>();
            String[] nums2 = new String[nums.size()];
            String[] operators2 = new String[operators.size()];

            for (int j = 0; j < nums.size(); j++) {
                nums2[j] = nums.get(j);
            }

            for (int j = 0; j < operators.size(); j++) {
                operators2[j] = Character.toString(operators.get(j));
            }

            // add nums and solve
            printAllRecursive(nums.size(), nums2, npermutations); // nums
            printAllRecursive(operators.size(), operators2, opermutations); // operators

            for (int h = 0; h < opermutations.size(); h++) {
                int pos = 0;
                for (int l = 1; l < equation.length; l += 2) {
                    equation[l] = opermutations.get(h)[pos];
                    pos++;
                }
                for (int z = 0; z < npermutations.size(); z++) {
                    int pos2 = 0;
                    for (int g = 0; g < equation.length; g += 2) {
                        equation[g] = npermutations.get(z)[pos2];
                        pos2++;
                    }
                }
                if (evaluator(equation) == goal) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                pw.println("TRUE");
            } else {
                pw.println("FALSE");
            }
        }

        br.close();
        pw.close();
    }

    public static int evaluator(String[] eq) {

        int num = 0;

        if (eq.length > 2) {
            num = operate(Integer.parseInt(eq[0]), eq[1], Integer.parseInt(eq[2]));
        }

        for (int i = 3; i < eq.length; i += 2) {
            num = operate(num, eq[i], Integer.parseInt(eq[i + 1]));
        }

        return num;
    }

    public static int operate(int a, String operand, int c) {

        if (operand.equals("/")) {
            return a / c;
        } else if (operand.equals("*")) {
            return a * c;
        } else if (operand.equals("+")) {
            return a + c;
        } else if (operand.equals("-")) {
            return a - c;
        }

        return -1;
    }

    public static void printAllRecursive(int n, String[] elements, ArrayList<String[]> equations) {

        if (n == 1) {
            String[] elementsCopy = new String[elements.length];
            for (int i = 0; i < elements.length; i++) {
                elementsCopy[i] = elements[i];
            }
            equations.add(elementsCopy);
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements, equations);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements, equations);
        }
    }

    public static void swap(String[] input, int a, int b) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
}