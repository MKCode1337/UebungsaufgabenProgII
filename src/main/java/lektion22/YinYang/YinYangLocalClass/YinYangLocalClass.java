package lektion22.YinYang.YinYangLocalClass;

public class YinYangLocalClass extends Thread {
    String ausgabe;
    public YinYangLocalClass(String ausgabe) {
        this.ausgabe = ausgabe;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this.ausgabe);
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
