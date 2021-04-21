import java.util.*;

public class xml {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String line = input.nextLine();
            ArrayList<String> elements = new ArrayList<String>();
            while (line != null) {

                int start = -1;
                int end = -1;

                for (int i = 0; i < line.length(); i++) {

                    if (line.charAt(i) == '<' && line.charAt(i + 1) != '/') {
                        start = i;
                    }
                    if (line.charAt(i) == '>' && start != -1) {
                        end = i;
                    }

                    if (start != -1 && end != -1) {
                        break;
                    }

                }
                if (start != end) {
                    elements.add(line.substring(start + 1, end));
                }
                if (input.hasNextLine()) {
                    line = input.nextLine();
                } else {
                    break;
                }
            }
            ArrayList<String> elements2 = new ArrayList<String>(new HashSet<>(elements));

            for (int j = 0; j < elements2.size(); j++) {
                String current = elements.remove(0);
                int count = 1;
                for (int i = 0; i < elements.size(); i++) {
                    if (elements.get(i).equals(current)) {
                        count++;
                        elements.remove(i);
                        i--;
                    }
                }
                System.out.println(current + " " + count);
            }
        }
    }
}