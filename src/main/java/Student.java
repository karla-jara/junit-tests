import java.util.ArrayList;

public class Student {
  //The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student (String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double totalPoints = 0;
        double numberOfGrades = grades.size();
        for (Integer grade : grades){
            totalPoints += grade;
        }
        return totalPoints/numberOfGrades;
    }
}
