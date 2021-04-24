import java.util.*;

public class homeward {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int pairs = Integer.parseInt(input.nextLine());
                ArrayList<String> out = new ArrayList<String>();
                ArrayList<String> in = new ArrayList<String>();
                for (int city = 0; city < pairs; city++) {
                    StringTokenizer st = new StringTokenizer(input.nextLine());
                    in.add(st.nextToken());
                    out.add(st.nextToken());
                }
                String hold = "";
                for(int i=0; i<in.size(); i++){
                    if(!(out.contains(in.get(i)))){
                        hold = in.get(i);
                    }
                }
                for(int i=0; i<out.size(); i++){
                    if(!(in.contains(out.get(i)))){ //doesnt contain
                        System.out.println(out.get(i));    
                        out.remove(i);
                        in.remove(i);
                        i=0;
                    }
                }

                if(out.size()>0){
                    System.out.println(out.get(0));
                    if(!in.get(0).equals(hold)){
                        System.out.println(in.get(0));
                    }
                }
                if(hold!=null){
                    System.out.println(hold); //original city
                }
            }
        }
    }
}
