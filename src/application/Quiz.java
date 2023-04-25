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
 
        this.moodCounter++;
        
    }



    public int getMustacheCounter() {
        return mustacheCounter;
    }



    public void setMustacheCounter() {
        this.mustacheCounter++;
    }



    public int getBootyCounter() {
        return bootyCounter;
    }



    public void setBootyCounter() {
        this.bootyCounter++;
    }



    public int getBankrollCounter() {
        return bankrollCounter;
    }



    public void setBankrollCounter() {
        this.bankrollCounter++;
    }



 

    
    public int[] getAnswers() {
        
        
        int [] answerCounter = new int[] {moodCounter,mustacheCounter,bootyCounter,bankrollCounter};
        
        return answerCounter;

   

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



