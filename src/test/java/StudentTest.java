import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentParametersAreInitialized(){
        Student name = new Student("Karla", 100L);
        assertNotNull(name.getName());
        assertEquals(name.getName(), "Karla");
        assertEquals(name.getId(), 100L);
        assertNotNull(name.getGrades());
        assertEquals(name.getGrades(), new ArrayList<>());
    }

    @Test
    public void testIfDoubleGradeIsCorrect(){
        Double grade1 = 90.0;
        Double grade2 = 87.5;

        assertEquals(2.5,grade1-grade2, 0);
        grade2 = 90.0;
        assertEquals(1, grade1/grade2,0);
    }

    @Test
    public void testIfGradeWasAddedToGrades(){
        Student name = new Student("Karla", 100L);

        assertTrue(name.getGrades().isEmpty());

        name.addGrade(90);
        assertEquals(1, name.getGrades().size());

        name.addGrade(88);
        assertEquals(2, name.getGrades().size());
    }


}

//@Before
//public void setUp(){}
