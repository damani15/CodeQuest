import java.util.*;
import java.io.*;

class charlie {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("charlie.in"));
        int testcases = Integer.parseInt(br.readLine());
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("charlie.out")));
        String[] alphabet = { "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo",
                "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu"};
                
        for(int i=0; i<testcases; i++){

            int stringnum = Integer.parseInt(br.readLine());

            for(int j=0; j<stringnum; j++){
                String ret = new String(); //string that we return
                String hold = br.readLine(); //word we are converting
                char[] chars = hold.toCharArray();
                for(int g=0; g<chars.length; g++){

                    int c = (int) Character.toLowerCase(chars[g]); //convert word
                    if(c-97>0){

                        ret += alphabet[c-97];
                        if(g!=chars.length-1){
                            ret += "-"; //add a dash 
                        }
                    }
                    
                    else{  //a space
                        ret = ret.substring(0, ret.length()-1); //remove the dash
                        ret += " ";  //add a space
                    }
                }
                pw.println(ret);
            }

        }
    

        
        br.close();
        pw.close();
    }
}