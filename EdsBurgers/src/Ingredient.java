public class Ingredient {

    private String name;
    private int price;

    public Ingredient(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

