/**
 * 
 */
package application;

/**
 * @author nicholaszeig
 *
 */
public class Person {
    
    private String name;
    private String email;
    private Traits yourTraits;//maybe this is just the array of traits//maybe this is just Traits
    /**
     * @param name
     * @param email
     */
    public Person(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTraits(Traits traits){
        
        this.yourTraits = traits;
        
    }
    
    public Traits getTraits() {
        return this.yourTraits;
    }
    
    public PersonalityType getPersonalityType() {
        return this.yourTraits.getPersonalityType();
    }
  

    @Override
    public String toString() {
        return "" + getName() + " " + getPersonalityType().getName();
    }
    
    
    
    
    

}
