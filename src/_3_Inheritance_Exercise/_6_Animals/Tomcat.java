package _3_Inheritance_Exercise._6_Animals;

public class Tomcat extends Cat{

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
