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
        throw new FlightlessBirdException("Brother, instead I can sing a song for you");
    }
}

// Custom Exception for Flightless Birds
class FlightlessBirdException extends RuntimeException {
    public FlightlessBirdException(String message) {
        super(message);
    }
}

// Bird Factory to Select Bird Based on User Input
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
        try {
            Bird b = BirdFactory.getBirdForUserSelection(userSelection);
            b.fly();
        } catch (FlightlessBirdException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
