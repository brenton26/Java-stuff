public class Weapon {

    private String name;
    protected int damage;
    protected int range;


    public Weapon(String name, int damage, int range){
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public String getName(){
        return this.name;
    }

    public int attack(){
        return this.damage;
    }



}
