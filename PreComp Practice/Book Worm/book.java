import java.util.Scanner;

public class book {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
           
           String hold = "";
            while(input.hasNext()){
                hold =  input.nextLine();
                char[] chars = hold.toCharArray();

                int sum=0;
                int checkdigit = Integer.parseInt(String.valueOf(chars[chars.length-1]));
                int count=0;
                for(int i=0; i<chars.length; i++){
                    int h = chars[i];
                    
                    if(h<58 && h>47){
                        
                        int val2 = Integer.parseInt(String.valueOf(chars[i]));
                    
                        if(count%2==0){

                            sum = sum + val2;

                        }

                        else{
                                
                            sum+= 3*val2;

                        }
                        count+=1;
                    }
                }
                    
                if(sum%10 == 0){
                    System.out.println("VALID");
                }
                else{
                    System.out.println((checkdigit+sum%10)%10);
                }
            }
        }
    }
}
