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
}
