import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInsertPositionTest {

	@Test
	public void testSearchInsert() {
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums = {1};
		int result = sip.searchInsert(nums, 2);
		assertEquals(1, result);
		
	}

}
