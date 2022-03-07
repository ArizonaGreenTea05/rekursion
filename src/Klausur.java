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
        sums(a, 0,1);
    }

    private static void sums(int[] a, int i, int j){
        if(i == a.length-1){
            return;
        }
        System.out.printf("%d + %d = %d\n", a[i], a[j], a[i+j]);
        for (; j < a.length; j++) {
            sums(a, i, j);
        }
        sums(a, i+1, i+2);
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