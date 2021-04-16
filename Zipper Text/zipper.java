import java.util.*;

public class zipper {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            
            for (int testcase = 0; testcase < testCases; testcase++) {
                int uLines = Integer.parseInt(input.nextLine());
                String uLineLengths = input.nextLine();
                int lLines = Integer.parseInt(input.nextLine());
                String lLineLengths = input.nextLine();
                String lowercase = "";
                String uppercase = "";
                String line = input.nextLine();
                
                while (line != null){
                    for (int i = 0; i < line.length(); i++){
                        if (Character.isLowerCase(line.charAt(i))){
                            lowercase += line.charAt(i);
                        }
                        else if (Character.isUpperCase(line.charAt(i))){
                            uppercase += line.charAt(i);
                        }
                        else if (line.charAt(i) == 61){
                            lowercase += " ";
                        }
                        else if (line.charAt(i) == 45){
                            uppercase += " ";
                        }
                    }
                    if (input.hasNextLine()){
                        line = input.nextLine();
                    }
                    else {
                        break;
                    }
                    
                }
                int uOffset = 0;
                int lOffset = 0;
                int uEnd = 0;
                int lEnd = 0;

                StringTokenizer stU = new StringTokenizer(uLineLengths);
                StringTokenizer stL = new StringTokenizer(lLineLengths);
                
                for (int i = 0; i < uLines; i++){
                    uEnd += Integer.parseInt(stU.nextToken());
                    System.out.println(uppercase.substring(0 + uOffset, uEnd));
                    uOffset += uEnd;
                    System.out.println("Start: " + uOffset + " End: " + uEnd);
                }
                for (int i = 0; i < lLines; i++){
                    lEnd += Integer.parseInt(stL.nextToken());
                    System.out.println(lowercase.substring(0 + lOffset, lEnd));
                    lOffset += lEnd;
                }
                
                
            }
        }
    }
}