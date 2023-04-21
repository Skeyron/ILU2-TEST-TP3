package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void testWelcom() {
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
	

}
