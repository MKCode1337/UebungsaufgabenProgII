package Klausurvorbereitung.IBAN;

public class FalscheIBANException extends RuntimeException {
    String message = "";
    public FalscheIBANException(String message) {
        this.message = message;
    }
    public FalscheIBANException() {}
}
