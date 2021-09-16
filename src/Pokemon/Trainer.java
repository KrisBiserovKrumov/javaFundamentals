package Pokemon;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> pokemons;
    private int badges;

    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.badges = 0;
    }

    public void removeDead(){
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getHealth() <= 0){
                this.getPokemons().remove(pokemon);
            }
        }
    }

    public ArrayList<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void incrementBadges(){
        this.badges++;
    }

    public int getBadges(){
        return this.badges;
    }

}
