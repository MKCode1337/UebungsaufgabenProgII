package Klausurvorbereitung.OstapSavchyn.Lektion21.StringFormatter;

public class StringFormatter {
    String string;

    public StringFormatter(String string) {
        this.string = string;
    }
    public StringFormatter toUpper(){
        this.string = this.string.toUpperCase();
        return this;
    }
    public StringFormatter replace(String alt, String neu){
        this.string = this.string.replace(alt, neu);
        return this;
    }
    public StringFormatter trim(){
        this.string = this.string.trim();
        return this;
    }
    public String get(){
        return this.string;
    }
}