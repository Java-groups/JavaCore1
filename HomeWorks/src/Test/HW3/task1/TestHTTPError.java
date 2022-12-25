package Test.HW3.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import HW3.task1.HTTPError;

class TestHTTPError {

	@Test
	void testGetError() {
		String expected = "REQUEST_TIMEOUT";
		assertEquals(expected, HTTPError.getError(408));
	}

}
