package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String classTeacher = klass == null
                ? " I am a Teacher. I teach No Class."
                : " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        return super.introduce().concat(classTeacher);
    }

    public String introduceWith(Student student) {
        String teachStudent = klass.getNumber() == student.getKlassNumber()
                ? "I teach"
                : "I don't teach";

        return super.introduce()
                + " I am a Teacher. "
                + teachStudent
                + " "
                + student.getName()
                + ".";
    }
}
