import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindromeTest {

	@Test
	public void testIsPalindrome() {
		CheckPalindrome cp = new CheckPalindrome();
		boolean result = cp.isPalindrome(1111112);
		assertFalse(result);
		result = cp.isPalindrome(123454321);
		assertTrue(result);
		result = cp.isPalindrome(1);
		assertTrue(result);
		result = cp.isPalindrome(-1111);
		assertFalse(result);
		
	}

}
