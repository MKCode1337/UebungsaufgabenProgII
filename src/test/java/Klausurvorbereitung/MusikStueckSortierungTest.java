package Klausurvorbereitung;

import Klausurvorbereitung.Musikstuecksammlung.MusikStueck;
import Klausurvorbereitung.Musikstuecksammlung.MusikStueckSammlung;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MusikStueckSortierungTest {
    MusikStueck a30 = new MusikStueck("A","Interpret",30);
    MusikStueck b20 = new MusikStueck("B","Interpret",20);
    MusikStueck c10 = new MusikStueck("C","Interpret",10);

    MusikStueckSammlung testsammlung = new MusikStueckSammlung();

    @BeforeEach
    public void testSammlungBauen(){
        testsammlung.musikStueckEinfuegen(b20);
        testsammlung.musikStueckEinfuegen(c10);
        testsammlung.musikStueckEinfuegen(a30);
    }

    @Test
    public void sortierungLaenge(){
        List<MusikStueck> vglListeLaenge = List.of(c10,b20,a30);
        List<MusikStueck> listeLaenge = testsammlung.getAlleMusikStueckeNachLaenge();
        Assertions.assertEquals(listeLaenge, vglListeLaenge);
    }

    @Test
    public void sortierungTitel(){
        List<MusikStueck> vglListeLaenge = List.of(a30,b20,c10);
        List<MusikStueck> listeLaenge = testsammlung.getAlleMusikStueckeNachTitel();
        Assertions.assertEquals(listeLaenge, vglListeLaenge);
    }
}
