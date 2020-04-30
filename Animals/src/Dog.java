public class Dog extends Animal {

    private String breed;
    private String hairType;
    private String species;


    public Dog(String name, int age, int weight, double speed, String breed, String hairType) {
        super(name, age, weight, speed, "Warm Blooded", true);
        this.breed = breed;
        this.hairType = hairType;
        this.species = "Dog";
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(("Species: " + this.species
                + "\nBreed: " + this.breed
                + "\nHair type: " + this.hairType
                + "\nBase Speed: " + this.getSpeed()
                + "\nTop Speed: " + this.run()
        ));
    }

    public double move(double pace){
        pace = this.getSpeed() * pace;
        return pace;
    }
    public double sneak() { return move(0.2); }
    public double walk() { return move(1); }
    public double trot() { return move(2); }
    public double run() { return move(3); }

    public static void says(){
        System.out.println("Dog says \"Woof Woof!\"");
    }
    public void speak(){
        System.out.println(this.getName() + " says \"Woof woof!\"");
    }

    public void eat() {
        System.out.println(this.getName() + " ate");
    }
}
