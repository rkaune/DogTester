package dogtester;

public class Dog {
    //variables for characteristics

    private String dogName, dogBreed;
    private int aggression, hunger;

    //constructors
    public Dog() {
        dogName = "Rufus Doe";
        dogBreed = "Unknown Breed";
        aggression = 0;
        hunger = 0;
    }

    public Dog(String dgName, String dgBreed, int agg, int hung) {
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = agg;
        hunger = hung;
    }

    //Alternate constructor
    public Dog(String dgName, String dgBreed) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
    }

    public void barkFriendly() {
        System.out.println("Arf! Arf!");
    }

    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger;
        //output string is complete, return it
        return output;
    }
}
