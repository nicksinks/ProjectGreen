public abstract class Personality implements Comparable<Person> {
	
	private String name;
	private boolean[] personalityProfile;
	private int personalityScore;
	

	public void person() {
		this.name = "person";
		this.personalityProfile = new boolean[4];
		this.personalityScore = 0;
	}
	
	public void person(String name, boolean[] personalityProfile) {
		this.name = name;
		this.personalityProfile = personalityProfile;
		this.personalityScore = 0;
	}
	
	public void person(String name, boolean[] personalityProfile, int personalityScore) {
		this.name = name;
		this.personalityProfile = personalityProfile;
		this.personalityScore = personalityScore;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean[] getPersonalityProfile() {
		return personalityProfile;
	}
	
	public void setPersonalityProfile(boolean[] personalityProfile) {
		this.personalityProfile = personalityProfile;
	}
	
	public int getPersonalityScore() {
		return personalityScore;
	}
	
	public void setPersonalityScore(int personalityScore) {
		this.personalityScore = personalityScore;
		
	}
}