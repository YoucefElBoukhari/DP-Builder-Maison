public class MexicanPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.setDough("Thick Crust Dough");
    }

    public void buildSauce() {
        pizza.setSauce("Spicy Tomato Sauce");
    }

    public void buildToppings() {
        pizza.setToppings("Cheddar Cheese, Jalapeños, Ground Beef");
    }

    public Pizza getPizza() {
        return pizza;
    }
}
