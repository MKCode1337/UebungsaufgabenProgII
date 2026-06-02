package lektion22;

public class YinYangThread extends Thread {
    static void main() {
        YinYangThread yang = new YinYangThread();
        yang.start();
        while (true) {
            try {
                System.out.println("Yin");
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Yang");
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
