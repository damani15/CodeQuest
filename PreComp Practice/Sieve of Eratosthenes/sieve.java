import java.util.*;

public class sieve {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int goal = Integer.parseInt(input.nextLine());
                ArrayList<Integer> nums = new ArrayList<Integer>();
                for (int i = 2; i <= goal; i++) { 
                    nums.add(i);
                }
                for (int i = 0; i < nums.size(); i++) {
                    int num = nums.get(i);
                    int total = 0;
                    for (int j = i+1; j < nums.size(); j++) {
                        if (nums.get(j)%num == 0) {
                            nums.remove(j);
                            total++;
                        }
                    }
                    if (total != 0) {
                        System.out.println("Prime " + num + " Composite Set Size: " + total);
                    }
                }
                System.out.print("{");
                for (int i = 0; i < nums.size(); i++) {
                    if (i != nums.size()-1)
                        System.out.print(nums.get(i) + ",");
                    else
                        System.out.print(nums.get(i));
                }
                System.out.println("}");
            }
        }
    }
}
