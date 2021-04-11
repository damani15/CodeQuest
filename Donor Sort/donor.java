import java.util.*;
import java.io.*;

class donor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("donor.in"));
        int numCases = Integer.parseInt(br.readLine());
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("donor.out")));
        

        for(int i=0; i<numCases; i++){
            
            ArrayList<String> current = new ArrayList<String>();
            ArrayList<String> both = new ArrayList<String>();
            ArrayList<String> last = new ArrayList<String>();
            
            StringTokenizer lastyear = new StringTokenizer(br.readLine(),  ",");
            StringTokenizer currentyear = new StringTokenizer(br.readLine(), ",");
            
            while(currentyear.hasMoreTokens()){
                current.add(currentyear.nextToken());
            }
            while(lastyear.hasMoreTokens()){
                last.add(lastyear.nextToken());
            }

            
            System.out.println(current.size());
            for(int j=0; j<current.size(); j++){
                System.out.println(current.get(j));
                for(int g=0; g<last.size(); g++){
                    if(current.get(j).equals(last.get(g))){  
                        both.add(current.get(j));
                        current.remove(j);
                        j--;
                        last.remove(g);     
                        break;
                    }
                }
            }

            last = sort(last);

            for(int j=0; j<last.size(); j++){
                if(j==0){
                    pw.print(last.get(j));
                }
                else{ 
                    pw.print("," + last.get(j));
                }
            }

            pw.println();
            
            both = sort(both);
            for(int j=0; j<both.size(); j++){
                if(j==0){
                    pw.print(both.get(j));
                }
                else{ 
                    pw.print("," + both.get(j));
                }
            
            }
            pw.println();
            
            current = sort(current);
            for(int j=0; j<current.size(); j++){
                if(j==0){
                    pw.print(current.get(j));
                }
                else{ 
                    pw.print("," + current.get(j));
                }
            }
            if(i!=numCases-1){
                pw.println();
    
            }
        }
            
            pw.close();
            br.close();
        }
    
    public static ArrayList<String> sort(ArrayList<String> tofin){
        ArrayList<String> copy = new ArrayList<String>();
        for(int i=0; i<tofin.size(); i++){
            copy.add(tofin.get(i));
        }

        boolean sortT=false;
		//implement bubble sort
		while(sortT==false){ //while there are still switches being made
			sortT=true; //true
		for(int i=0; i<copy.size()-1; i++){ 

			if((int) copy.get(i).toCharArray()[0]> (int) copy.get(i+1).toCharArray()[0]){
				String hold = copy.get(i);
				copy.set(i, copy.get(i+1)); 
				copy.set(i+1, hold); 
				sortT=false; //switch made so false
			}
		}

    }

    return copy;  
    }
}   