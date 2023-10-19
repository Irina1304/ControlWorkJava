public class Toy {

    private int id;
    private String name;
    private int chance;
    private static int idCounter = 1;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getChance() {
        return chance;
    }

    public Toy(String name, int chance) {
        this.name = name;
        this.chance = chance;
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Игрушка № " + id + " " + name + " вероятность выпадения " + chance;
    }

    

    

    
}
