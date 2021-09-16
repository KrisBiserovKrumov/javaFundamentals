package heroRepository;

public class Item {

    private int strength;
    private int agility;
    private int intelligence;

    public Item(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return String.format(
                "  *  Strength: %s%n" +
                "  *  Agility: %s%n"+
                "  *  Intelligence: %s",this.strength,this.agility,this.intelligence )

        ;
    }
}
