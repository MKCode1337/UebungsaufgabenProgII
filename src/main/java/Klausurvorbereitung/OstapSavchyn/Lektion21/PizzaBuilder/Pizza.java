package Klausurvorbereitung.OstapSavchyn.Lektion21.PizzaBuilder;

public class Pizza {
    private String groesse;
    private Boolean kaese, schinken, pilze, salami;

    public Pizza(String groesse, Boolean kaese,Boolean schinken, Boolean pilze, Boolean salami) {
        this.groesse = groesse;
        this.kaese = kaese;
        this.schinken = schinken;
        this.pilze = pilze;
        this.salami = salami;
    }

    public static class PizzaBuilder{
        private String groesse;
        private Boolean kaese, schinken, pilze, salami;

        public PizzaBuilder(String groesse){
            this.groesse = groesse;
        }
        public PizzaBuilder mitKaese(boolean b){
            this.kaese = b;
            return this;
        }
        public PizzaBuilder mitSchinken(boolean b){
            this.schinken = b;
            return this;
        }
        public PizzaBuilder mitPilzen(boolean b){
            this.pilze = b;
            return this;
        }
        public PizzaBuilder mitSalami(boolean b){
            this.salami = b;
            return this;
        }
        public Pizza build(){
            return new Pizza(groesse, kaese, schinken, pilze, salami);
        }
    }
}
