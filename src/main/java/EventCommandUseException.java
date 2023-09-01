public class EventCommandUseException extends Exception{
    public EventCommandUseException(String message) {
        super(message + ":" + "\nInvalid input as when the event starts " +
                "must be specified after /from. When the event ends must also be specified after /to.");
    }
}