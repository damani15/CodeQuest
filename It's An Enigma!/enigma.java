// Problem: "It's an Enigma!"
// Contributors: Rohan, Alexander, and Andres

import java.util.*;
import java.io.*;

class enigma {

    public static void main(String[] args) throws IOException {
        int[] rotor1 = { 1, 3, 6, 0, 5, 4, 8, 7, 9, 2 };
        int[] rotor2 = { 0, 3, 5, 2, 6, 9, 1, 4, 8, 7 };
        int[] rotor3 = { 5, 9, 1, 7, 3, 8, 0, 2, 4, 6 };
        int[] rotor4 = { 1, 6, 5, 2, 9, 0, 7, 4, 3, 8 };
        int[] reflector = { 3, 6, 8, 0, 5, 4, 1, 9, 2, 7 };
        int[] rotorrev1 = { 3, 0, 9, 1, 5, 4, 2, 7, 6, 8 };
        int[] rotorrev2 = { 0, 6, 3, 1, 7, 2, 4, 9, 8, 5 };
        int[] rotorrev3 = { 6, 2, 7, 4, 8, 0, 9, 3, 5, 1 };
        int[] rotorrev4 = { 5, 0, 3, 8, 7, 2, 1, 6, 9, 4 };
        ArrayList<int[]> rotors = new ArrayList<int[]>(
                Arrays.asList(rotor1, rotor2, rotor3, rotor4, reflector, rotorrev1, rotorrev2, rotorrev3, rotorrev4));

        BufferedReader br = new BufferedReader(new FileReader("enigma.in"));
        int numCases = Integer.parseInt(br.readLine());

        ArrayList<int[]> hodler = new ArrayList<int[]>();
        ArrayList<String> encrypt = new ArrayList<String>();

        for (int i = 0; i < numCases; i++) {
            int[] order = new int[3];
            int[] spins = new int[3];
            for (int j = 0; j < 3; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                order[j] = (Integer.parseInt(st.nextToken()));
                spins[j] = (Integer.parseInt(st.nextToken()));

            }
            hodler.add(order);
            hodler.add(spins);

            encrypt.add(br.readLine());
        }
        br.close();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("enigma.out")));

        // Problem Solving Part
        for (int i = 0; i < numCases; i++) {
            int[] currentorder = hodler.remove(0);
            int[] currentspin = hodler.remove(0);
            for (int j = 0; j < currentorder.length; j++) {
                for (int k = 0; k < currentspin[j]; k++) {
                    rotors.set(currentorder[j] - 1, spin(rotors.get(currentorder[j] - 1)));
                    rotors.set(currentorder[j] + 4, spin(rotors.get(currentorder[j] + 4)));
                }
            }
            ArrayList<Integer> inputs = new ArrayList<Integer>();
            for (int j = 0; j < encrypt.get(i).length(); j++) {
                inputs.add(Integer.parseInt(String.valueOf(encrypt.get(i).charAt(j))));
            }
            int countr = 0;
            int countm = 0;
            String solution = "";
            // do the encryption
            for (int j = 0; j < inputs.size(); j++) {
                int hodl = inputs.get(j);
                solution += encrypt(hodl, currentorder, currentspin, rotors);
                rotors.set(currentorder[2] - 1, spin(rotors.get(currentorder[2] - 1)));
                rotors.set(currentorder[2] + 4, spin(rotors.get(currentorder[2] + 4)));
                countr++;
                if (countr % 10 == 0 && countr != 0) {
                    rotors.set(currentorder[1] - 1, spin(rotors.get(currentorder[1] - 1)));
                    rotors.set(currentorder[1] + 4, spin(rotors.get(currentorder[1] + 4)));
                    countm++;
                }
                if (countm % 10 == 0 && countm != 0) {
                    rotors.set(currentorder[0] - 1, spin(rotors.get(currentorder[0] - 1)));
                    rotors.set(currentorder[0] + 4, spin(rotors.get(currentorder[0] + 4)));
                }
            }
            pw.println(solution);
        }
        pw.close();
    }

    public static int[] spin(int[] x) {
        int[] newarr = new int[x.length];
        for (int i = 1; i <= x.length; i++) {
            newarr[i % 10] = (x[i - 1] + 1) % 10;
        }
        return newarr;
    }

    public static char encrypt(int x, int[] or, int[] sp, ArrayList<int[]> rot) {
        // first gear
        Integer output = rot.get(or[0] - 1)[(x)];
        // second gear
        output = rot.get(or[1] - 1)[(output)];
        // third gear
        output = rot.get(or[2] - 1)[output];
        // reflector
        output = rot.get(4)[output];
        // third gear (reverse)
        output = rot.get(or[2] + 4)[output];
        // second gear (reverse)
        output = rot.get(or[1] + 4)[output];
        // first gear (reverse)
        output = rot.get(or[0] + 4)[output];
        return output.toString().charAt(0);
    }
}