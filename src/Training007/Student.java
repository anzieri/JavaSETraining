package Training007;

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

    GPA = (grade points * credits)/(no.of units *credits)
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

    public static double calculateGPA(String[] grades){

        double GPA = 0;
        double sum = 0;
        double CREDITS =3;

        for(String grade: grades){
            switch(grade){
                case "A+": sum = sum + (CREDITS * 4.3); break;
                case "A": sum = sum + (CREDITS * 4); break;
                case "A-": sum = sum + (CREDITS * 3.7); break;
                case "B+": sum = sum + (CREDITS * 3.3); break;
                case "B": sum = sum + (CREDITS * 3); break;
                case "B-": sum = sum + (CREDITS * 2.7); break;
                case "C+": sum = sum + (CREDITS * 2.3); break;
                case "C": sum = sum + (CREDITS * 2); break;
                case "C-": sum = sum + (CREDITS * 1.7); break;
                case "D+": sum = sum + (CREDITS * 1.3); break;
                case "D": sum = sum + (CREDITS * 1); break;
                case "D-": sum = sum + (CREDITS * 0.7); break;
                case "E": sum = sum + (CREDITS * 0.3); break;
                case "F": sum = sum + (CREDITS * 0); break;

            }
            GPA = sum/(grades.length * 3);

        }
        return GPA;
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

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 627, new String[]{"A+", "B", "B+", "C-", "A"});

        System.out.println(Arrays.toString(Student.addGrades(  "C", student1)));
        System.out.println(Arrays.toString(Student.addGrades(  "B-", student1)));
        System.out.println(Student.calculateGPA(student1.getGrades()));
    }

}
