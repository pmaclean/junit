package example2Stages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import example2Stages.NameMatcher00;

public class NameMatcher_UnitTest00 {
	
	// Test whether two like names match each other.
	@Test
	public void Matcher_TwoIdentical_ReturnsTrue()
	{
		NameMatcher00 sut = new NameMatcher00();
		boolean expectedResult = true;
		
		boolean actualResult = sut.Matches("Donald", "Donald");
		
		Assertions.assertEquals(expectedResult, actualResult);
	}

}
