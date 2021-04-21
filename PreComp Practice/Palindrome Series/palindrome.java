import java.util.*;
import java.io.*;

class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("palindrome.in"));
        int numCases = Integer.parseInt(br.readLine());
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("palindrome.out")));
        

        
        for(int i=0; i<numCases; i++){
            ArrayList<Integer> failed = new ArrayList<Integer>();
            int numwords = Integer.parseInt(br.readLine());

            for(int j=0; j<numwords; j++){
                //load in data and make everything lowercase
                String word = br.readLine();
                char[] chars = word.toCharArray();
                for(int k=0; k<chars.length; k++){
                    chars[k] = Character.toLowerCase(chars[k]);
                }

                //check if it is a palindrome
                boolean palindrome = true;
                    for (int k = 0; k < chars.length/2; k++){
                        if(chars[k]!=chars[chars.length-k-1]){
                            palindrome = false;
                        }
                    }
                    //if not write which case it is that failed
                    if(!palindrome){
                        failed.add(j+1);
                    }
            }

            //print results
            if(failed.size()==0){
                pw.println("True");
            }
            else{

                pw.print("False - ");
                for (int z = 0; z < failed.size()-1; z++){
                    pw.print(failed.get(z) + ", ");
                }
                pw.println(failed.get(failed.size()-1));
            }
        }

        
        
        br.close();
        pw.close();
    }
}