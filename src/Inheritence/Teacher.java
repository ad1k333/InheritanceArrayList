package Inheritence;

public class Teacher extends Person {
    private String School;

    public Teacher(String name, int age, String email, String School) {
        super(name, age, email);
        this.School = School;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " And I teach children " + School + ".";
    }
}