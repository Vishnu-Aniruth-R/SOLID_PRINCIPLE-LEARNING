// Abstract Bird Class
abstract class Bird extends Animal {
    String species;
}

// Interface for Flying Birds
interface ICanFly {
    void fly();
}

// Sparrow Class
class Sparrow extends Bird implements ICanFly {
    public void fly() {
        System.out.print("Flap wings fastly along with noise");
    }
}

// Pigeon Class
class Pigeon extends Bird implements ICanFly {
    public void fly() {
        System.out.print("Flys above your head and poops on you");
    }
}

// Quail Class (Flightless Bird)
class Quail extends Bird {
    // No need to implement fly method
}

// Factory to Get Bird Based on User Input
class BirdFactory {
    static Bird getBirdForUserSelection(String userSelection) {
        switch (userSelection.toLowerCase()) {
            case "sparrow":
                return new Sparrow();
            case "pigeon":
                return new Pigeon();
            case "quail":
                return new Quail();
            default:
                throw new IllegalArgumentException("Give me a valid Bird type only");
        }
    }
}

// Main Class
import ZooLibrary.Bird;

class Main {
    public static void main(String[] args) {
        // Example: User selects "quail"
        String userSelection = "quail"; // Simulate user input
        Bird b = BirdFactory.getBirdForUserSelection(userSelection);
        
        if (b instanceof ICanFly) {
            ICanFly flyingBird = (ICanFly) b;
            flyingBird.fly();
        } else {
            System.out.print("This bird can't fly");
        }
    }
}
