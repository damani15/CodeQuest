import java.util.*;

public class caesarw {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                char [] change = (input.nextLine().toLowerCase()).toCharArray();
                StringTokenizer rotnum = new StringTokenizer(input.nextLine());
                StringTokenizer rotdir = new StringTokenizer(input.nextLine());
                ArrayList<Integer> num = new ArrayList<Integer>();
                ArrayList<Integer> dir = new ArrayList<Integer>();
                while(rotnum.hasMoreTokens()){
                    num.add(Integer.parseInt(rotnum.nextToken()));
                }
                while(rotdir.hasMoreTokens()){
                    dir.add(Integer.parseInt(rotdir.nextToken()));
                }
                
                int through=0;
                int newval = 0;
                for(int i=0; i<change.length; i++){
                    if((int)change[i]>96 && (int)change[i]<123){
                        
                        if(dir.get(through%dir.size())==1){
                            newval = ((int)change[i] -num.get(through%num.size()));
                        }
                        else {
                            newval = ((int)change[i] +num.get(through%num.size()));
                        }
                        if(newval>122){
                            newval-=26;
                        }
                        else if(newval<97){
                            newval+=26;
                        }
                        change[i] = (char) newval;

                        through++;
                    }
                }

                for(int i=0; i<change.length; i++){
                    if(i==change.length-1){
                        System.out.println(change[i]);
                    }
                    else{
                        System.out.print(change[i]);
                    }
                }   


            }
        }
    }
}
