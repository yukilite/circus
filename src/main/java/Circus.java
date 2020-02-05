import circus.Parrot;
import stuff.Cannon;
import stuff.Equipment;
import stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset e : equipments) {
            if (e.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + e.getValue());
                continue;
            }
            total += e.getValue();
            System.out.println("Adding item value: " + e.getValue());
            // some
            // more
            // code
            // here ...
        }

        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
       // System.out.println("Total value of equipments " + calculateValue(animals)); //control d to copy sentence.
        //create superclass called Assets. java doesnt allow multiple inheritance. so instead of inheriting class from assets, develop an "interface". inmplement classes into interface
    }
}
