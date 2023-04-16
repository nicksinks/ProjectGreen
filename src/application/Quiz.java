package application;


public class Quiz {
    
    int moodCounter, mustacheCounter, bootyCounter, bankrollCounter;


    public Quiz() {
        // TODO Auto-generated constructor stub
    }
    

    
    public void addPerson() {
        try {
            
            //open a file here containing our stored Persons. skip step 1 for now
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
    
    

        

        
}



