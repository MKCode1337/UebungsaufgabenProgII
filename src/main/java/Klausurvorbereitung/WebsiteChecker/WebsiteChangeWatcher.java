package Klausurvorbereitung.WebsiteChecker;

import java.util.function.Consumer;

public class WebsiteChangeWatcher{
    private String target;
    private String path;
    Thread t1;
    Consumer<String> websiteConsumer;
    public WebsiteChangeWatcher(String target, String path) {
        this.target = target;
        this.path = path;
    }
    public WebsiteChangeWatcher(String target, String path, Consumer<String> consumer) {
        this.target = target;
        this.path = path;
        this.websiteConsumer = consumer;
    }

    public void hasChanged(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String content = retrieveWebsiteContent();
                    Thread.sleep(30000);
                    String newContent = retrieveWebsiteContent();
                    if (!content.equals(newContent)) websiteConsumer.accept(newContent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }; //Ende Runnable
        t1 = new Thread(runnable);
        t1.start();
    }
    public void cancel(){
        t1.interrupt();
    }

    /**
     *
     *
     Reads the content of a website and returns its content as html.
     @return The content of a website as String.
     */
    private String retrieveWebsiteContent() {
        return "";
    }


}
