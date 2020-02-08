package circus.animal;

<<<<<<< HEAD:src/main/java/circus/animal/Duck.java
import circus.animal.Bird;

=======
>>>>>>> improved:src/main/java/Duck.java
public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "I'm a circus.animal.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    //implemented the getValue
    @Override
    public int getValue() {
        return 10;
    }
}
