package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.PasswordVerify;

public class PasswordVerifyTest {
	
	@Test
	public void testPasswordHasMore8Characters() {
		assertTrue(PasswordVerify.verify("123456789gGff"));
		assertFalse(PasswordVerify.verify("GF5678"));
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testPasswordNotNull() {
		PasswordVerify.verify(null);
	}
	
	@Test
	public void testPasswordHasUpperCase() {
		assertTrue(PasswordVerify.verify("abc123456dE"));
		assertFalse(PasswordVerify.verify("abcd1234569"));
	}
	
	@Test
	public void testPasswordHasLowerCase() {
		assertTrue(PasswordVerify.verify("abc123456dE"));
		assertFalse(PasswordVerify.verify("AFFF1234569"));
	}

	@Test
	public void testPasswordHasNumber() {
		assertTrue(PasswordVerify.verify("abcdEFGHFFG123"));
		assertFalse(PasswordVerify.verify("abcdefFGHLMN"));
	}

}
