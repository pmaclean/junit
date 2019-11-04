package example2Stages;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import example2Stages.NameMatcher04;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class NameMatcher_UnitTest04 {
	
	static Stream<Arguments> getMatcherTestData() {
		return Stream.of(
				Arguments.of("Donald", "Donald", true),
				Arguments.of("Daisy", "daisy", true),
				Arguments.of("Donald", "Donald ", true),
				Arguments.of("Jack", "Jaaaaaaaack", true)
				);
	}
	
		// Test whether two like names match each other.
		@ParameterizedTest
		@MethodSource("getMatcherTestData")
		public void Matcher_TwoIdentical_ReturnsTrue(String name1, String name2, boolean expectedResult)
		{
			NameRepo myRepo = mock(NameRepo.class);
			when(myRepo.duckNameToFormalName(anyString()))	
			.thenAnswer(i -> GetFormalName((String)i.getArguments()[0]));
			
			NameMatcher04 sut = new NameMatcher04(myRepo);
			
			boolean actualResult = sut.Matches(name1, name2);
			
			Assertions.assertEquals(expectedResult, actualResult);
		}

		private Object GetFormalName(String name) {
			// TODO Auto-generated method stub
			if (name.equalsIgnoreCase("Jaaaaaaaack")) return "Jack";
			return name;
		}
		
}
