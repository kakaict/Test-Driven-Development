package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Euro;

public class EuroTest {
	
	@Test (expected = IllegalArgumentException.class)
	public void throwExceptionIfNegativeNumber(){
        Double negativeAmount = 0d - Math.random() * Double.MAX_VALUE;
		new Euro(negativeAmount);
	}
	
	@Test
	public void testEuroObjectToString(){
		assertEquals("EURO 2,50", new Euro(2.5).toString());
		assertEquals("EURO 2,00", new Euro(2).toString());
	}
	
	@Test
	public void testEuroEquality(){
		Euro euro1 = new Euro(5.5);
		Euro euro2 = new Euro(5.5);
		assertTrue(euro1.equals(euro2));
	}
	
	@Test
	public void testEuroInequality(){
		Euro euro1 = new Euro(5.5);
		Euro euro2 = new Euro(9);
		assertFalse(euro1.equals(euro2));
	}
	
	@Test
	public void testEuroSubtraction(){
		assertEquals(new Euro(3), (new Euro(5).subtract(new Euro(2))));
		assertEquals(new Euro(0.61), (new Euro(1.03).subtract(new Euro(0.42))));
	}

	@Test
	public void testEuroAddition(){
		assertEquals(new Euro(5), (new Euro(2).add(new Euro(3))));
	}
}