package OOPSRepo;

public class Level_1 extends MultiLevel {
    float marks;

    void getMarks(float m) {
        marks = m;
    }

    void putMarks() {
        System.out.println("Marks: " + marks);
    }
}
