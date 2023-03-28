package project_green;

public class Traits {
    private boolean mood;
    private boolean mustache;
    private boolean booty;
    private boolean bankroll;
    
    public  Traits (boolean mood, boolean mustache, boolean booty, boolean bankroll){
        
        this.mood = mood;
        this.mustache =  mustache;
        this.booty = booty;
        this.bankroll = bankroll;
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
