package _4_Interfaces_and_Abstraction_Exercise._1_Person;

public class Pet implements Birthable{

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
