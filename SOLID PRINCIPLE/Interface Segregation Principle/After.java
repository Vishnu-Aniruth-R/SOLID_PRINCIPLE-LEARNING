abstract class Bird extends Animal {
    String species;
}

// Interface for flying capability
interface ICanFly {
    void fly();
}

class Sparrow extends Bird implements ICanFly {
    @Override
    public void fly() {
        System.out.print("Flap wings fastly along with noise");
    }
}

class Pigeon extends Bird implements ICanFly {
    @Override
    public void fly() {
        System.out.print("Flys above your head and poops on you");
    }
}

class Quail extends Bird {
    // Does not implement ICanFly, avoiding unwanted methods
}

class BirdFactory {
    static Bird getBird(String type) {
        switch (type.toLowerCase()) {
            case "sparrow":
                return new Sparrow();
            case "pigeon":
                return new Pigeon();
            case "quail":
                return new Quail();
            default:
                throw new IllegalArgumentException("Invalid bird type");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Simulate user input for bird type
        Bird bird = BirdFactory.getBird("quail");

        // Check if the bird can fly
        if (bird instanceof ICanFly) {
            ICanFly flyingBird = (ICanFly) bird;
            flyingBird.fly();
        } else {
            System.out.print("This bird can't fly");
        }
    }
}
