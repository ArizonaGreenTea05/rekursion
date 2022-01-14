import java.sql.SQLOutput;

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

    private static void tvHR(int a, int b){
        if (a == 1){
            System.out.print("Die Zahl ist: " + b);
        } else {
            b = b * 2 + 1;
            tvHR(a-1,b);
        }
    }

    private static void tvHR(int a){
        tvHR(a, 1);
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


    private static void runTowerOfHanoi(){
        int count = 4;
        int posMoving = (count % 2 == 0) ? 2 : 1;
        towerOfHanoiSolution(count, 1, posMoving);
    }

    private static void runTvHR(){
        for(int i = 1; i <= 10; i++){
            System.out.print("\n" + i + ": ");
            tvHR(i);
        }
    }


    public static void main(String[] args) {
        runTowerOfHanoi();
    }
}