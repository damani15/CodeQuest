import java.util.*;

public class tictac {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            String hold = "";

            int testCases = Integer.parseInt(input.nextLine());
           
            for (int testcase = 0; testcase < testCases; testcase++) {
                hold = input.nextLine();
               
                char [] chars = hold.toCharArray();

                if(chars[0]==chars[1] && chars[1]==chars[2]){
                    if(chars[1]!='-'){
                        System.out.println(hold + " = " + chars[1] + "WINS");
                    }
                }
                else if(chars[3]==chars[4] && chars[4]==chars[5]){
                    if(chars[4]!='-'){
                        System.out.println(hold + " = " + chars[4] + "WINS");
                    }
                }
                else if(chars[6]==chars[7] && chars[7]==chars[8]){
                    if(chars[7]!='-'){
                        System.out.println(hold +  " = "  + chars[7] + "WINS");
                    }
                }
                
                //vertical
                else if(chars[0]==chars[3] && chars[3]==chars[6]){
                    if(chars[3]!='-'){
                        System.out.println(hold + " = " + chars[3] + "WINS");
                    }
                }
                else if(chars[1]==chars[4] && chars[4]==chars[7]){
                    if(chars[4]!='-'){
                        System.out.println(hold + " = " + chars[4] + "WINS");
                    }
                }
                else if(chars[2]==chars[5] && chars[5]==chars[8]){
                    if(chars[5]!='-'){
                        System.out.println(hold + " = " + chars[5] + "WINS");
                    }
                }
                //diaganols
                else if(chars[0]==chars[4] && chars[4]==chars[8]){
                    if(chars[7]!='-'){
                        System.out.println(hold + " = " + chars[4] + "WINS");
                    }
                }
                else if(chars[2]==chars[4] && chars[4]==chars[6]){
                    if(chars[4]!='-'){
                        System.out.println(hold + " = " + chars[4] + "WINS");
                    }
                }
                else{
                    System.out.println(hold + " = " +"TIE");
                }

               
            }
        }
    }
}