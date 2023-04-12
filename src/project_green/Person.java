package project_green;

/**
 * 
 * @author nicholaszeig
 * @project Project_Green
 * @lastRevised 04/08/2023
 *
 */

public class Person {
    
        String name;
        String email;
        Personality yourPersonality;
    
    
    public Person(String name, String email, Personality yourPersonality) {
        this.name = name;
        this.email = email;
        this.yourPersonality = null;
        
    }
    
    getName(){
        
    }
    
    setName(String name){
        
    }
    
    getEmail(){
        
    }
    
    setEmail(String email){
        
    }
    
    getYourPersonality(){
        
    }
    
    setYourPersonality(PersonalityType x){
        this.yourPersonality = x;
       
    }
    
    comparePersonalities(Person x){
        
        return x;
        
    }
    
}


