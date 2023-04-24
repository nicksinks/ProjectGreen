package application;

import java.util.Scanner;


public class Quiz {
    
    
    public int moodCounter, mustacheCounter, bootyCounter, bankrollCounter;
    static Scanner scan = new Scanner(System.in);


    public Quiz() {
        
        this.moodCounter = 0;
        this.mustacheCounter = 0;
        this.bootyCounter = 0;
        this.bankrollCounter = 0;
       
    }
    

    
    public int getMoodCounter() {
        return moodCounter;
        
    }



    public void setMoodCounter() {
        System.out.println("test" + this.moodCounter);
        
        this.moodCounter++;
        
        System.out.println("test after" + this.moodCounter);
    }



    public int getMustacheCounter() {
        return mustacheCounter;
    }



    public void setMustacheCounter(int mustacheCounter) {
        this.mustacheCounter = mustacheCounter;
    }



    public int getBootyCounter() {
        return bootyCounter;
    }



    public void setBootyCounter(int bootyCounter) {
        this.bootyCounter = bootyCounter;
    }



    public int getBankrollCounter() {
        return bankrollCounter;
    }



    public void setBankrollCounter(int bankrollCounter) {
        this.bankrollCounter = bankrollCounter;
    }



//    public void addPerson() {
//        try {
//            
//            //open a file here containing our stored Persons. skip step 1 for now
//            //Create an ArrayList of Persons
//            
//            
//            //Add new person to ArrayList of Persons
//            //Person.add(new Person(their name input, their email input)
//            String name = "some name from asking";
//            String email = "some email from asking";
//            Person person = new Person(name, email);//text from gui, text from gui
//            
//            
//            //ArrayList personList = new ArrayList()
//            //PersonList for loop to pull from file, maybe
//            //personList.add(person);
//              
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    

    
    public void getAnswers() {
        
        
        
 
        
        // Display a question and two answer buttons and a next button(12 times)
        
        //listener handler for one button does moodCounter++&next and the other button just does next.  
        
        // ask 3 questions for each trait.  One answer ups the counter.   One answer does nothing.  
        
       
        
        
        int [] answerCounter = new int[] {moodCounter,mustacheCounter,bootyCounter,bankrollCounter};
        //setTraitsFromQuizAnswers(answerCounter);
   

    }
    
    
    
//    public Traits setTraitsFromQuizAnswers(int[] x) {
//        //if answers are 2 or 3 of 3, set Traits value to true
//        //if answers are 0 or 1 of 3, set Traits value to false  
//        boolean mood, mustache, booty, bankroll;
//        
//        if (x[0] < 2) {
//            mood = false;
//        } else {
//            mood = true;
//        }
//        
//        if (x[1] < 2) {
//            mustache = false;
//        } else {
//            mustache = true;
//        }
//        if (x[2] < 2) {
//            booty = false;
//        } else {
//            booty = true;
//        }
//        if (x[3] < 2) {
//            bankroll = false;
//        } else {
//            bankroll = true;
//        }
//        
//        
//        
////        Traits yourTraits = new Traits(mood, mustache, booty, bankroll);
////        person.setTraits(yourTraits);
////       return yourTraits; 
//
//        
//        
//        
//    }
    
    

        

        
}



