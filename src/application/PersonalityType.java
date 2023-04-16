package application;

public class PersonalityType{ //this is BeymonsterType, //WarioType //TomSelleckType //etc. 
    
    private  Traits traits; 
    private  String name;
    
    
    public PersonalityType(Traits traits, String name) {
        super();
        this.traits = traits;
        this.name = name;
        
    }
    
    public void hello() {
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return getName();
    }

    public Traits getTraits() {
        return traits;
    }

    

}
