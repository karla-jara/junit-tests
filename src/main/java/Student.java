import java.util.ArrayList;

public class Student {
    public long idNum;
    private String name;
    private ArrayList<Integer> grades;

    public void setIdNameInitiateGrades(String studentName, long id){
        this.idNum = id;
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public long getIdNum(){
        return idNum;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double gerGradeAverage(){
        double totalPoints = 0;
        double numberOfGrades = grades.size();
        for(int grade : grades){
            totalPoints += grade;
        }
        return totalPoints/numberOfGrades;
    }
}
