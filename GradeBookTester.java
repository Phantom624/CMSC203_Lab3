/*  Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The Program tests the methods in the java file GradeBook and determines if they function properly.
 * Due: 10/16/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Fernando Benitez-Diaz
*/
package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook g1;
	GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(90);
		g2.addScore(65);
		g1.addScore(75);
		g2.addScore(85);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("90.0 75.0 "));
		assertTrue(g2.toString().equals("65.0 85.0 "));
		//fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(165, g1.sum(), .0001);
		assertEquals(150, g2.sum(), .0001);
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(75, g1.minimum(), .001);
		assertEquals(65, g2.minimum(), .001);
		//fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(90, g1.finalScore());
		assertEquals(85, g2.finalScore());
		//fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("90.0 75.0 "));
		assertTrue(g2.toString().equals("65.0 85.0 "));
		//fail("Not yet implemented");
	}

}
