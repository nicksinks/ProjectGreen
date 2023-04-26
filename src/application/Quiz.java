package application;

import java.util.Random;

public class Quiz {
    
    
    private int moodCounter, mustacheCounter, bootyCounter, bankrollCounter;
    private String[] questions = new String[12]; 
    private static Random rand = new Random();



    public Quiz() {
        
        this.moodCounter = 0;
        this.mustacheCounter = 0;
        this.bootyCounter = 0;
        this.bankrollCounter = 0;
        this.questions = createQuestions();
       
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
    
    /**
     * 
     * @return createQuestions() returns an array of 12 questions from 4 arrays of 6 questions 
     * by selecting 3 of each smaller array
     */
    public String[] createQuestions() {
        String[] quizCreator = new String[12];
        int moodRand = -1;
        int bootyRand = -1;
        int mustacheRand = -1;
        int bankrollRand = -1;
        
        while (moodRand == -1) {
            int mood1, mood2, mood3;
            moodRand = rand.nextInt(5);
            mood1 = moodRand;
            quizCreator[3] = moodQuestions(mood1);
            while (mood1 == moodRand) {
                moodRand = rand.nextInt(5);
                if (mood1 == moodRand) {
                    
                } else {
                    mood2 = moodRand;
                    quizCreator[4] = moodQuestions(mood2);
                    while (mood2 == moodRand || mood1 == moodRand) {
                        moodRand = rand.nextInt(5);
                        if (mood2 == moodRand || mood1 == moodRand) {
                            
                        } else {
                            mood3 = moodRand;
                            quizCreator[5] = moodQuestions(mood3);
                            mood1 = -1;
                            mood2 = -1;
                            mood3 = -1;
                        
                        }//end if else to set mood 3
                    }//end while loop to set mood 3 
                }// end if else to set mood2     
            }//end while loop to set mood 2    
        }//end while loop to set mood 1
            
        
        
        while (mustacheRand == -1) {
            int mustache1, mustache2, mustache3;
            mustacheRand = rand.nextInt(5);
            mustache1 = mustacheRand;
            quizCreator[0] = mustacheQuestions(mustache1);
            while (mustache1 == mustacheRand) {
                mustacheRand = rand.nextInt(5);
                if (mustache1 == mustacheRand) {
                    
                } else {
                    mustache2 = mustacheRand;
                    quizCreator[1] = mustacheQuestions(mustache2);
                    while (mustache2 == mustacheRand || mustache1 == mustacheRand) {
                        mustacheRand = rand.nextInt(5);
                        if (mustache2 == mustacheRand || mustache1 == mustacheRand) {
                            
                        } else {
                            mustache3 = mustacheRand;
                            quizCreator[2] = mustacheQuestions(mustache3);
                            mustache1 = -1;
                            mustache2 = -1;
                            mustache3 = -1;
                        
                        }//end if else to set mustache 3
                    }//end while loop to set mustache 3 
                }// end if else to set mustache2     
            }//end while loop to set mustache 2    
        }//end while loop to set mustache 1
        
        
        while (bootyRand == -1) {
            int booty1, booty2, booty3;
            bootyRand = rand.nextInt(5);
            booty1 = bootyRand;
            quizCreator[6] = bootyQuestions(booty1);
            while (booty1 == bootyRand) {
                bootyRand = rand.nextInt(5);
                if (booty1 == bootyRand) {
                    
                } else {
                    booty2 = bootyRand;
                    quizCreator[7] = bootyQuestions(booty2);
                    while (booty2 == bootyRand || booty1 == bootyRand) {
                        bootyRand = rand.nextInt(5);
                        if (booty2 == bootyRand || booty1 == bootyRand) {
                            
                        } else {
                            booty3 = bootyRand;
                            quizCreator[8] = bootyQuestions(booty3);
                            booty1 = -1;
                            booty2 = -1;
                            booty3 = -1;
                        
                        }//end if else to set booty 3
                    }//end while loop to set booty 3 
                }// end if else to set booty2     
            }//end while loop to set booty 2    
        }//end while loop to set booty 1
        
        
        
        while (bankrollRand == -1) {
            int bankroll1, bankroll2, bankroll3;
            bankrollRand = rand.nextInt(5);
            bankroll1 = bankrollRand;
            quizCreator[9] = bankrollQuestions(bankroll1);
            while (bankroll1 == bankrollRand) {
                bankrollRand = rand.nextInt(5);
                if (bankroll1 == bankrollRand) {
                    
                } else {
                    bankroll2 = bankrollRand;
                    quizCreator[10] = bankrollQuestions(bankroll2);
                    while (bankroll2 == bankrollRand || bankroll1 == bankrollRand) {
                        bankrollRand = rand.nextInt(5);
                        if (bankroll2 == bankrollRand || bankroll1 == bankrollRand) {
                            
                        } else {
                            bankroll3 = bankrollRand;
                            quizCreator[11] = bankrollQuestions(bankroll3);
                            bankroll1 = -1;
                            bankroll2 = -1;
                            bankroll3 = -1;
                        
                        }//end if else to set bankroll 3
                    }//end while loop to set bankroll 3 
                }// end if else to set bankroll2     
            }//end while loop to set bankroll 2    
        }//end while loop to set bankroll 1
        
        
        return quizCreator;
    }
    
    public String moodQuestions(int x) {
        String[] moodQuestion = new String[6];
        moodQuestion[0] = "Are you salty?";
        moodQuestion[1] = "Do you ever feel like you have to smack a hoe?";
        moodQuestion[2] = "Should we talk to you before you've had your coffee?";
        moodQuestion[3] = "Do you have that special kind of sass?";
        moodQuestion[4] = "Have you ever been described as emotional?";
        moodQuestion[5] = "Do you prefer chips over sweets?";
        return moodQuestion[x];
        
    }
    
    public String mustacheQuestions (int x) {
        
        String[] mustacheQuestion = new String[6];
        mustacheQuestion[0] = "Are you salty?";
        mustacheQuestion[1] = "Do you ever feel like you have to smack a hoe?";
        mustacheQuestion[2] = "Should we talk to you before you've had your coffee?";
        mustacheQuestion[3] = "Do you have that special kind of sass?";
        mustacheQuestion[4] = "Have you ever been described as emotional?";
        mustacheQuestion[5] = "Do you prefer chips over sweets?";
        return mustacheQuestion[x];
        
    }
    
    public String bootyQuestions(int x) {
        
        String[] bootyQuestion = new String[6];
        bootyQuestion[0] = "Are you salty?";
        bootyQuestion[1] = "Do you ever feel like you have to smack a hoe?";
        bootyQuestion[2] = "Should we talk to you before you've had your coffee?";
        bootyQuestion[3] = "Do you have that special kind of sass?";
        bootyQuestion[4] = "Have you ever been described as emotional?";
        bootyQuestion[5] = "Do you prefer chips over sweets?";
        return bootyQuestion[x];
        
    }
    
    public String bankrollQuestions(int x) {
        
        String[] bankrollQuestion = new String[6];
        bankrollQuestion[0] = "Are you salty?";
        bankrollQuestion[1] = "Do you ever feel like you have to smack a hoe?";
        bankrollQuestion[2] = "Should we talk to you before you've had your coffee?";
        bankrollQuestion[3] = "Do you have that special kind of sass?";
        bankrollQuestion[4] = "Have you ever been described as emotional?";
        bankrollQuestion[5] = "Do you prefer chips over sweets?";
        return bankrollQuestion[x];
        
    }
    
    public String getQuestion(int questionNumber) {
        return this.questions[questionNumber];
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



