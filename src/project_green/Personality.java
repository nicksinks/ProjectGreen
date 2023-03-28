
public abstract Personality implements Comparable<Person> {
	

	public person() {
		
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public boolean[] getPersonalityProfile() 
	{
		return personalityProfile;
	}
	
	public void setPersonalityProfile(boolean[] personalityProfile) 
	{
		this.personalityProfile = personalityProfile;
	}
	
	public int getPersonalityScore() 
	{
		return personalityScore;
	}
	
	public void setPersonalityScore(int personalityScore) 
	{
		this.personalityScore = personalityScore;
		
	}
}