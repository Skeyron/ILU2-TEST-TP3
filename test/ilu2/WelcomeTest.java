package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void testWelcom1() {
		assertEquals("Hello, Ballon", Welcome.welcome("ballon"));
		assertEquals("Hello, Moscow", Welcome.welcome("moscow"));
	}
	
	@Test
	void testWelcom2() {
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome(" "));
		assertEquals("Hello, my friend", Welcome.welcome("        "));
		assertEquals("Hello, my friend", Welcome.welcome(null));
	}
	
	@Test
	void testWelcom3() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
		assertEquals("Hello, JeRRY", Welcome.welcome("JeRRY"));
		assertEquals("Hello, JERRY", Welcome.welcome("jERRY"));
	}
	
	@Test
	void testWelcom4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Amy, Bob", Welcome.welcome("  amy,      bob"));
	}
	
	
}
