import utils.Utils;

public class Scrabble {

    private static String generateLetters(int length){
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < length; i++) {
            letters.append((char) (Math.random() * 26 + 65));
        }
        System.out.println(letters);
        return letters.toString();
    }

    private static void letterMixer(String todo, String finished){
        if(todo.length() == 0) {
            if(Utils.isWord(finished)) {
                System.out.println(finished);
            }
        } else {
            for (int i = 0; i < todo.length(); i++) {
                String rest = todo.substring(0,i) + todo.substring(i+1);
                char c = todo.charAt(i);
                letterMixer(rest,finished+c);
            }
        }
    }

    private static void letterMixer(String text){
        letterMixer(text, "");
    }

    private static void scrabble(){
        letterMixer("HELLO");
    }

    public static void main(String[] args) {
        scrabble();
    }
}