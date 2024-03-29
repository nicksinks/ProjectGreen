package application;

/*@Author Project Green, Kristy Miller, 4/8/23
 * collab: Nicholas Zeig, Zachariah Sykes, Stephen Torrijas
 * 
 * 
*/

// 

public class Traits {
    private boolean mood;
    private boolean mustache;
    private boolean booty;
    private boolean bankroll;
    private PersonalityType personalityType;

    // Constructor sets boolean for each personality trait and object personality type.
    
    
    public  Traits (boolean mood, boolean mustache, boolean booty, boolean bankroll, PersonalityType personalityType){

        this.mood = mood;
        this.mustache =  mustache;
        this.booty = booty;
        this.bankroll = bankroll;
        this.personalityType = personalityType;
    }

    // Getters and Setters
    
    public boolean isMood() {
        return this.mood;
    }
    public void setMood(boolean mood) {
        this.mood = mood;
    }
    public boolean isMustache() {
        return this.mustache;
    }
    public void setMustache(boolean mustache) {
        this.mustache = mustache;
    }
    public boolean isBooty() {
        return this.booty;
    }
    public void setBooty(boolean booty) {
        this.booty = booty;
    }
    public boolean isBankroll() {
        return this.bankroll;
    }
    public void setBankroll(boolean bankroll) {
        this.bankroll = bankroll;
    }

    // Returns personality type 
    
    
    public PersonalityType getPersonalityType() {
        return this.personalityType;
    }
   
    
    
    @Override
    public String toString() {
        
        String mood,mustache, booty, bankroll;
        if (isBooty()) {
            booty = "more booty";
        } else {
            booty = "less booty";
        }
        if (isBankroll()) {
            bankroll = "more bankroll";
        } else {
            bankroll = "less bankroll";
        }
        if (isMustache()) {
            mustache = "more mustache";
        } else {
            mustache = "less mustache";
        }
        if (isMood()) {
            mood = "more moody";
        } else {
            mood = "less moody";
        }
        
        PersonalityType personalityDescription = getPersonalityType();
        String traitsDescription;
        traitsDescription = "You are " + mood + ", " + mustache + ", " + booty + ", " + bankroll + ".  That makes you a " + personalityDescription;
        return traitsDescription;
    }

}
