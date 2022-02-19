package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Senha;

class SenhaTest {

	@Test
	void testVerifySmallSize() {
		Senha testSenha = new Senha();
		Integer testPass = testSenha.verifySize("12345");
		
		assertEquals(1, testPass);
	}
	
	@Test
	void testVerifySize() {
		Senha testSenha = new Senha();
		Integer testPass = testSenha.verifySize("123456");
		
		assertEquals(0, testPass);
	}
	
	@Test
	void testVerifyBigSize() {
		Senha testSenha = new Senha();
		Integer testPass = testSenha.verifySize("1234567");
		
		assertEquals(0, testPass);
	}
	
	@Test
	void testVerifyEmptyString() {
		Senha testSenha = new Senha();
		Integer testPass = testSenha.verifySize("");
		
		assertEquals(6, testPass);
	}

	@Test
	void testVerifyDigit() {
		Senha testSenha = new Senha();
		Integer testDig = testSenha.verifyDigit("3");
		
		assertEquals(0, testDig);
	}
	
	@Test
	void testVerifyDigitString() {
		Senha testSenha = new Senha();
		Integer testDig = testSenha.verifyDigit("f");
		
		assertEquals(1, testDig);
	}
	
	@Test
	void testVerifyDigitChar() {
		Senha testSenha = new Senha();
		Integer testDig = testSenha.verifyDigit("@");
		
		assertEquals(1, testDig);
	}
	
	@Test
	void testVerifyDigitEmpty() {
		Senha testSenha = new Senha();
		Integer testDig = testSenha.verifyDigit("");
		
		assertEquals(1, testDig);
	}

	@Test
	void testVerifyUpperCase() {
		Senha testSenha = new Senha();
		Integer testUpper = testSenha.verifyUpperCase("A");
		
		assertEquals(0, testUpper);
	}
	
	@Test
	void testVerifyUpperCaseLow() {
		Senha testSenha = new Senha();
		Integer testUpper = testSenha.verifyUpperCase("a");
		
		assertEquals(1, testUpper);
	}
	
	@Test
	void testVerifyUpperCaseDigit() {
		Senha testSenha = new Senha();
		Integer testUpper = testSenha.verifyUpperCase("0");
		
		assertEquals(1, testUpper);
	}
	
	@Test
	void testVerifyUpperCaseEmpty() {
		Senha testSenha = new Senha();
		Integer testUpper = testSenha.verifyUpperCase("");
		
		assertEquals(1, testUpper);
	}

	@Test
	void testVerifyLowCase() {
		Senha testSenha = new Senha();
		Integer testLow = testSenha.verifyLowCase("h");
		
		assertEquals(0, testLow);
	}
	
	@Test
	void testVerifyLowCaseUpper() {
		Senha testSenha = new Senha();
		Integer testLow = testSenha.verifyLowCase("H");
		
		assertEquals(1, testLow);
	}
	
	@Test
	void testVerifyLowCaseChar() {
		Senha testSenha = new Senha();
		Integer testLow = testSenha.verifyLowCase("&");
		
		assertEquals(1, testLow);
	}
	
	@Test
	void testVerifyLowCaseDigit() {
		Senha testSenha = new Senha();
		Integer testLow = testSenha.verifyLowCase("2");
		
		assertEquals(1, testLow);
	}
	
	@Test
	void testVerifyLowCaseEmpty() {
		Senha testSenha = new Senha();
		Integer testLow = testSenha.verifyLowCase("");
		
		assertEquals(1, testLow);
	}

	@Test
	void testVerifyCharacter() {
		Senha testSenha = new Senha();
		Integer testChar = testSenha.verifyCharacter("%");
		
		assertEquals(0, testChar);
	}
	
	@Test
	void testVerifyCharacterString() {
		Senha testSenha = new Senha();
		Integer testChar = testSenha.verifyCharacter("p");
		
		assertEquals(1, testChar);
	}
	
	@Test
	void testVerifyCharacterDigit() {
		Senha testSenha = new Senha();
		Integer testChar = testSenha.verifyCharacter("6");
		
		assertEquals(1, testChar);
	}
	
	@Test
	void testVerifyCharacterEmpty() {
		Senha testSenha = new Senha();
		Integer testChar = testSenha.verifyCharacter("");
		
		assertEquals(1, testChar);
	}
	
	@Test
	void testVerifyCharacterWrong() {
		Senha testSenha = new Senha();
		Integer testChar = testSenha.verifyCharacter("[~|?/:;_´`}{§°=6¬¨]");
		
		assertEquals(1, testChar);
	}

}
