public class ItalianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.setDough("Thin Crust Dough");
    }

    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
    }

    public void buildToppings() {
        pizza.setToppings("Mozzarella, Pepperoni, Olives");
    }

    public Pizza getPizza() {
        return pizza;
    }
}
