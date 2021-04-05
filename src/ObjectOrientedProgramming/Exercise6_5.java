package ObjectOrientedProgramming;

public class Exercise6_5 {
    public static void main(String[] args) {
        Teacher s = new Teacher("ȫ�浿", 1, 1, 100, 60, 76);

        System.out.println(s.info());

    }
}

class Teacher {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Teacher(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    public int sum() {
        return kor + eng + math;
    }

    public float average() {
        return (int) (sum() / 3f * 10 + 0.5f) / 10f;
    }


    public String info() {

        return name 
                + "," + ban 
                + "," + no 
                + "," + kor 
                + "," + eng 
                + "," + math 
                + "," + sum() 
                + "," + average();

    }

}