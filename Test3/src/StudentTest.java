import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testAlter() {
		Student s1 = new Student("Benni", 1995, "IMA");
		assertEquals("", 19, s1.getAlter());// Alter korrekt
	}

}
