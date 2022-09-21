public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String sentence = "Hello World !";
        String compareStr = "Hello";
        boolean hasStringInSentence = main.hasStringInSentence(sentence, compareStr);
        System.out.println("Has String in the Sentence : "+ hasStringInSentence );
    }

    private boolean hasStringInSentence(String sentence, String str) {
       return sentence.contains(str);
    }
}
