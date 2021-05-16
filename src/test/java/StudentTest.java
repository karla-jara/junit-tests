import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentParametersAreInitialized(){

        Student name = new Student("Karla", 100L);
        assertNotNull(name.getName());
        assertNotNull(name.getGrades());

        assertEquals(name.getName(), "Karla");
        assertEquals(name.getId(), 100L);
        assertEquals(name.getGrades(), new ArrayList<>());
    }

    @Test
    public void testIfGradeWasAddedToGrades(){
        Student name = new Student("Karla", 100L);

        name.addGrade(90);
        assertEquals(1, name.getGrades().size());
        assertNotEquals(0, name.getGrades().size());
    }

    @Test
    public void testIfCorrectNameAndIdIsReturned(){
        Student name = new Student("Karla", 1L);
        assertEquals(name.getName(), "Karla");
        assertNotEquals("Carla", name.getName());

        assertEquals(name.getId(), 1L);
        assertNotEquals(1F, name.getId());
    }

    @Test
    public void testIfReturnsListOfGrades(){
        ArrayList<Integer> expected = new ArrayList<>();

        Student name = new Student("Karla", 1L);
        assertTrue(name.getGrades().isEmpty());

        expected.add(90);
        name.addGrade(90);
        assertEquals(expected, name.getGrades());
    }

    @Test
    public void testIfReturnsGradeAverage(){
        Student name = new Student("Karla", 1L);
        name.addGrade(90);
        name.addGrade(90);
        name.addGrade(90);
        assertEquals(90, name.getGradeAverage(), 0);
        assertEquals(3, name.getGrades().size());
    }






}

//@Before
//public void setUp(){}
