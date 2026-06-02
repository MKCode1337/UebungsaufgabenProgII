package lektion22;

import static java.lang.Thread.sleep;

public class YinYangMain {
    static void main() {
        YinYangThread yang = new YinYangThread("Yang");
        yang.start();
        YinYangThread yin = new YinYangThread("Yin");
        yin.start();
    }
}
