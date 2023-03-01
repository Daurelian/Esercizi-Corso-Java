package dictionary;

public class WordNotPresentException extends Exception{
    public WordNotPresentException(String word) {
        super("La parola "+ word+" non è stata trovata");
    }
}
