package Assessments;

import java.util.Arrays;

/*
    Practice Exercise 3: Student Management System
    Create a simple student management system:
    Requirements:
    Student class with name, id, grades array, and GPA
    Constructors for different initialization scenarios
    Methods to add grade, calculate GPA, display student info
    StudentManager class to test multiple students
    Demonstrate object references and array of objects

    learnt System.arraycopy(grades, 0, temp, 0, grades.length);

    Assumption for grades obtained online
    A+ = 4.3 grade points
    A = 4 grade points
    A- = 3.7 grade points
    B+ = 3.3 grade points
    B = 3 grade points
    B- = 2.7 grade points
    C+ = 2.3 grade points
    C = 2 grade points
    C- = 1.7 grade points
    D+ = 1.3 grade points
    D = 1 grade point
    D- = 0.7 grade points
    F = 0 grade points
 */
public class Student {

    private String name;
    private int studentID;
    private String[] grades = new String[5];
    private int GPA;

    public static String[] addGrades( String toBeAdded, Student student) {
        String[] grades = student.grades;
        String[] temp = new String[grades.length + 1];
        for(int i = 0; i < grades.length; i++){
            temp[i] = grades[i];
        }
        temp[temp.length - 1] = toBeAdded;
        student.grades = temp;
        return temp;
    }

    public static int calculateGPA(int[] grades){
        //TODO: Make Magic Soon
        return 0;
    }

    public Student(){};

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public Student(String name, int studentID, String[] grades){
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String[] getGrades() {
        return grades;
    }
    public void setGrades(String[] grades) {
        this.grades = grades;
    }
    public int getGPA() {
        return GPA;
    }
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

}

class StudentManager{

    static void main() {
        Student student1 = new Student("John Doe", 627, new String[]{"-A", "B", "B+", "C-", "A"});

        System.out.println(Arrays.toString(Student.addGrades(  "D", student1)));
    }

}
