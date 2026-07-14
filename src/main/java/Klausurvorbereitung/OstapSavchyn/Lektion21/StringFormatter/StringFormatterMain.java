package Klausurvorbereitung.OstapSavchyn.Lektion21.StringFormatter;

public class StringFormatterMain {
    static void main() {
        String result = new StringFormatter(" hello world ")
                .trim()
                .replace("hello", "hallo")
                .toUpper()
                .get();
        System.out.print(result);
    }
}
