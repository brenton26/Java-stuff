public abstract class Animal {

    private String name;
    private int age;
    private int weight;
    private double speed;
    private String bloodType;
    private boolean isGoodBoy;
    private static int animalCounter = 0;
    private final int animalID;

    public Animal(String name, int age, int weight, double speed, String bloodType, boolean isGoodBoy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
        this.bloodType = bloodType;
        this.isGoodBoy = isGoodBoy;
        animalCounter++;
        this.animalID = animalCounter;
    }
    public Animal(String name){
        this(name, 0, 0, 0, "Unkown", true);
    }


    public String getName(){ return this.name; }
    public int getAge(){ return this.age; }
    public int getWeight(){ return this.weight; }
    public boolean getGoodBoyStatus(){ return this.isGoodBoy; }
    public String getBloodType() { return bloodType; }
    public double getSpeed() { return speed; }

    public abstract void eat();
    public abstract double move(double pace);


    public void getInfo(){
        System.out.println(("\nName: " + this.name
                + "\nAge: " + this.age
                + "\nWeight: " + this.weight
                + "\nSpeed: " + this.speed
                + "\nBlood Type: " + this.bloodType
                + "\nIs a good boy? " + this.isGoodBoy
                + "\nID = " + this.animalID
        ));
    }
}
