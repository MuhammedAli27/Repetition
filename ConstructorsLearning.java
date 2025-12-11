package Constructors;

public class ConstructorsLearning {
    public static void main(String[] args) {

        Student student1 = new Student("Muhammed", 15, 4.0, false);
        Student student2 = new Student("Alex", 17, 3.8, true);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.inLove);

        System.out.println(" ");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.inLove);

        System.out.println(" ");

        student1.personalInfo();
        student2.personalInfo();
    }
}

class Student {
    String name;
    int age;
    double gpa;
    boolean inLove;

    public Student(String name, int age, double gpa, boolean inLove) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.inLove = inLove;
    }

    public void personalInfo() {
        System.out.println("Name: " + name +  ", Age: " + age + ", GPA: " + gpa + ", In Love: " + inLove);
    }
}
