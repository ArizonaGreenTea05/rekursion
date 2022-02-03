import java.util.LinkedHashSet;

public class Kaninchensex {

    private void kaninchensex(int generation, int rammler, int bunnies, int anzahlGenerationen){
        int gesamt = rammler + bunnies;
        if(generation < anzahlGenerationen) {
            kaninchensex(generation + 1, gesamt, rammler, anzahlGenerationen);
        } else{
            System.out.println("Generation: " + generation + "\nRammler: " + rammler + "\nBunnies: " + bunnies + "\nInsgesamt: " + gesamt + "\n\n");
        }
    }



    /*
    Der kleine Malte bekommt zu Einschulung in Klasse 5 ein Kaninchenpärchen als Baby geschenkt (September).
    Diese brauchen 12 Wochen bis sie Rammler sind. Wie viele Kaninchenpärchen hat er bei seinem Abitur (Juni)?
    Antwort: 9.227.465 Kaninchenpärchen
     */

    /*
    Von Geburt bis heute?
     */

    public static void main(String[] args) {
        new Kaninchensex().kaninchensex(0,0,1, 73);
    }
}
