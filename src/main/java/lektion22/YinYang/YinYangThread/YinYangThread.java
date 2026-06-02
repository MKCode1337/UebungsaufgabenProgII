package lektion22.YinYang.YinYangThread;

public class YinYangThread extends Thread {
    String ausgabe;
    public YinYangThread(String ausgabe) {
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
