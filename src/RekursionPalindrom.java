public class RekursionPalindrom {

    private static boolean palindrom(String text){
        if(text.length() < 2) {
            return true;
        } else {
            return text.charAt(0) == text.charAt(text.length() - 1)
                    && palindrom(text.substring(1, text.length() - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrom("baum"));
    }
}