package main.oops.Encapsulation;

class Dice {
    // Private attribute goes here
    private int rollCount;

    public Dice() {
        this.rollCount = 0; // Initialize rollCount to 0
    }

    // Complete the roll() method here
    public void roll(){
        this.rollCount++;
    }

    // Complete the getRollCount() method here
    public int getRollCount(){
        return this.rollCount;
    }
}

public class PrivateAccess {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.roll();
        myDice.roll();
        // myDice.rollCount = 10; // See what happens if you uncomment this line!
        System.out.println("Current roll count: " + myDice.getRollCount());
    }
}
