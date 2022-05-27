import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a= 1234;
		int b= 8765;
		Calculator cal= new Calculator();
		int actual = cal.add (a,b);
		
		int expected =9999;
		assertEquals(expected, actual);
		
	}
	@Test
	  public void testSubtract() {
	    int a =1234;
	    int b= 8765;
	    Calculator cal=new Calculator();
	    int actual= cal.subtract(a,b);
	    
	    int expected=7531;
	    assertEquals(expected,actual);
	 }
	@Test
	public void testDivide() {
		int a=800;
		int b= 2;
		Calculator cal= new Calculator();
		int actual=cal.divide(a,b);
		
		int expected=400;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testMultiply() {
		int a=4;
		int b= 2;
		Calculator cal= new Calculator();
		int actual=cal.divide(a,b);
		
		int expected=8;
		assertEquals(expected,actual);
	}
}
