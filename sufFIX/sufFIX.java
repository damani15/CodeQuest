import java.util.*;

import java.io.*;

class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sufFIX.in"));
        int numCases = Integer.parseInt(br.readLine());
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sufFIX.out")));
        

        for(int i=0; i<numCases; i++){
            String hold = br.readLine();
            char[] chars = hold.toCharArray();
        
            // check the last digit  
            if(chars[chars.length-3] == '1'){
                
                chars[chars.length-1] = 't';
                chars[chars.length-2] = 's';
               
                if(chars.length>3){
                    //check for 11
                    if(chars[chars.length-4] == '1'){
                        pw.println(hold);
                    }
                    else{
                        for(int k=0; k<chars.length-1; k++){
                            pw.print(chars[k]);
                        }
                        pw.println(chars[chars.length-1]);
                    }
                }
                else{
                    for(int k=0; k<chars.length-1; k++){
                        pw.print(chars[k]);
                    }
                    pw.println(chars[chars.length-1]);
                }
                
            }
            else if(chars[chars.length-3] == '2'){
                chars[chars.length-1] = 'd';
                chars[chars.length-2] = 'n';
                  
                if(chars.length>3){
                    if(chars[chars.length-4] == '1'){
                        pw.println(hold);
                    }
                    else{
                        for(int k=0; k<chars.length-1; k++){
                            pw.print(chars[k]);
                        }
                        pw.println(chars[chars.length-1]);
                    }
                }
                else{
                    for(int k=0; k<chars.length-1; k++){
                        pw.print(chars[k]);
                    }
                    pw.println(chars[chars.length-1]);
                }
            }

            else if(chars[chars.length-3] == '3'){
                chars[chars.length-1] = 'd';
                chars[chars.length-2] = 'r';
                  
                if(chars.length>3){
                    if(chars[chars.length-4] == '1'){
                        pw.println(hold);
                    }
                    else{
                        for(int k=0; k<chars.length-1; k++){
                            pw.print(chars[k]);
                        }
                        pw.println(chars[chars.length-1]);
                    }
                }
                else{
                    for(int k=0; k<chars.length-1; k++){
                        pw.print(chars[k]);
                    }
                    pw.println(chars[chars.length-1]);
                }
            }

            else{
                pw.println(hold);
            }

        }
        pw.close();
        br.close();
    }
}