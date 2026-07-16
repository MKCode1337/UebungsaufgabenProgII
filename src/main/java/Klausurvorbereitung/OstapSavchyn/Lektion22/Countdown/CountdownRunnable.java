package Klausurvorbereitung.OstapSavchyn.Lektion22.Countdown;

import static java.lang.Thread.sleep;

public class CountdownRunnable implements Runnable{
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
