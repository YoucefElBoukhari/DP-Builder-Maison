public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    public Pizza() {
        // Le constructeur par défaut crée une pizza vide.
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
