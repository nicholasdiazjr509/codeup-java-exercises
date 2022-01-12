package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Double> grades;

 public Student(String name){
     this.name = name;
     this.grades = new ArrayList();
 }
   // private ArrayList<Integer> grades = new ArrayList<Integer>();
    public void setStudentName(String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
    }
        // returns the student's name
        public String getName(){
        return name;
        }
        public ArrayList<Double> getGrades(){
            return this.grades;
        }
        // adds the given grade to the grades property
        public void addGrade(double grade) {
            grades.add(grade);
        }
        // returns the average of the students grades
        public double getGradeAverage(){
            double totalGrades = 0;
            double numberOfGrades = grades.size();
                for(Double grade : this.grades) {
                    totalGrades += grade;
            }
            double gradesAdded = totalGrades/this.grades.size();
                return gradesAdded;
 }
public static void main(String[] args) {
        Student bob = new Student("Bob");
        //student1.setStudentName("Bob Jones");
            bob.addGrade(78);
            bob.addGrade(81);
            bob.addGrade(91);
    System.out.println("Grades for " + bob.getName()+ ": " + bob.getGrades());
    System.out.println(bob.getName() + "'s Grade Avg. is: " + bob.getGradeAverage());

    }
}