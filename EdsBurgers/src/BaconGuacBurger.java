public class BaconGuacBurger extends MenuItem{

    // Ingridients
    private Bun bun;
    private MeatPatty patty;
    private Bacon bacon;
    private Avocado avocado;
    private Cheese cheese;
    private SpecialSauce sauce;
    // Price
    private int price;

    public BaconGuacBurger(){
        super("Bacon Gaucamole Burger");
        this.bun = new Bun();
        this.patty = new MeatPatty();
        this.bacon = new Bacon();
        this.avocado = new Avocado();
        this.cheese = new Cheese("Swiss");
        this.sauce = new SpecialSauce();
        this.price = (int)(
                this.bun.getPrice() +
                        this.patty.getPrice() +
                        this.bacon.getPrice() +
                        this.avocado.getPrice() +
                        this.cheese.getPrice() +
                        this.sauce.getPrice() *0.35 +1);
    }

}
