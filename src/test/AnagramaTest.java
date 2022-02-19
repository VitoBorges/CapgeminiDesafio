package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Anagrama;

class AnagramaTest {

	@Test
	void testGetWordFrag() {
		Anagrama testAnagrama = new Anagrama();
		Integer testAna = testAnagrama.getWordFrag("ovo");
		
		assertEquals(2, testAna);
	}
	
	@Test
	void testGetWordFragEmpty() {
		Anagrama testAnagrama = new Anagrama();
		Integer testAna = testAnagrama.getWordFrag("");
		
		assertEquals(0, testAna);
	}

	@Test
	void testCommuteSingleChar() {
		Anagrama testAnagrama = new Anagrama();
		Integer testAna = testAnagrama.commute("ovo", "o", 0);
		
		assertEquals(1, testAna);
 	}
	
	@Test
	void testCommuteMultChar() {
		Anagrama testAnagrama = new Anagrama();
		Integer testAna = testAnagrama.commute("ifailuhkqq", "ifa", 0);
		
		assertEquals(1, testAna);
 	}
	
	@Test
	void testCommuteEmptyChar() {
		Anagrama testAnagrama = new Anagrama();
		Integer testAna = testAnagrama.commute("", "", 0);
		
		assertEquals(0, testAna);
	}

}
