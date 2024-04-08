package student;

public class Student {
    String name;
    int age;
    int [] score;
    int scoreCount = 0;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = new int[score];
        this.score[0] = score;
        this.scoreCount=1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void putStudentScore(int score) {
        this.score[scoreCount] = score;
        scoreCount++;
    }
    public double getAverageScore() {
        double sum = 0;
        for (int i = 0; i < scoreCount; i++) {
            sum += score[i];
        }
        return sum/scoreCount;
    }
}
