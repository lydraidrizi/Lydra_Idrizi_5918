
public class Herol {

    public Herol(int health){
        this.health = health;
        this.strength = strength;
    }


    private int health;

    private int strength;


    public void displayStats(int health, int strength){

        System.out.printf("Current health: " + ", current strength:)
    }
    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void powerUp(int increase) {
        strength = strength + increase;
    }

    public static void main(String[] args) {
        Herol h = new Herol(100,10);

        h.displayStats();

        h.takeDamage(20);

        h.powerUp(20);
    }




    }
}