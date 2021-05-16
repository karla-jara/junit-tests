import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    private Student name;

    @Test
    public void testIfNameIsInitialized(){
        Student name = new Student("Karla", 100L);
        name.addGrade(90);

        assertNotNull(name);

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
        name.addGrade(90);
        assertArrayEquals([90]  , name.getGrades());
    }


}

//@Before
//public void setUp(){}
