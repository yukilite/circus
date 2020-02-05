package circus;

import circus.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        //must be of that type to convert int
        train(new Parrot()); //difference between static binding (compiler). at run time it looks at actual object tries converting it into duck. gets error
        // Animal a2 = new Animal(); //added abstract to Animal
        // Bird b2 = new Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
