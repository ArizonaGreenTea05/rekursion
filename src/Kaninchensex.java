public class Kaninchensex {

    private String kaninchensex(int generation, int rammler, int bunnies, int anzahlGenerationen){
        int gesamt = rammler + bunnies;
        String out;
        if(generation < anzahlGenerationen) {
            out = kaninchensex(generation + 1, gesamt, rammler, anzahlGenerationen);
        } else {
            return "Generation: " + generation + "\nRammler: " + rammler + "\nBunnies: " + bunnies + "\nInsgesamt: " + gesamt + "\n\n";
        }
        return out;
    }

    public static long fibonacciRekursiv(int n) {
        // Trivialfall
        if (n <= 1){
            // f(0) = f(1) = 1
            return 1;
        } else{
            // Rekursiver Fall
            // f(n) = f(n-1) + f(n-2)
            return fibonacciRekursiv(n-1) + fibonacciRekursiv(n-2);
        }
    }

    public static long fibonacciRekursivMemorized(int n) {
        // Trivialfall
        if (n <= 1){
            // f(0) = f(1) = 1
            f[n] = 1;
            return f[n];
        } else{
            // Rekursiver Fall
            // f(n) = f(n-1) + f(n-2)
            if(f[n-1] == 0) {
                f[n - 1] = fibonacciRekursivMemorized(n - 1);
            }
            if(f[n-2] == 0) {
                f[n - 2] = fibonacciRekursivMemorized(n - 2);
            }
            return f[n-1] + f[n-2];
        }
    }

    public static long fibonacciIterativ(int n) {
        long pred = 0;
        long result = 1;
        for (int i = 1; i <= n ; i++) {
            long temp = pred;
            pred = result;
            result = temp + result;
        }
        return result;
    }


    private static long f[];
    public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            f = new long[i+1];
            long rekStart = System.currentTimeMillis();
            long rek = fibonacciRekursiv(i);
            long rekStop = System.currentTimeMillis();
            double rekDuration = (rekStop - rekStart)/1000.0;

            long rekMStart = System.currentTimeMillis();
            long rekM = fibonacciRekursivMemorized(i);
            long rekMStop = System.currentTimeMillis();
            double rekMDuration = (rekStop - rekStart)/1000.0;

            long itStart = System.currentTimeMillis();
            long it = fibonacciIterativ(i);
            long itStop = System.currentTimeMillis();
            double itDuration = (itStop - itStart)/1000.0;
            System.out.printf("%3d: rekursiv: %15d (%6.2fs), rekursiv memorized: %15d (%6.2fs), iterativ: %15d (%6.2fs) %n", i, rek, rekDuration, rekM, rekMDuration, it, itDuration);
        }
    }
}
