package dogtester;

public class DogTester {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
        Dog dog2 = new Dog("Spot", "Border Collie");
        Dog dog3 = new Dog();
        
        //dog1.name = "spot";

        //Print the details of each dog
        System.out.println(dog1.toString());
        System.out.println("--------------------------");

        System.out.println(dog2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(dog3);
        System.out.println("--------------------------");

        //dog1 barks friendly, dog2 barks angry
        dog1.barkFriendly();
        dog2.barkAngry();
    }
}
