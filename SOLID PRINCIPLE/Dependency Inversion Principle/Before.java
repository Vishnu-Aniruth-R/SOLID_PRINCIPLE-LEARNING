// Low-level implementation: Concrete classes
class MeatBowl {
    void feed(String animal) {
        System.out.println("Feeding " + animal + " with meat.");
    }
}

class IronDoor {
    void lock() {
        System.out.println("Locking Iron Door.");
    }
}

// High-level module: Cage, which depends directly on low-level modules
class Cage {
    private MeatBowl bowl = new MeatBowl();  // Tightly coupled to MeatBowl
    private IronDoor door = new IronDoor();  // Tightly coupled to IronDoor

    void feedAnimal(String animal) {
        bowl.feed(animal);  // High-level module knows about the low-level implementation
    }

    void lockCage() {
        door.lock();  // High-level module knows about the low-level implementation
    }
}

public class Zoo {
    public static void main(String[] args) {
        Cage cage = new Cage();
        cage.feedAnimal("Tiger");
        cage.lockCage();
    }
}
