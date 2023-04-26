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

    public PersonalityType getPersonalityType() {
        return personalityType;
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
        String traitsDescription;
        traitsDescription = "You are " + mood + ", " + mustache + ", " + booty + ", " + bankroll;
        return traitsDescription;
    }

}
