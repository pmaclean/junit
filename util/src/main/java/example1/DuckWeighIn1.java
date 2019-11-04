package example1;

// Calculate total duck weight for weigh-in.  
public class DuckWeighIn1 {

	// Find the total weights of ducks on team
	public float Sum(float[] duckWeights)
	{
		float totalWeight = 0f;
		for (int i=0; i<duckWeights.length; i++)
		{
			totalWeight += duckWeights[i];
		}
		return totalWeight;
	}
}
