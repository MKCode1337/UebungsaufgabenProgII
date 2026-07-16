package Klausurvorbereitung.OstapSavchyn.Lektion22.Countdown;

public class CountdownErben extends Thread{
    public void run(){
        for (int i=5; i>=0;i--){
            try {
                System.out.print(i);
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
