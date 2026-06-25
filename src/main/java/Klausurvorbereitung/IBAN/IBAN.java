package Klausurvorbereitung.IBAN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IBAN {
    public boolean checkIban(String iban) throws FalscheIBANException{
        boolean b = true;
        if (!iban.startsWith("DE")) {
            b = false;
            throw new FalscheIBANException("IBAN beginnt nicht mit \"DE\"!");
        }
        if (iban.length() != 22) {
            b = false;
            throw new FalscheIBANException("IBAN muss 22 Stellen haben!");
        }
        return b;
    }

    public List<String> liesIbanAusDatei(String dateipfad){
        List<String> falscheIbans = new ArrayList<>();
        String line="";

        try(FileReader fr = new FileReader(dateipfad);
            BufferedReader br = new BufferedReader(fr)){
            while(true){
                line = br.readLine();
                if (line==null) break;
                try{
                    checkIban(line);
                }
                catch (FalscheIBANException e){
                    falscheIbans.add(line);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return falscheIbans;
    }

    public Map<String,List<String>> liesIbanAusDateien(List<String> dateien){
        Map<String,List<String>> falscheIbans = new HashMap<>();
        for(String s: dateien){
            List<String> ibansAusDatei = liesIbanAusDatei(s);
            if (!ibansAusDatei.isEmpty()) falscheIbans.put(s, ibansAusDatei);
        }
        return falscheIbans;
    }
}
