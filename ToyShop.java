import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ToyShop {

    private List<Toy> toys;

    public ToyShop(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToyForPrice() {
        Random random = new Random();
        Toy toy = random.chooseOnChance(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("shop.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
