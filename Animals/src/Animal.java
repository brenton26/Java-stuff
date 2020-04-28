public class Animal {

    protected String name;
    protected int age;
    protected int weight;
    protected double speed;
    protected String bloodType;
    protected boolean isGoodBoy;

    public Animal(String name, int age, int weight, double speed, String bloodType, boolean isGoodBoy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
        this.bloodType = bloodType;
        this.isGoodBoy = isGoodBoy;
    }
    public Animal(String name){
        this(name, 0, 0, 0, "Unkown", true);
    }


    public String getName(){ return this.name; }
    public int getAge(){ return this.age; }
    public int getWeight(){ return this.weight; }
    public boolean getGoodBoyStatus(){ return this.isGoodBoy; }

    public void eat(){
        System.out.println("The animal ate some food!");
    }
    public void move(){
        System.out.println("The animal moved " + this.speed + " units!");
    }
    public void getInfo(){
        System.out.println(("\nName: " + this.name
                + "\nAge: " + this.age
                + "\nWeight: " + this.weight
                + "\nSpeed: " + this.speed
                + "\nBlood Type: " + this.bloodType
                + "\nIs a good boy? " + this.isGoodBoy
        ));
    }
}
