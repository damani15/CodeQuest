import java.util.*;

public class peoplebook {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int numPeople = Integer.parseInt(input.nextLine());
                String fakeArray = input.nextLine();
                String[] test = fakeArray.split(",");
                for (int i = 0; i < test.length; i++) {
                    test[i] = test[i].replaceAll("[\\[\\]]", "");
                }
                String[] names = new String[numPeople];
                for (int i = 0; i < numPeople; i++) {
                    names[i] = input.nextLine();
                }

                for (int i = 0; i < numPeople; i++) {
                    String name = names[i];
                    System.out.println("Name: " + name);
                    int indexOffset = 0;
                    for (int z = 0; z < numPeople; z++) {
                        if (test[z].equals(name)) {
                            indexOffset = z;
                            break;
                        }
                    }
                    System.out.println("Age: " + test[numPeople + indexOffset]);
                    System.out.println("Instagram: " + test[numPeople * 2 + indexOffset]);
                    System.out.println("Twitter: " + test[numPeople * 3 + indexOffset]);
                    System.out.println("Phone: " + test[numPeople * 4 + indexOffset]);
                    System.out.println("Email: " + test[numPeople * 5 + indexOffset]);
                }
            }
        }
    }
}
