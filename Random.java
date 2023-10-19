import java.util.List;

public class Random {

    public Toy chooseOnChance(List<Toy> toys) {
        double completeChance = 0.0;
        for (Toy toy : toys)
            completeChance += toy.getChance();
        double r = Math.random() * completeChance;
        double countChance = 0.0;
        for (Toy toy : toys) {
            countChance += toy.getChance();
            if (countChance >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
    
}
