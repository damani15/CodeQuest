import java.util.*;

public class codebreaker {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int lines = Integer.parseInt(input.nextLine());
                double total = 0;
                double a = 0;
                double b = 0;
                double c = 0;
                double d = 0;
                double e = 0;
                double f = 0;
                double g = 0;
                double h = 0;
                double i = 0;
                double j = 0;
                double k = 0;
                double l = 0;
                double m = 0;
                double n = 0;
                double o = 0;
                double p = 0;
                double q = 0;
                double r = 0;
                double s = 0;
                double t = 0;
                double u = 0;
                double v = 0;
                double w = 0;
                double x = 0;
                double y = 0;
                double z = 0;
                for(int xx=0; xx<lines; xx++){
                    String hold = input.nextLine().toLowerCase();
                    char[] chars = hold.toCharArray();
                    for(int in=0; in<chars.length; in++){
                        if(chars[in] == 'a'){
                            a+=1;
                            total++;
                        }
                        else if(chars[in] == 'b'){
                            b++;
                            total++;
                        }
                        else if(chars[in] == 'c'){
                            c++;
                            total++;
                        }
                        else if(chars[in] == 'd'){
                            d++;
                            total++;
                        }
                        else if(chars[in] == 'e'){
                            e++;
                            total++;
                        }
                        else if(chars[in] == 'f'){
                            f++;
                            total++;
                        }
                        else if(chars[in] == 'g'){
                            g++;
                            total++;
                        }
                        else if(chars[in] == 'h'){
                            h++;
                            total++;
                        }
                        else if(chars[in] == 'i'){
                            i++;
                            total++;
                        }
                        else if(chars[in] == 'j'){
                            j++;
                            total++;
                        }
                        else if(chars[in] == 'k'){
                            k++;
                            total++;
                        }
                        else if(chars[in] == 'l'){
                            l++;
                            total++;
                        }
                        else if(chars[in] == 'm'){
                            m++;
                            total++;
                        }
                        else if(chars[in] == 'n'){
                            n++;
                            total++;
                        }
                        else if(chars[in] == 'o'){
                            o++;
                            total++;
                        }
                        else if(chars[in] == 'p'){
                            p++;
                            total++;
                        }
                        else if(chars[in] == 'q'){
                            q++;
                            total++;
                        }
                        else if(chars[in] == 'r'){
                            r++;
                            total++;
                        }
                        else if(chars[in] == 's'){
                            s++;
                            total++;
                        }
                        else if(chars[in] == 't'){
                            t++;
                            total++;
                        }
                        else if(chars[in] == 'u'){
                            u++;
                            total++;
                        }
                        else if(chars[in] == 'v'){
                            v++;
                            total++;
                        }
                        else if(chars[in] == 'w'){
                            w++;
                            total++;
                        }
                        else if(chars[in] == 'x'){
                            x++;
                            total++;
                        }
                        else if(chars[in] == 'y'){
                            y++;
                            total++;
                        }
                        else if(chars[in] == 'z'){
                            z++;
                            total++;
                        }
                    }
                }

                System.out.println("A: "+ String.format("%.2f", (a/total)*100) + "%");
                System.out.println("B: "+ String.format("%.2f", (b/total)*100) + "%");
                System.out.println("C: "+ String.format("%.2f", (c/total)*100)  + "%");
                System.out.println("D: "+ String.format("%.2f", (d/total)*100) + "%");
                System.out.println("E: "+ String.format("%.2f", (e/total)*100) + "%");
                System.out.println("F: "+ String.format("%.2f", (f/total)*100)  + "%");
                System.out.println("G: "+ String.format("%.2f", (g/total)*100) + "%");
                System.out.println("H: "+ String.format("%.2f", (h/total)*100) + "%");
                System.out.println("I: "+ String.format("%.2f", (i/total)*100)  + "%");
                System.out.println("J: "+ String.format("%.2f", (j/total)*100) + "%");
                System.out.println("K: "+ String.format("%.2f", (k/total)*100) + "%");
                System.out.println("L: "+ String.format("%.2f", (l/total)*100) + "%");
                System.out.println("M: "+ String.format("%.2f", (m/total)*100) + "%");
                System.out.println("N: "+ String.format("%.2f", (n/total)*100)  + "%");
                System.out.println("O: "+ String.format("%.2f", (o/total)*100) + "%");
                System.out.println("P: "+ String.format("%.2f", (p/total)*100) + "%");
                System.out.println("Q: "+ String.format("%.2f", (q/total)*100)  + "%");
                System.out.println("R: "+ String.format("%.2f", (r/total)*100) + "%");
                System.out.println("S: "+ String.format("%.2f", (s/total)*100) + "%");
                System.out.println("T: "+ String.format("%.2f", (t/total)*100)  + "%");
                System.out.println("U: "+ String.format("%.2f", (u/total)*100) + "%");
                System.out.println("V: "+ String.format("%.2f", (v/total)*100) + "%");
                System.out.println("W: "+ String.format("%.2f", (w/total)*100)  + "%");
                System.out.println("X: "+ String.format("%.2f", (x/total)*100) + "%");
                System.out.println("Y: "+ String.format("%.2f", (y/total)*100) + "%");
                System.out.println("Z: "+ String.format("%.2f", (z/total)*100)  + "%");
        
            }
        }
    }
}