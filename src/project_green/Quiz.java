/*@Author: Stephen Torrijas
 * The Quiz class implements the questions to ask the user to help determine their personality. 
 * 
 */
package quiz;

import java.util.ArrayList;

public class Quiz {
    
    int moodCounter, mustacheCounter, bootyCounter, bankrollCounter;
    
    ArrayList<PersonalityType> personalities = new ArrayList<PersonalityType>();

    public Quiz() {
        // TODO Auto-generated constructor stub
    }
    
    public void createPersonalities() {
        
        try {

            personalities.add(new PersonalityType(new Traits(true,true,true,true), "Beymonster"));
            personalities.add(new PersonalityType(new Traits(true,true,true,false), "Wario"));
            personalities.add(new PersonalityType(new Traits(true,true,false,true), "Prince"));
            personalities.add(new PersonalityType(new Traits(true,true,false,false), "Ron Swanson"));
            personalities.add(new PersonalityType(new Traits(true,false,true,true), "Ri Ri"));
            personalities.add(new PersonalityType(new Traits(true,false,true,false), "Jessica Rabbit"));
            personalities.add(new PersonalityType(new Traits(true,false,false,true), "Mister Burns"));
            personalities.add(new PersonalityType(new Traits(true,false,false,false), "Lindsay Lohan"));
            personalities.add(new PersonalityType(new Traits(false,true,true,true), "Tom Selleck"));
            personalities.add(new PersonalityType(new Traits(false,true,true,false), "Corgi"));
            personalities.add(new PersonalityType(new Traits(false,true,false,true), "George Clooney"));
            personalities.add(new PersonalityType(new Traits(false,true,false,false), "Jesus Christ, Lamb of God"));
            personalities.add(new PersonalityType(new Traits(false,false,true,true), "Sofia Vergara"));
            personalities.add(new PersonalityType(new Traits(false,false,true,false), "Patrick Star"));
            personalities.add(new PersonalityType(new Traits(false,false,false,true), "Forrest Gump"));
            personalities.add(new PersonalityType(new Traits(false,false,false,false), "Lima Bean"));
            
            //open a file here containing our personality types and generate an Array of Personalities
            //can also hard code Personalities
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void addPerson() {
        try {
            
            //open a file here containing our stored Persons.  We can do this last.  skip step 1 for now
            //Create an ArrayList of Persons
            
            
            //Add new person to ArrayList of Persons
            //Person.add(new Person(their name input, their email input)
            String name = "some name from asking";
            String email = "some email from asking";
            Person person = new Person(name, email);
            
            //ArrayList personList = new ArrayList()
            //PersonList for loop to pull from file, maybe
            //personList.add(person);
            
            
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    
    public void getAnswers() {
        
 
        
        // Display a question and two answer buttons and a next button(12 times)
        
        //listener handler for one button does moodCounter++&next and the other button just does next.  
        
        // ask 3 questions for each trait.  One answer ups the counter.   One answer does nothing.  
        
       
        
        
        int [] answerCounter = new int[] {moodCounter,mustacheCounter,bootyCounter,bankrollCounter};
        setTraitsFromQuizAnswers(answerCounter);
   

    }
    
    
    
    public void setTraitsFromQuizAnswers(int[] x) {
        //if answers are 2 or 3 of 3, set Traits value to true
        //if answers are 0 or 1 of 3, set Traits value to false  
        
        
    }
    
    

        
    public void newQuiz() {//this is maybe the run environment
            
            Quiz quiz = new Quiz();
            quiz.createPersonalities();

            quiz.getAnswers();
            
            
            
            //person.display()  however we display the personality.
              
    }
        
}
