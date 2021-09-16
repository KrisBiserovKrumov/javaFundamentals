package Pokemon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String[] line = scan.nextLine().split("\\s+");

        while (!"Tournament".equals(line[0])){
            String trainerName = line[0];
            String pokemonName = line[1];
            String pokemonType = line[2];
            int pokemonHealth = Integer.parseInt(line[3]);

            Pokemon currentPokemon = new Pokemon(pokemonName, pokemonType, pokemonHealth);
            Trainer currentTrainer = new Trainer(trainerName);
            if (!trainers.containsKey(trainerName)) {
                currentTrainer.addPokemon(currentPokemon);
                trainers.putIfAbsent(trainerName, currentTrainer);
            }else{
                trainers.get(trainerName).addPokemon(currentPokemon);
            }

            line = scan.nextLine().split("\\s+");
        }
        String token = scan.nextLine();

        while (!"End".equals(token)){
            for (Trainer trainer : trainers.values()) {
                boolean haveThisType = false;
                for (Pokemon pokemon : trainer.getPokemons()) {
                    if (pokemon.getElement().equals(token) && pokemon.getHealth() > 0){
                        haveThisType = true;
                        break;
                    }
                }
                if (haveThisType){
                    trainer.incrementBadges();
                }else {
                    for (Pokemon pokemon : trainer.getPokemons()) {
                        pokemon.decreasesHealth();
                    }
                }
            }
            token = scan.nextLine();
        }
        for (Trainer trainer : trainers.values()) {
            for (int i = trainer.getPokemons().size() - 1; i >=0 ; i--) {
                if (trainer.getPokemons().get(i).getHealth() <= 0){
                    trainer.getPokemons().remove(i);
                }
            }
        }
        trainers.entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getValue().getBadges() > b.getValue().getBadges()){
                        return -1;
                    }else if (a.getValue().getBadges() < b.getValue().getBadges()){
                        return 1;
                    }else {
                        return 0;
                    }
                }).forEach(tr -> System.out.printf("%s %d %d%n", tr.getKey(), tr.getValue().getBadges(), tr.getValue().getPokemons().size()));
    }
}
