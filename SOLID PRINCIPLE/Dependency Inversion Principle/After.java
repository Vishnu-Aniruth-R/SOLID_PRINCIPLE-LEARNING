// High-level abstractions: Interfaces
interface IBowl {
    void feed(String animal);
}

interface IDoor {
    void lock();
}

// Low-level implementations: Concrete classes
class MeatBowl implements IBowl {
    public void feed(String animal) {
        System.out.println("Feeding " + animal + " with meat.");
    }
}

class IronDoor implements IDoor {
    public void lock() {
        System.out.println("Locking Iron Door.");
    }
}

class FruitBowl implements IBowl {
    public void feed(String animal) {
        System.out.println("Feeding " + animal + " with fruit.");
    }
}

class WoodenDoor implements IDoor {
    public void lock() {
        System.out.println("Locking Wooden Door.");
    }
}

// High-level module: Cage, which now depends on abstractions
class Cage {
    private IBowl bowl;   // Depend on abstraction, not on concrete class
    private IDoor door;   // Depend on abstraction, not on concrete class

    // Constructor injection (dependency injection)
    public Cage(IBowl bowl, IDoor door) {
        this.bowl = bowl;
        this.door = door;
    }

    void feedAnimal(String animal) {
        bowl.feed(animal);  // Delegate the task to the injected bowl
    }

    void lockCage() {
        door.lock();  // Delegate the task to the injected door
    }
}

public class Zoo {
    public static void main(String[] args) {
        // Here, we inject concrete implementations into Cage using constructor injection
        IBowl meatBowl = new MeatBowl();   // Low-level module
        IDoor ironDoor = new IronDoor();   // Low-level module

        Cage cage = new Cage(meatBowl, ironDoor);  // Inject dependencies
        cage.feedAnimal("Tiger");
        cage.lockCage();
        
        // We can change the low-level implementation easily
        IBowl fruitBowl = new FruitBowl();    // Another low-level implementation
        IDoor woodenDoor = new WoodenDoor();  // Another low-level implementation

        Cage peacockCage = new Cage(fruitBowl, woodenDoor);  // Inject different dependencies
        peacockCage.feedAnimal("Peacock");
        peacockCage.lockCage();
    }
}
