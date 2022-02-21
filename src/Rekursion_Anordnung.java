public class Rekursion_Anordnung {

    private static void letterMixer(String todo, String finished){
        if(todo.length() == 0) {
            System.out.println(finished);
        } else {

            for (int i = 0; i < todo.length(); i++) {
                String rest = (i-1 >= 0 ? todo.substring(0,i) : "") + todo.substring(i+1);
                char c = todo.charAt(i);
                letterMixer(rest,finished+c);
            }
        }
    }

    private static void letterMixer(String text){
        letterMixer(text, "");
    }

    public static void main(String[] args) {
        letterMixer("help");
    }
}
