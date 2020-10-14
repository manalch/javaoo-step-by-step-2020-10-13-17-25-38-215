package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Klass> schoolClass = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, String displayName) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (schoolClass.contains(student.getKlass())) {
            this.leader = student;
            return;
        }
        System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        schoolClass.add(student.getKlass());
    }
}
