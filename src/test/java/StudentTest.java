import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testIfNameIsEquals(){
        String expected = "Karla";
        String actual = "Karla";

        assertEquals(expected,actual);

    }
}

//@Before
//public void setUp(){}
