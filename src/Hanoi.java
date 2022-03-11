import utils.Utils;

public class Hanoi {



    private static int hanoiScanner(){
        return Utils.scanner("Wie viele Steine wollen Sie verschieben? ",1, Integer.MAX_VALUE);
    }

    private static void tohCalculatorRek(int a){
        tohCalculatorRek(a,1);
    }

    private static void tohCalculatorRek(int a, int b){
        if (a == 1){
            System.out.print("Die minimale Anzahl an Zügen beträgt: " + b);
        } else {
            b = b * 2 + 1;
            tohCalculatorRek(a-1,b);
        }
    }

    private static void tohCalculatorIt(int a){
        int counter
                = 1;
        for (; a > 1; a--) {
            counter = counter * 2 + 1;
        }
        System.out.print("Die minimale Anzahl an Zügen beträgt: " + counter);
    }

    private static void tohCalculatorSimple(int a) {
        int b = (int) Math.pow(2,a) -1;
        System.out.print("Die minimale Anzahl an Zügen beträgt: " + b);
    }

    private static void tohCalculator(){
        int a = hanoiScanner();
        System.out.println("rekursiv:");
        tohCalculatorRek(a);
        System.out.println("\niterativ:");
        tohCalculatorIt(a);
        System.out.println("\nper Formel:");
        tohCalculatorSimple(a);
    }


    private static int count = Integer.MIN_VALUE;
    private static int hanoiCounter = Integer.MIN_VALUE;

    private void _hanoi(int count, String start, String destination, String temp){
        if(count > 1) {
            _hanoi(count-1, start, temp, destination);
        }

        hanoiCounter++;
        String s;
        if (count == this.count) {
            s = "MITTE: ";
        } else {
            s = "       ";
        }
        System.out.println(s + hanoiCounter +  ".: Verschiebe Scheibe von " + start + " nach " + destination);

        if(count > 1) {
            _hanoi(count-1, temp, destination, start);
        }

    }

    public void hanoi(int count){
        this.count = count;
        hanoiCounter = 0;
        _hanoi(count, "Turm 1", "Turm 3", "Turm 2");
        System.out.println("Dies hat " + hanoiCounter + " Züge benötigt");
    }


    public static void main(String[] args) {
        tohCalculator();
    }
}