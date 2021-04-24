import java.util.*;

public class asteroid {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                int asteroids = Integer.parseInt(input.nextLine());
                ArrayList<String> output = new ArrayList<String>();
                
                for (int i = 0; i < asteroids; i++){
                    output.add(input.nextLine());
                }
                
                /*
                for (int i = 0; i < asteroids - 1; i++){
                    StringTokenizer st1 = new StringTokenizer(output.get(i));
                    double x1 = Double.parseDouble(st1.nextToken());
                    double y1 = Double.parseDouble(st1.nextToken());
                    for (int j = 0; j < asteroids - i - 1; j++){
                        StringTokenizer st2 = new StringTokenizer(output.get(j));
                        double x2 = Double.parseDouble(st2.nextToken());
                        double y2 = Double.parseDouble(st2.nextToken());

                        if (((x1*x1) + (y1*y1)) < ((x2*x2) + (y2*y2))){
                            String temp = output.get(j);
                            output.set(j, output.get(i));
                            output.set(i, temp);
                        }
                    }
                }
                */
                Boolean sortT = false;

                while(sortT==false){ //while there are still switches being made
                    sortT=true; //true
                for(int i=0; i<asteroids-1; i++){ 
                    StringTokenizer st1 = new StringTokenizer(output.get(i));
                    double x1 = Double.parseDouble(st1.nextToken());
                    double y1 = Double.parseDouble(st1.nextToken());
                    StringTokenizer st2 = new StringTokenizer(output.get(i+1));
                    double x2 = Double.parseDouble(st2.nextToken());
                    double y2 = Double.parseDouble(st2.nextToken());
                    double first = ((x1*x1) + (y1*y1));
                    double second = ((x2*x2) + (y2*y2));
                    if(first>second){
                        String temp = output.get(i);
                        output.set(i, output.get(i+1));
                        output.set(i+1, temp);
                        sortT=false; //switch made so false
                    }
                }
            }
                for (int i = 0; i < output.size(); i++){
                    System.out.println(output.get(i));
                }
            }
        }
    }
}
