package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce() {
        String classSection = klass == null
                ? " I am a Teacher. I teach No Class."
                : " I am a Teacher. I teach Class " + klass + ".";
        return super.introduce().concat(classSection);
    }
}
