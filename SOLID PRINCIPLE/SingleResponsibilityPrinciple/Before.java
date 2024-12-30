public class ZooEntity {
    //"CHARACTERS"
    //Staff
    String name;
    Integer age;
    Gender gender;
    Double salary;
    String department;
    Role role;
    String shiftTime;

    //Animal
    String species;
    Gender gender;
    String dietType;
    Boolean canFly;
    Integer age;
    Boolean hasWings;

    //Visitors
    String name;
    Integer age;
    Gender gender;
    Ticket ticket;
    Integer visitingTime;
    Boolean isVIP;

    //"BEHAVIOUR"
    //Staff
    void eat();
    void poop();
    void feedAnimal();
    void cleanPremises();
    void guidingPeople();
    void sleep();
    void ticketChecking();

    //Animal
    void eat();
    void sleep();
    void poop();
    void roam();
    void fly();
    void fight();
    void eatTheVisitor;

    //Visitor
    void roam();
    void eat();
    void getEatenByAnimal();
    void throwLitter();
    void petAnimal();

}
