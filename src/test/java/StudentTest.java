
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp(){
        Student name = new Student("Karla", 100L);

        Student nameWithOneGrade = new Student("Renee", 101L);
        nameWithOneGrade.addGrade(88);

        Student nameWithManyGrades = new Student("Julian", 102L);
        nameWithManyGrades.addGrade(90);
        nameWithManyGrades.addGrade(100);
        nameWithManyGrades.addGrade(88);
        nameWithManyGrades.addGrade(79);
        nameWithManyGrades.addGrade(91);
        nameWithManyGrades.addGrade(76);
        nameWithManyGrades.addGrade(20);
        nameWithManyGrades.addGrade(60);
        nameWithManyGrades.addGrade(82);
    }

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
        assertEquals(0, name.getGrades().size());
        name.addGrade(90);
        name.addGrade(90);
        name.addGrade(90);
        assertEquals(90, name.getGradeAverage(), 0);
        assertEquals(3, name.getGrades().size());

    }






}

