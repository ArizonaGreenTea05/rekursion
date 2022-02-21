public class Rekursion_groß_klein {

    private static void upperLower(String todo, String finished){
        if(todo.length() == 0) {
            System.out.println(finished);
        } else{
            char c = todo.charAt(0);

            String rest = todo.substring(1);

            upperLower(rest, finished+Character.toUpperCase(c));
            upperLower(rest, finished+Character.toLowerCase(c));
        }
    }


    private static void upperLower(String todo){
        upperLower(todo, "");
    }




    public static void main(String[] args) {
        upperLower("ich bin eine rekursion!");
    }
}
