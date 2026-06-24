package Klausurvorbereitung;

import Klausurvorbereitung.Musikstuecksammlung.MusikStueck;
import Klausurvorbereitung.Musikstuecksammlung.MusikStueckSammlung;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MusikStueckSortierungTest {
    MusikStueck a10 = new MusikStueck("A","Interpret",10);
    MusikStueck b20 = new MusikStueck("B","Interpret",20);
    MusikStueck c30 = new MusikStueck("C","Interpret",30);

    MusikStueckSammlung testsammlung = new MusikStueckSammlung();
    List<MusikStueck> vglListeLaenge = List.of(a10,b20,c30);

    @BeforeEach
    public void testSammlungBauen(){
        testsammlung.musikStueckEinfuegen(b20);
        testsammlung.musikStueckEinfuegen(c30);
        testsammlung.musikStueckEinfuegen(a10);
    }
    @Test
    public void sortierungLaenge(){
        List<MusikStueck> listeLaenge = testsammlung.getAlleMusikStueckeNachLaenge();
        Assertions.assertEquals(listeLaenge, vglListeLaenge);
    }

    @Test
    public void sortierungTitel(){
        List<MusikStueck> listeLaenge = testsammlung.getAlleMusikStueckeNachTitel();
        Assertions.assertEquals(listeLaenge, vglListeLaenge);
    }
}
