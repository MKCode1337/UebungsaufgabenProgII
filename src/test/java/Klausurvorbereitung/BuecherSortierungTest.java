package Klausurvorbereitung;

import Klausurvorbereitung.Bibiliothek.Buch;
import Klausurvorbereitung.Bibiliothek.gebundenesBuch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BuecherSortierungTest {
    Buch b1 = new gebundenesBuch("ABuch","Alf","Verlag",100,50);
    Buch b2 = new gebundenesBuch("BBuch","Bert","Verlag",100,50);
    Buch b3 = new gebundenesBuch("CBuch","Bert","Verlag",100,50);

    @Test
    public void testeSortierung(){
        List<Buch> vorSortierteListe = new ArrayList<>(List.of(b1,b2,b3));
        List<Buch> unsortierteListe = new ArrayList<>(List.of(b3,b2,b1));
        //2 Alternativen
        unsortierteListe.sort(Comparator.naturalOrder());
        Collections.sort(unsortierteListe);

        Assertions.assertEquals(vorSortierteListe, unsortierteListe);
    }
}