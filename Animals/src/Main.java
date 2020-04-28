public class Main {

    public static void main(String[] args){

        Dog dog1 = new Dog("Zumbi", 6, 58, 10, "Goldendoodle", "Curly");
        Cat cat1 = new Cat("George", 10, 12, 15, "Serville", "Spotted orange");

        dog1.getInfo();
        cat1.getInfo();

        System.out.println("--------------");

        Dog.says();

        dog1.speak();



        System.out.println("--------------");


    }

}
