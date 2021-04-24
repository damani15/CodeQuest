import java.util.*;

public class change {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                double money = Double.parseDouble(input.nextLine());
                int s = (int)(money/100);
                    if(s>9){
                        s=9;
                    }
                System.out.print(s);
                money -= s*100;
                int s2 = (int)(money/50);
                if(s2>9){
                    s2=9;
                }
                System.out.print(s2);
                money -= s2*50;
                int s3 = (int)(money/20);
                System.out.print(s3);
                if(s3>9){
                    s3=9;
                }
                money -= s3*20;
                int s4 = (int)(money/10);
                if(s4>9){
                    s4=9;
                }
                System.out.print(s4);
                money -= s4*10;
                int s5 = (int)(money/5);
                if(s5>9){
                    s5=9;
                }
                System.out.print(s5);
                money -= s5*5;
                money = Double.parseDouble(String.format("%.4f", money));
                int s6 = (int)(money/2);
                System.out.print(s6);
                if(s6>9){
                    s6=9;
                }
                money -= s6*2;
                int s7 = (int)(money);
                if(s7>9){
                    s7=9;
                }
                System.out.print(s7);
                money -= s7;
                money = Double.parseDouble(String.format("%.3f", money));
                money*=100;
                
                int s8 = (int)(money/25);
                if(s8>9){
                    s8=9;
                }
                System.out.print(s8);
                money -= s8*25;
                int s9 = (int)(money/10);
                if(s9>9){
                    s9=9;
                }
                System.out.print(s9);
                money -= s9*10;
                int s10 = (int)(money/5);
                if(s10>9){
                    s10=9;
                }
                System.out.print(s10);
                money -= s10*5;
                int s11 = (int)(money);
                if(s11>9){
                    s11=9;
                }
                System.out.print(s11);
                System.out.println();
            }
        }
    }
}
