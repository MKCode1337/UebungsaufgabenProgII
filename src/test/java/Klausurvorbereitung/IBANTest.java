package Klausurvorbereitung;

import Klausurvorbereitung.IBAN.FalscheIBANException;
import Klausurvorbereitung.IBAN.IBAN;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
String ibanspfad = "ibans.txt";
IBAN iban = new IBAN();

    @Test
    public void checkIbanTest(){
        Assertions.assertTrue(iban.checkIban("DE22100100500123456789"));
        assertThrows(FalscheIBANException.class, () -> iban.checkIban("FF22100100500123456789"));
        assertThrows(FalscheIBANException.class, () -> iban.checkIban("DE12345"));
    }
    @Test
    public void liesIbanTest(){
        List<String> expList = new ArrayList<>();
        expList.add("FF22100100500123456789");
        expList.add("DE12345");
        List<String> actList = iban.liesIbanAusDatei(ibanspfad);
        assertEquals(expList,actList);
    }
}
