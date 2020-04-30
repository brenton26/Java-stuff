public class Cat extends Animal{

    private String breed;
    private String hairColor;
    private String species;


    public Cat(String name, int age, int weight, double speed, String breed, String hairColor) {
        super(name, age, weight, speed, "Warm Blooded", false);
        this.breed = breed;
        this.hairColor = hairColor;
        species = "Cat";
    }


    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(("Species " + this.species
                + "\nBreed: " + this.breed
                + "\nHair color: " + this.hairColor
                + "\nBase Speed: " + this.getSpeed()
                + "\nTop Speed: " + this.run()
        ));
    }

    public double move(double pace) {
        pace = this.getSpeed() * pace;
        return pace;
    }

    public void eat(){

    }

    public double sneak() { return move(0.2); }
    public double walk() { return move(1); }
    public double trot() { return move(2); }
    public double run() { return move(4); }


}

