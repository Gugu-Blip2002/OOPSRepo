package OOPSRepo;

public class Main_2 {
    public static void main(String[] args) {
        MultiLevel m2 = new MultiLevel();
        m2.getNo(2001230063);
        m2.putNo();

        Level_1 l1 = new Level_1();
        l1.getMarks(78);
        l1.putMarks();

        Level_2 l2 = new Level_2();
        l2.getScore(68.7F);
        l2.putScore();
       
    }
}
