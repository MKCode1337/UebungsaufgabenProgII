package lektion22.YinYang.YinYangAnonymeKlasse;

public class YinYangAnonClass extends Thread {
    String ausgabe;
    public YinYangAnonClass(String ausgabe) {
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
