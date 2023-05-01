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
		assertEquals("Hello, Amy and Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Amy and Bob", Welcome.welcome("  amy,      bob"));
	}
	
	@Test
	void testWelcom5() {
		assertEquals("Hello, Amy, Bob and Jerry", Welcome.welcome("amy,bob,jerry"));
		assertEquals("Hello, Amy, Bob and Kevin", Welcome.welcome("  amy,      bob,  kevin"));
		assertEquals("Hello, Amy, Bob, Jerry, Moustache and Ursula", Welcome.welcome("amy,bob,jerry,moustache,ursula"));
	}
	
	@Test
	void testWelcom6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("amy,BOB,jerry"));
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB AND MARS !", Welcome.welcome("amy,BOB,jerry,          MARS"));
	}
	
	@Test
	void testWelcom7() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("amy,BOB,jerry"));
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB AND MARS !", Welcome.welcome("amy,BOB  ,   jerry, MARS"));
	}
}
