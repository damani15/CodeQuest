import java.util.*;

public class poly {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                StringTokenizer line1 = new StringTokenizer(input.nextLine());
                StringTokenizer line2 = new StringTokenizer(input.nextLine());
                ArrayList<Integer> ln1 = new ArrayList<Integer>();
                ArrayList<Integer> ln2 = new ArrayList<Integer>();
                while(line1.hasMoreTokens()){
                    ln1.add(Integer.parseInt(line1.nextToken()));
                }
                while(line2.hasMoreTokens()){
                    ln2.add(Integer.parseInt(line2.nextToken()));
                }


                int [] output = new int [(ln2.size()+ln1.size())-1];

                for(int i=0; i<ln1.size(); i++){
                    for(int g=0; g<ln2.size(); g++){
                        output[i+g]+=ln1.get(i)*ln2.get(g);
                    }
                }

                String out = "";

                for(int i=0; i<output.length; i++){
                    if(i==0){
                        if(output[i]!=0){
                            out += output[i];
                        }
                    }
                    else{
                        if(output[i]!=0){
                            if(out.length()!=0){
                                if(output[i]>0){
                                    out += "+";
                                }
                                else{
                                    out += "-";
                                }
                            }
                            if(Math.abs(output[i])!=1){
                                out+= output[i];
                            }
                            out+= "x";

                            if(i>1){
                                out +="^";
                                out += i;
                            }
                            
                        }
                    }
                    
                }
                for(int i=0; i<out.length()-2; i++){
                    if(out.substring(i,i+1).equals("-") && out.substring(i+1,i+2).equals("-")){
                        out = out.substring(0, i)+out.substring(i+1, out.length());
                    }
                }
                if(out.length()>0){
                    System.out.println(out);
                }
            }
        }
    }
}
