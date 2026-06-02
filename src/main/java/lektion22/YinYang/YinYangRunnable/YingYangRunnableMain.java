package lektion22.YinYang.YinYangRunnable;

public class YingYangRunnableMain {
    public static void main(String[] args) {
        YinYangRunnable yin = new YinYangRunnable("Yin");
        YinYangRunnable yang = new YinYangRunnable("Yang");
        Thread t1 = new Thread(yin);
        Thread t2 = new Thread(yang);
        t1.start();
        t2.start();
    }
}
