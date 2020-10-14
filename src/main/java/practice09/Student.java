package practice09;

import java.util.Optional;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getKlassNumber() {
        return klass.getNumber();
    }

    public String introduce() {
        boolean isClassLeader = Optional.ofNullable(klass.getLeader())
                .map(Person::getName)
                .filter(s -> super.getName().equals(s))
                .isPresent();

        String classLeader = isClassLeader
                ? "I am Leader of Class "
                : "I am at Class ";

        return super.introduce()
                + " I am a Student. "
                + classLeader
                + klass.getNumber() + ".";
    }
}
