package practice07;

public class Klass {
    private int number;
    private String displayName;

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, String displayName) {
        this.number = number;
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
