public class DeadlineCommandUseException extends Exception{
    public DeadlineCommandUseException(String message) {
        super(message + ":" + " deadline must be followed by a task to be added to the list " +
                "and a time specified after '/by' ");
    }
}
