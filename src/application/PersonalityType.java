package application;
/*
 * author: Zachariah Sykes
 * collab: Nicholas Zeig, Kristy Miller, Stephen Torrijas
 * 
 */
public class PersonalityType{ //this is BeymonsterType, //WarioType //TomSelleckType //etc. 
    

    private String name;
    private String description;
    
    
    public PersonalityType(String name, String description) {
        super();
        this.name = name;
        this.description = description;
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String toString() {
        String description = this.description;
        return description;
        
    }

}
