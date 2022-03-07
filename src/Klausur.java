public class Klausur {

    public static void strange(int i){
        if (i > 1){
            strange(i-1);
        }
        System.out.print(i + " ");
        if(i > 1){
            strange(i - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,6,8,9};
        sums(a);
    }

    public static void sums(int[] a){
        long startRek = System.currentTimeMillis();
        sums(a,0);
        long stopRek = System.currentTimeMillis();
        long startIt = System.currentTimeMillis();
        sumsIt(a);
        long stopIt = System.currentTimeMillis();
        System.out.printf("rekursiv: %4d ms\niterativ: %4d ms", stopRek-startRek, stopIt-startIt);
    }


    private static void sums(int[] a, int start){
        if(start == a.length-2) {
            return;
        } else {
            for (int i = start+1; i < a.length; i++) {
                System.out.printf("%d + %d = %d\n", a[start],a[i], a[start]+a[i]);
            }
            sums(a, start+1);
        }
    }

    private static void sumsIt(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                System.out.printf("%d + %d = %d\n", a[i],a[j],a[i] + a[j]);
            }
        }
    }




    private static int binarySearch(int[] a, int searched) {
        return binarySearch(a, searched, 0, a.length-1);
    }

    public static int binarySearch(int[] a, int searched, int left, int right){
        int mid = left + (right-left)/2;
        if(searched == a[right]) {
            return right;
        } else if(searched < mid){
            binarySearch(a, searched, left, mid);
        } else {
            binarySearch(a, searched, mid, right);
        }
        return -1;
    }
}