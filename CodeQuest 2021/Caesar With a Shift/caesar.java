import java.util.*;

public class caesar {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                String message = input.nextLine();
                StringTokenizer st1 = new StringTokenizer(input.nextLine());
                StringTokenizer st2 = new StringTokenizer(input.nextLine());
                int shiftSetLength = st1.countTokens();
                int directionSetLength = st2.countTokens();
                char[] messageArray = message.toCharArray();

                ArrayList<Integer> shiftSet = new ArrayList<Integer>();
                ArrayList<Integer> directionSet = new ArrayList<Integer>();

                for (int i = 0; i < shiftSetLength; i++){
                    shiftSet.add(Integer.parseInt(st1.nextToken()));
                }
                for (int i = 0; i < directionSetLength; i++){
                    directionSet.add(Integer.parseInt(st2.nextToken()));
                }

                int end = 0;
                if (shiftSetLength < directionSetLength){
                    end = directionSetLength;
                    int difference = directionSetLength - shiftSetLength;
                    for (int i = 0; i < difference; i++){
                        shiftSet.add(shiftSet.get(i));
                    }
                }
                if (shiftSetLength > directionSetLength){
                    end = shiftSetLength;
                    int difference = shiftSetLength - directionSetLength;
                    for (int i = 0; i < difference; i++){
                        directionSet.add(directionSet.get(i));
                    }
                }

                for (int i = 0; i < end; i++){
                    if (directionSet.get(i) == 0){
                        for (int j = 0; j < messageArray.length; j++){
                            boolean lowercase = false;
                            if (messageArray[j] < 65 || messageArray[j] > 90 && messageArray[j] < 97 || messageArray[j] > 122){
                                System.out.println("here1");
                                continue;
                            }
                            if (messageArray[j] > 97){
                                lowercase = true;
                            }
                            messageArray[j] = (char) ((int)messageArray[j] - shiftSet.get(i));
                            if (lowercase == true){
                                while (messageArray[j] < 97 || messageArray[j] > 122){
                                    messageArray[j] = (char) ((int)messageArray[j] - 26);
                                }
                            }
                            else {
                                while (messageArray[j] < 65 || messageArray[j] > 90){
                                    messageArray[j] = (char) ((int)messageArray[j] - 26);
                                }
                            }
                            
                        }
                    } else {

                        for (int j = 0; j < messageArray.length; j++){
                            boolean lowercase = false;
                            if (messageArray[j] < 65 || messageArray[j] > 90 && messageArray[j] < 97 || messageArray[j] > 122){
                                System.out.println("here2");
                                continue;
                            }
                            if (messageArray[j] > 97 || messageArray[j] < 122){
                                lowercase = true;
                            }
                            messageArray[j] = (char) ((int)messageArray[j] + shiftSet.get(i));
                            if (lowercase == true){
                                while (messageArray[j] < 97 || messageArray[j] > 122){
                                    messageArray[j] = (char) ((int)messageArray[j] - 26);
                                }
                            }
                            else {
                                while (messageArray[j] < 65 || messageArray[j] > 90){
                                    messageArray[j] = (char) ((int)messageArray[j] - 26);
                                }
                            }
                        }
                    }
                }

            for (int i = 0; i < messageArray.length; i++){
                if (i == messageArray.length - 1){
                    System.out.print(Character.toLowerCase(messageArray[i])+"\n");
                }
                else {
                    System.out.print(Character.toLowerCase(messageArray[i]));
                }
            }
            }
        }
    }
}
