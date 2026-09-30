package _3_Inheritance_Exercise._6_Animals;

public class Kitten extends Cat{


    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Meow";

    }
}
