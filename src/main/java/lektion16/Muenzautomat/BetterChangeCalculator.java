package lektion16.Muenzautomat;

public class BetterChangeCalculator implements ChangeCalculator {

        public int[] getChange(int euros, int cent) {
            Coin[] muenzen = Coin.values();
            int centbetrag = euros * 100 + cent;
            int[] rueckgeld = new int [8];
            int anzahlMuenzen = 0;
            for (int i = 7;i >= 0;i--){
                anzahlMuenzen = centbetrag / muenzen[i].value;
                rueckgeld[i] = anzahlMuenzen;
                centbetrag = centbetrag - muenzen[i].value*anzahlMuenzen;
            }
            return rueckgeld;
        }
}
