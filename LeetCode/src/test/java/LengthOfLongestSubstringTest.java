import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfLongestSubstringTest {

	@Test
	public void testLengthOfLongestSubstring() {
		LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
		int result = ls.lengthOfLongestSubstring("abcd");
		assertEquals(result, 4);
		result = ls.lengthOfLongestSubstring("abcdaccdbaef");
		assertEquals(result, 6);
		result = ls.lengthOfLongestSubstring("aaaa");
		assertEquals(result, 1);
	}

}
