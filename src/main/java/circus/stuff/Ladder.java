package circus.stuff;

<<<<<<< HEAD:src/main/java/circus/stuff/Ladder.java
import circus.stuff.Equipment;

public class Ladder extends Equipment {
=======
import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>> improved:src/main/java/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
