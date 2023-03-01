package dictionary;

public class ElementAlreadyContainedException extends Exception{
    public ElementAlreadyContainedException(char message) {
        super("La "+message+" già esiste");
    }
}
