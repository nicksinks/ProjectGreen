package application;

public class PersonalityType{ //this is BeymonsterType, //WarioType //TomSelleckType //etc. 
    

    private  String name;
    
    
    public PersonalityType(String name) {
        super();

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

}
