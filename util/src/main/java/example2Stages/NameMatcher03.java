package example2Stages;

public class NameMatcher03 {

	boolean Matches(String name1, String name2)
	{
		return name1.strip().equalsIgnoreCase(name2.strip());
	}
}
