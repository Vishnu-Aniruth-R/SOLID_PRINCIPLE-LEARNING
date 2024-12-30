abstract class Bird extends Animal {
    String species;

    // Force all birds to implement this, even if they can't fly
    abstract void fly();
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.print("Flap wings fastly along with noise");
    }
}

class Pigeon extends Bird {
    @Override
    void fly() {
        System.out.print("Flys above your head and poops on you");
    }
}

class Quail extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Quail cannot fly!");
    }
}

class Main {
    public static void main(String[] args) {
        Bird bird = new Quail(); // Simulate user selection
        bird.fly(); // Throws exception for non-flying birds
    }
}
