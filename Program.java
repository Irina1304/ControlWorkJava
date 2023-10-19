import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Toy toy1 = new Car("Гоночная машинка");
        Toy toy2 = new Car("Грузовик");
        Toy toy3 = new Cubes("Конструктор");
        Toy toy4 = new Cubes("Пазл");
        Toy toy5 = new Dol("Барби");
        Toy toy6 = new Dol("Пупс");
        Toy toy7 = new Pencil("Цветные карандаши");
        Toy toy8 = new Pencil("Маркеры");
        Toy toy9 = new SoftToys("Мишка");
        Toy toy10 = new SoftToys("Собачка");

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);
        toys.add(toy8);
        toys.add(toy9);
        toys.add(toy10);

        ToyShop toyShop = new ToyShop(toys);
        toyShop.saveToyForLottery();


    }


    
}
