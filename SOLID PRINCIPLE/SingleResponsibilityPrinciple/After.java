class zooCharacter
{
    String name;
    Gender gender;
    Integer age;

    void eat();
    void poop();
    void sleep();
}

class Staff extends zooCharacter
{
    Double salary;
    String department;
    Role role;
    String shiftTime;

    void feedAnimal();
    void cleanPremises();
    void guidingPeople();
    void ticketChecking();
}
class Animal extends zooCharacter
{
    String species;
    String dietType;
    Boolean canFly;
    Boolean hasWings;

    void roam();
    void fly();
    void fight();
    void eatTheVisitor;
}
class Visitor extends zooCharacter
{
    Ticket ticket;
    Integer visitingTime;
    Boolean isVIP;

    void roam();
    void getEatenByAnimal();
    void throwLitter();
    void petAnimal();
}
