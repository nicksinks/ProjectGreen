package application;

//@Author Project Green, Kristy Miller, 4/8/23

public class Traits {
  private boolean mood;
  private boolean mustache;
  private boolean booty;
  private boolean bankroll;
  private PersonalityType personalityType;
  
  public  Traits (boolean mood, boolean mustache, boolean booty, boolean bankroll, PersonalityType personalityType){
      
      this.mood = mood;
      this.mustache =  mustache;
      this.booty = booty;
      this.bankroll = bankroll;
      this.personalityType = personalityType;
  }
  
  public boolean isMood() {
      return mood;
  }
  public void setMood(boolean mood) {
      this.mood = mood;
  }
  public boolean isMustache() {
      return mustache;
  }
  public void setMustache(boolean mustache) {
      this.mustache = mustache;
  }
  public boolean isBooty() {
      return booty;
  }
  public void setBooty(boolean booty) {
      this.booty = booty;
  }
  public boolean isBankroll() {
      return bankroll;
  }
  public void setBankroll(boolean bankroll) {
      this.bankroll = bankroll;
  }
  
  
}