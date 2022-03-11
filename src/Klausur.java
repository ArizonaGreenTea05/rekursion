import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String numbers = "789";
        sums(numbers);
    }

    public static void sums(String numbers){
        List<Integer> todo = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            todo.add(Integer.valueOf(numbers.substring(i,i+1)));
        }
        sums(todo,0,1);
    }

    private static void sums(List<Integer> todo, int i, int j){
        if(i == todo.size()-1 || j == todo.size()){
            //do nothing
        } else {
            System.out.printf("%d + %d = %2d\n",todo.get(i), todo.get(j), todo.get(i) + todo.get(j));
            sums(todo,i,j+1);
            if(j>i+1) {
                sums(todo, i + 1, j);
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