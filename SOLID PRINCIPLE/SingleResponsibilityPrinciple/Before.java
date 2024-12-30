  public class ZooEntity {
    // "CHARACTERS"
    // Staff
    String name;
    Integer age;
    Gender gender;
    Double salary;
    String department;
    Role role;
    String shiftTime;

    // Animal
    String species;
    String dietType;
    Boolean canFly;
    Boolean hasWings;

    // Visitors
    Ticket ticket;
    Integer visitingTime;
    Boolean isVIP;

    // "BEHAVIOUR"
    // Staff
    void feedAnimal() {}
    void cleanPremises() {}
    void guidingPeople() {}
    void ticketChecking() {}

    // Animal
    void roam() {}
    void fly() {}
    void eatTheVisitor() {}

    // Visitor
    void getEatenByAnimal() {}
    void throwLitter() {}
}
