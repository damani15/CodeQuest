import java.util.*;

public class launch {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int attempts = Integer.parseInt(input.nextLine());
                ArrayList<String> possible =  new ArrayList<String>();
                for(int a=0; a<attempts; a++){
                    String date = "";
                    StringTokenizer st = new StringTokenizer(input.nextLine());
                    date+=st.nextToken();
                    date+=" ";
                    date+=st.nextToken();

                    int cth = Integer.parseInt(st.nextToken());
                    double wspeed = Double.parseDouble(st.nextToken());
                    double wd = Double.parseDouble(st.nextToken());
                    wd = wd * (Math.PI/180); 
                    double ew = Math.abs(wspeed *  Math.sin(wd)) ; 
                    double ns = Math.abs(wspeed * Math.cos(wd)) ; 

                    
                    
                    if(cth<1001 && ns<20 && ew<40){

                        possible.add(date);
                    }
                

                }
                if(possible.size()>0){
                    if(possible.size()==1){
                        System.out.println(possible.get(0));
                    }
                    else{
                        String hold = "9999-12-31 23:59";
                        for(int i=0; i<possible.size(); i++){
                            String p = possible.get(i);
                            if(Integer.parseInt(p.substring(0,4))<Integer.parseInt(hold.substring(0,4))){
                                hold=p;
                            }
                            else if(Integer.parseInt(p.substring(0,4))==Integer.parseInt(hold.substring(0,4))){
                                if(Integer.parseInt(p.substring(5,7))<Integer.parseInt(hold.substring(5,7))){
                                    hold=p;
                                }
                                else if(Integer.parseInt(p.substring(5,7))==Integer.parseInt(hold.substring(5,7))){
                                    if(Integer.parseInt(p.substring(8,10))<Integer.parseInt(hold.substring(8,10))){
                                        hold=p;
                                    }
                                    else if(Integer.parseInt(p.substring(8,10))==Integer.parseInt(hold.substring(8,10))){
                                        if(Integer.parseInt(p.substring(11,13))<Integer.parseInt(hold.substring(11,13))){
                                            hold=p;
                                        }
                                        else if(Integer.parseInt(p.substring(11,13))==Integer.parseInt(hold.substring(11,13))){
                                            if(Integer.parseInt(p.substring(14,16))<Integer.parseInt(hold.substring(14,16))){
                                                hold=p;
                                            }
                                        }
                                    }
                                }

                            }
                        }
                        System.out.println(hold);
                    }
                }
                else{
                    System.out.println("ABORT LAUNCH");
                }
            }
        }
    }
}
