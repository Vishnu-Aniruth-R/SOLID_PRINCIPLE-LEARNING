class Bird extends Animal {
    String species;

    void fly() {
        if (species.equals("sparrow")) {
            System.out.print("Flap wings vigorously and make noise");
        } else if (species.equals("pigeon")) {
            System.out.print("Flys above your head and poops on your new dress at the perfect time");
        } else if (species.equals("quail")) {
            System.out.print("Flys from branch to branch as well as sings well");
        }
    }
}
// Main Class
import ZooLibrary.Bird;

class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.species = "pigeon";
        b.fly();
    }
}
