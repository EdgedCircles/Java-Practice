class Student {
    private String name;
    private int id;
    private String[] courses;
    Student(String name, int id, String[] courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void getCourses() {
        System.out.println(courses);
    }
}

class Course {
    private String name;
    private int credits;
    private double score;
    public Course(String name, int credits, double score) {
         this.name = name;
         this.credits = credits;
         this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
    public void getScore() {
        System.out.println(score);
    }
    public double getGrade() {
       double grade = credits * score / 100;
       return grade;
    }
}

public class Grading {
    public static void main (String [] args) {
        Course course = new Course("CS",4,85);
        System.out.println(course.getGrade());
    }
}
