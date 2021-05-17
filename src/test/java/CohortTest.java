import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    @Before
    public void setUp(){
        Student karla = new Student(1L, "Karla");
        Student john = new Student(2L, "John");
        Cohort firstCohort = null;
        Cohort secondCohort = new Cohort();
        secondCohort.addStudent(karla);
        secondCohort.addStudent(john);
        karla.addGrade(90);
        karla.addGrade(80);
        karla.addGrade(70);
        karla.addGrade(60);
        karla.addGrade(50);
    }

    @Test
    public void testCohortCanAddStudent(){
        Student karla = new Student(1L, "Karla");
        Student john = new Student(2L, "John");

        Cohort firstCohort = null;
        assertNull(firstCohort);

        Cohort secondCohort = new Cohort();
        secondCohort.addStudent(karla);
        assertEquals(1, secondCohort.getStudents().size(), 0);

        secondCohort.addStudent(john);
        assertEquals(2,secondCohort.getStudents().size(),0);
    }

    @Test
    public void testThatCohortListOfStudentsReturns(){
        Student karla = new Student(1L, "Karla");
        Student john = new Student(2L, "John");
        Cohort firstCohort = null;
        Cohort secondCohort = new Cohort();
        secondCohort.addStudent(karla);
        secondCohort.addStudent(john);
        assertNotNull(secondCohort.getStudents());
    }

    @Test
    public void testThatTheAverageIsCorrect(){
        Student karla = new Student(1L, "Karla");
        karla.addGrade(90);
        karla.addGrade(80);
        karla.addGrade(70);
        karla.addGrade(60);
        karla.addGrade(50);

        assertEquals(70, karla.getGradeAverage(), 0);
        assertEquals(70, karla.getGrades().get(2), 0);
    }


}
