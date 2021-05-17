import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort secondCohort;
    Student karla;
    Student john;
    @Before
    public void setUp(){
        karla = new Student(1L, "Karla");
        john = new Student(2L, "John");
        secondCohort = new Cohort();
    }

    @Test
    public void testCohortCanAddStudent(){
        secondCohort.addStudent(karla);
        assertEquals(1, secondCohort.getStudents().size());
        secondCohort.addStudent(john);
        assertEquals(2,secondCohort.getStudents().size());
    }

    @Test
    public void testThatCohortListOfStudentsReturns(){
        secondCohort.addStudent(karla);
        secondCohort.addStudent(john);
        assertNotNull(secondCohort.getStudents());
    }

    @Test
    public void testThatTheAverageIsCorrect(){
        karla.addGrade(90);
        karla.addGrade(80);
        karla.addGrade(70);
        karla.addGrade(60);
        karla.addGrade(50);

        assertEquals(70, karla.getGradeAverage(), 0);
        assertEquals(70, karla.getGrades().get(2), 0);
    }


}
