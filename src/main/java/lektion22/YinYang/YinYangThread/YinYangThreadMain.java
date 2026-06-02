package lektion22.YinYang.YinYangThread;

import static java.lang.Thread.sleep;

public class YinYangThreadMain {
    static void main() {
        YinYangThread yang = new YinYangThread("Yang");
        yang.start();
        YinYangThread yin = new YinYangThread("Yin");
        yin.start();
    }
}
