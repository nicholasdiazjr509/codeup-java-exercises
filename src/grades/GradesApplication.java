package grades;

import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {
    private final Map<String, Student> students;
    private final Input input;

    //HashMap<String> students = new <String>();
    //HashMap<String, Student> students = new HashMap<>();
    public GradesApplication(Map<String, Student>students, Input input){
        this.students = students;
        this.input = input;
    }
    public void init(){
        System.out.println("Hello! This the Grades application.");
        runInteraction();
    }
    private void runInteraction(){
        System.out.println(getStudentsList());
        System.out.println("\nWhich student would like information for?");
        String response = input.getString();
            if(students.containsKey(response)) {
                System.out.println(getStudentInfo(response));
            }else{
                System.out.println("\nNo such student with the username " + response);
            }
        System.out.println("\nTry again?");
            boolean toContinue = input.yesNo();
                if(toContinue){
                    runInteraction();
                }else{
                    System.out.println("\nBye!!!");
                }
    }
    private String getStudentsList(){
        String output = "Here are the user names of our students: \n";
            for(Map.Entry<String, Student> entry : students.entrySet()){
                output += "|" + entry.getKey() + "| ";
        }
            return "\n" + output.trim();
    }
    private String getStudentInfo(String username){
        return String.format("%nName: %s - GitHub Username: %s%nCurrent Avg: %.2f",
                students.get(username).getName(), username,
                students.get(username).getGradeAverage());
    }
    private static HashMap<String, Student> createStudents() {
       HashMap<String, Student> students = new HashMap<>();

Student student1 = new Student("Nikolai");
    student1.addGrade(100);
    student1.addGrade(88);
    student1.addGrade(99);

Student student2 = new Student("Michael");
    student2.addGrade(73);
    student2.addGrade(85);
    student2.addGrade(89);
 Student student3 = new Student("John");
    student3.addGrade(75);
    student3.addGrade(88);
    student3.addGrade(90);
 Student student4 = new Student("Cleo");
    student4.addGrade(77);
    student4.addGrade(78);
    student4.addGrade(100);

    students.put("nikolai888", student1);
    students.put("michael777", student2);
    students.put("john007", student3);
    students.put("cleo789", student4);

        return students;

    }

    public static void main(String[] args) {
        GradesApplication app = new GradesApplication(createStudents(), new Input());
            app.init();
    }
}
