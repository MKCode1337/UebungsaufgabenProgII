package lektion16;

public class BetterChangeCalculator implements ChangeCalculator {

        public int[] getChange(int euros, int cent) {
            Coin[] muenzen = Coin.values();
            int centbetrag = euros * 100 + cent;
            int[] rueckgeld = new int [8];
            int anzahlMuenzen = 0;
            int i = 7;
            do {
                anzahlMuenzen = centbetrag / muenzen[i].value;
                rueckgeld[i] = anzahlMuenzen;
                centbetrag = centbetrag - muenzen[i].value*anzahlMuenzen;
                i--;
            }
            while (i >= 0);
            return rueckgeld;
        }
}
