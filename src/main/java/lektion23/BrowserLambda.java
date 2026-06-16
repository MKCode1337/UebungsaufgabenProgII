package lektion23;

import lektion19.RandomNr;
import lektion19.RandomNrProductive;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class BrowserLambda
{
    RandomNr randomNr;

    BrowserLambda(RandomNr randomNr){
        this.randomNr = randomNr;
    }

    public BrowserLambda(){
        this.randomNr =  new RandomNrProductive();
    }

    public Optional<URL> back()
    {
        try
        {
            //simulate: fetch last URL from Stack
            return this.randomNr.getRandomNr() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();
        }
        catch(MalformedURLException e)
        {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        BrowserLambda browser = new BrowserLambda();
        //Optional in variable auffangen
        Optional<URL> back = browser.back();
        back.ifPresent(backurl -> System.out.println(browser.retrieveSite(backurl)));
        //ifPresent -> PrintLn
        BrowserLambda browser2 = new BrowserLambda();
        browser2.back().ifPresent(backurl -> System.out.println(browser2.retrieveSite(backurl)));
    }
}
