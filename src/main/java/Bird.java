public abstract class Bird extends Animal { // having bird doesnt need all methods inherited by animal class. becomes job of child classes. therefore abstract as redundant
    public void fly() {
        System.out.println("Whee ...");
    }
}
