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

    public static void main(String[] args) {
        rekursion04(5);
    }
}