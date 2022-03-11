package utils;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static int scanner(String out, int minInput, int maxInput){
        Scanner in = new Scanner(System.in);
        int i = -1;

        do {
            System.out.print(out);
            try {
                i = in.nextInt();
            } catch (Exception e) {
                System.err.println("WRONG INPUT");
            }
            if(i<minInput || i> maxInput){
                System.out.println("Die Zahl muss zwischen " + minInput + " und " + maxInput + " liegen.");
            }
        }while(i<minInput || i> maxInput);
        return i;
    }


    public static String scanner(String out){
        Scanner in = new Scanner(System.in);
        String s = "";
        System.out.print(out);
        try {
            s = in.nextLine();
        } catch (Exception e) {
            System.err.println("WRONG INPUT");
        }
        return s;
    }

    private static String[] words = null;

    public static boolean isWord(String word) {
        if(words == null){
            words = FileLoader.load("Sowpods.txt");
        }
        for (String s : words) {
            if (s.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
}
