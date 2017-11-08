package test;


import org.junit.Assert;
import org.junit.Test;

import bowling.Bowling;

/**
*
*khaitq on 8 nov. 2017
*/

public class BowlingTest {

	@Test
	public void test() {
		
		Assert.assertTrue(Bowling.FRAME_NUMBER == 10);
	}
	
	@Test
	public void testPowOneBall() {
		
		Bowling bowling = new Bowling();
		bowling.pow(5,0);
		
		Assert.assertTrue(bowling.getScore() == 5);
	}
	
	@Test
	public void testPowOneFrame() {
		
		Bowling bowling = new Bowling();
		bowling.pow(5,3);
		
		Assert.assertTrue(bowling.getScore() == 8);
	}
	
	@Test
	public void testPowAllNormalFrame() {
		
		Bowling bowling = new Bowling();
		
		for (int i = 0; i < Bowling.FRAME_NUMBER; i++) {
			bowling.pow(4,4);
		}
		
		Assert.assertTrue(bowling.getScore() == 80);
	}
	
	@Test
	public void testPowOneSpake() {
		
		Bowling bowling = new Bowling();
		
		bowling.pow(5,5);
		
		for (int i = 0; i < Bowling.FRAME_NUMBER - 1; i++) {
			bowling.pow(8,1);
		}
		
	//	System.out.println("here: " + bowling.getScore());
		
		Assert.assertTrue(bowling.getScore() == 99);
	}
	
	@Test
	public void testPowAllSpake() {
		
		Bowling bowling = new Bowling();
		
		for (int i = 0; i < Bowling.FRAME_NUMBER - 1; i++) {
			bowling.pow(4,6);
		}
		
	//	System.out.println("here: " + bowling.getScore());
		
		Assert.assertTrue(bowling.getScore() == 136);
	}

}


