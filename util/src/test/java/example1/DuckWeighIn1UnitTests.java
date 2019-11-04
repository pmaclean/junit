package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import example1.DuckWeighIn1;


public class DuckWeighIn1UnitTests {

	@Test
	public void WeighIn_TwoNumbers_ReturnsSum() 
	{
		// Arrange
		DuckWeighIn1 testMe = new DuckWeighIn1();
		float[] values = new float[] { 1.5f, 5f };
		float expectedTotal = 6.5f;
		
		// Act
		float actualTotal = testMe.Sum(values);
		
		// Assert
		Assertions.assertEquals(expectedTotal, actualTotal);
	}
	
}

