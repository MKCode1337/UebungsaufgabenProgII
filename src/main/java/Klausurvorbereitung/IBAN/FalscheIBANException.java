package Klausurvorbereitung.IBAN;

public class FalscheIBANException extends RuntimeException {
    public FalscheIBANException(String message) {
        super(message);
    }
    public FalscheIBANException() {}
}
