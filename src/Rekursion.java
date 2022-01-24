import java.util.Scanner;

public class Rekursion {

    // Endlosrekursion /vgl. Endlosschleife)
    // In der Praxis ist die Rekursionstiefe von der Größe des Stacks abhängig
    // mit anderen Worten: Rekursion bricht ab, wenn der Stapel voll ist.
    private static void rekursion01(){
        rekursion01();
    }


    private static void rekursion02(){
        // Abbruchbedingung
        // Trivialfall / Elementarfall ==> NICHT-rekursiver Fall
        if(true) {
            System.out.println("Keine Rekursion mehr");
        } else {
            rekursion02();
        }
    }


    private static void rekursion03(int i){
        if(i == 0) {
            System.out.println("Stopp!");
        } else {
            System.out.println(i);
            rekursion03(i-1);
        }
    }


    private static void rekursion04(int i){
        if(i == 0) {
            System.out.println("Stopp!");
        } else {
            // folgende zwei Zeilen vertauscht (im Vergleich zu 03)
            rekursion04(i-1);
            System.out.println(i);
        }
    }


    private static void rekursion05(int i){
        if(i == 0) {
            System.out.println("Stopp!");
        } else {
            System.out.println(i);
            rekursion05(i-1);
            System.out.println(i);
        }
    }


    private static void towerOfHanoiSolution(int a, int position, int posMoving){
        if(a==0) {
            System.out.println("Fertig!");
        } else {
            if(position == 3) {
                position = 0 + posMoving;
            } else {
                position += posMoving;
            }
            System.out.println(((position-posMoving > 0) ? position-posMoving:3+(position-posMoving)) + " an " + position);

            System.out.println("Einzig möglichen Zug ausführen");

            towerOfHanoiSolution(a-1, position, posMoving);
        }
    }

    private static void tohCalculator(int a, int b){
        if (a == 1){
            System.out.print("Die minimale Anzahl an Zügen beträgt: " + b);
        } else {
            b = b * 2 + 1;
            tohCalculator(a-1,b);
        }
    }

    private static void tohCalculator(){
        Scanner in = new Scanner(System.in);
        int count = -1;

        System.out.println("Wie viele Steine wollen Sie verschieben?");
        try {
            count = in.nextInt();
        }catch(Exception e){
            System.err.println("WRONG INPUT");
            System.exit(0);
        }
        if(count <= 0) {
            System.err.println("WRONG INPUT");
            System.exit(0);
        }

        tohCalculator(count, 1);
    }


    private static int hanoiCounter = 0;

    private static void hanoi(int anzahl, String start, String destination, String temp){
        if(anzahl > 1) {
            hanoi(anzahl-1, start, temp, destination);
        }

        System.out.println("Verschiebe Scheibe von " + start + " nach " + destination);
        hanoiCounter++;

        if(anzahl > 1) {
            hanoi(anzahl-1, temp, destination, start);
        }

    }


    public static void main(String[] args) {
        /*
        hanoi(10, "Turm 1", "Turm 3", "Turm 2");
        System.out.println("Dies hat " + hanoiCounter + " Züge benötigt");
         */
        tohCalculator();
    }
}