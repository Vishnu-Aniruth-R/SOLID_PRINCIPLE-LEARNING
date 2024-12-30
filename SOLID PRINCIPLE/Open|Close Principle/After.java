// Abstract Bird Class
abstract class Bird extends Animal {
    abstract void fly();
}

// Sparrow Class
class Sparrow extends Bird {
    void fly() {
        System.out.print("Flap wings fastly along with noise");
    }
}

// Pigeon Class
class Pigeon extends Bird {
    void fly() {
        System.out.print("Flys above your head and poops on you");
    }
}

// Quail Class
class Quail extends Bird {
    void fly() {
        System.out.print("Flys from tree to tree as well as sings a melody song beautifully");
    }
}

// Peacock Class
class Peacock extends Bird {
    void fly() {
        System.out.print("Flys when needed and dances when it rains");
    }
}

// Main Class
import ZooLibrary.Bird;

class Main {
    public static void main(String[] args) {
        Bird b = new Peacock();
        b.fly();
    }
}
