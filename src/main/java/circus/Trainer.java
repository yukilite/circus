package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting means casting it to parent type
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot()); // works
        // circus.animal.Animal a2 = new circus.animal.Animal();
        // circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void train(Bird bird) { //do shift cmd a to bring up surround with
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
