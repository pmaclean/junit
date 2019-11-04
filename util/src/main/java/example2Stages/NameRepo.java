package example2Stages;

// Convert known nicknames to formal names 
public interface NameRepo {
	
	// given a duck name returns a formal name
	//
	// returns input if no conversion is available
	String duckNameToFormalName(String duckName);
}
