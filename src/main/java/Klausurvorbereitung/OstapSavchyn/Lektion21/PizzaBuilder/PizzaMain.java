package Klausurvorbereitung.OstapSavchyn.Lektion21.PizzaBuilder;

public class PizzaMain {
    static void main() {
        Pizza pizza = new Pizza.PizzaBuilder(" Gross ")
                .mitKaese ( true )
                .mitSchinken ( false )
                .mitPilzen ( true )
                .mitSalami ( true )
                .build ();
    }
}
