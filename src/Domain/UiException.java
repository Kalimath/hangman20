package domain;

public class UiException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UiException(String message) {
        super(message);
    }
}
