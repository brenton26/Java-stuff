public class Brawler {

    private String name;
    protected double health;
    protected Weapon weapon;

    public Brawler(String name, double health, Weapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public int attack(){
        System.out.println(this.name + " attacked with a " + this.weapon.getName()
                + " dealing " + this.weapon.attack() + " damage!");
        return this.weapon.attack();
    }
     public void receiveDamage(double damage){
        this.health -= damage;
         System.out.println(this.name + " got a booboo and now has " + this.health + " health.");
        if (this.health <=0){
            System.out.println(this.name +" got Knocked Out!");
        }
    }
}
