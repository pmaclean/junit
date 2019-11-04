package example2Stages;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import example2Stages.NameMatcher03;

public class NameMatcher_UnitTest03 {
	
	static Stream<Arguments> getMatcherTestData() {
		return Stream.of(
				Arguments.of("Donald", "Donald", true),
				Arguments.of("Daisy", "daisy", true),
				Arguments.of("Donald", "Donald ", true)
				);
	}
	
		// Test whether two like names match each other.
		@ParameterizedTest
		@MethodSource("getMatcherTestData")
		public void Matcher_TwoIdentical_ReturnsTrue(String name1, String name2, boolean expectedResult)
		{
			NameMatcher03 sut = new NameMatcher03();
			
			boolean actualResult = sut.Matches(name1, name2);
			
			Assertions.assertEquals(expectedResult, actualResult);
		}
		
}
