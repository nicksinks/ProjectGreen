/**
 * 
 */
package application;

/**
 * @author nicholaszeig
 *
 */
public class Person {
    
    String name;
    String email;
    Traits traits;//maybe this is just the array of traits//maybe this is just Traits
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
        
        this.traits = traits;
       
    }
    
    public int compareTo(Person x) {
        return 1;
    }
    
    @Override
    public String toString() {
        return "" + getName() + "" ;
    }
    
    
    
    
    

}
