public class Hanoi {



    private static int hanoiScanner(){
        return Utils.scanner("Wie viele Steine wollen Sie verschieben? ",1, Integer.MAX_VALUE);
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
        tohCalculator(hanoiScanner(),1);
    }


    private static int hanoiCounter = 0;

    private static void hanoi(int count, String start, String destination, String temp){
        if(count > 1) {
            hanoi(count-1, start, temp, destination);
        }

        System.out.println("Verschiebe Scheibe von " + start + " nach " + destination);
        hanoiCounter++;

        if(count > 1) {
            hanoi(count-1, temp, destination, start);
        }

    }

    private static void hanoi(){
        hanoi(hanoiScanner(), "Turm 1", "Turm 3", "Turm 2");
        System.out.println("Dies hat " + hanoiCounter + " Züge benötigt");
    }


    public static void main(String[] args) {
        hanoi();
    }
}
