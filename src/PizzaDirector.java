public class PizzaDirector {
    public void constructPizza(PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
    }
}
