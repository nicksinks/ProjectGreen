package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Quiz {
    
    
    private int moodCounter, mustacheCounter, bootyCounter, bankrollCounter;
    private String[] questions = new String[12]; 
    private static Random rand = new Random();
    protected Traits[] personalities; 



    public Quiz() {
        
        this.moodCounter = 0;
        this.mustacheCounter = 0;
        this.bootyCounter = 0;
        this.bankrollCounter = 0;
        this.questions = createQuestions();
        this.personalities = importPersonalities();
        //this.personalities set from file?  create a method.
       
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
    private String[] createQuestions() {
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
    
    private String moodQuestions(int x) {
        String[] moodQuestion = new String[6];
        moodQuestion[0] = "Are you salty?";
        moodQuestion[1] = "Do you ever feel like you have to smack a hoe?";
        moodQuestion[2] = "Should we talk to you before you've had your coffee?";
        moodQuestion[3] = "Do you have that special kind of sass?";
        moodQuestion[4] = "Have you ever been described as emotional?";
        moodQuestion[5] = "Do you prefer chips over sweets?";
        return moodQuestion[x];
        
    }
    
    private String mustacheQuestions (int x) {
        
        String[] mustacheQuestion = new String[6];
        mustacheQuestion[0] = "Does anyone ever tell you that you need to shave?";
        mustacheQuestion[1] = "Does your five o'clock shadow happen at eleven a.m.?";
        mustacheQuestion[2] = "Are your handlebars fit for Sam Elliot?";
        mustacheQuestion[3] = "Has your significant other ever referred to you as a \"Marlboro Man\"?";
        mustacheQuestion[4] = "Do you avoid taking a razor to your upper lip?";
        mustacheQuestion[5] = "Have you ever been mistaken for Wilford Brimley?";
        return mustacheQuestion[x];
        
    }
    
    private String bootyQuestions(int x) {
        
        String[] bootyQuestion = new String[6];
        bootyQuestion[0] = "You got junk in your trunk?";
        bootyQuestion[1] = "Have you successfully completed \"Megan Thighs\"?";
        bootyQuestion[2] = "Has anyone mistaken you for a Kardashian?";
        bootyQuestion[3] = "Do you have that special kind of ass?";
        bootyQuestion[4] = "Have you ever been described as thick?";
        bootyQuestion[5] = "Is your booty poppin'?";
        return bootyQuestion[x];
        
    }
    
    private String bankrollQuestions(int x) {
        
        String[] bankrollQuestion = new String[6];
        bankrollQuestion[0] = "Are you rollin with a fat wallet?";
        bankrollQuestion[1] = "Does your bank account have multiple zeroes?";
        bankrollQuestion[2] = "Do you have mo problems?";
        bankrollQuestion[3] = "Is there any jet fuel on your energy bill?";
        bankrollQuestion[4] = "Have you ever thought \"I should buy a boat?\"";
        bankrollQuestion[5] = "Are you making it rain right now?";
        return bankrollQuestion[x];
        
    }
    
    /**
     * This method returns one question from the questions[] array, by calling the number.
     * @param questionNumber
     * @return
     */
    public String getQuestion(int questionNumber) {
        return this.questions[questionNumber];
    }
    
    /**
     * 
     * @param x
     * @return   
     * 
     * This method returns the object trait which were set by the quiz answers
     * The calling method in the controller will set the Traits to the Person's Trait parameter
     */
    public Traits setTraitsFromQuizAnswers(int[] x) {
        //if answers are 2 or 3 of 3, set Traits value to true
        //if answers are 0 or 1 of 3, set Traits value to false  
        boolean mood, mustache, booty, bankroll;
      

        if (x[0] < 2) {
            mood = false;
        } else {
            mood = true;
        }

        if (x[1] < 2) {
            mustache = false;
        } else {
            mustache = true;
        }
        if (x[2] < 2) {
            booty = false;
        } else {
            booty = true;
        }
        if (x[3] < 2) {
            bankroll = false;
        } else {
            bankroll = true;
        }
        
        Traits yourTraits = null;
        
        for (int i = 0; i<personalities.length; i++) {
                
                if (personalities[i].isMood() == mood && personalities[i].isBooty() == booty 
                        && personalities[i].isBankroll() == bankroll && personalities[i].isMustache() == mustache) {
                    yourTraits = personalities[i];
                    
                }
                
        }

        
        return yourTraits; 
        
    }

    /**
     * This method returns an array of the counts of each question type.  This array is used to check for and set the parameters.
     * @return
     */
    public int[] getAnswers() {
        
        int [] answerCounter = new int[] {moodCounter,mustacheCounter,bootyCounter,bankrollCounter};
        
        return answerCounter;
        
    }
    
    /**
     * This method returns an array of type Traits to fill the instance variable array of Traits in class Quiz
     * If we have/had enough time, this is meant to pull from a file.  
     * @return
     */
    
    private Traits[] importPersonalities(){
        
        Traits tttt = new Traits(true, true, true, true, new PersonalityType("Beyowolf","You're a bad mother shut your mouth. You are more moody and have more booty, mustache, and bankroll than anybody."));
        Traits tttf = new Traits(true, true, true, false, new PersonalityType( "Wario","Look at that wirey lip ferret. I bet it makes you pretty mad.  At least you got some booty, though."));
        Traits ttft = new Traits(true, true, false, true, new PersonalityType( "Prince","We'll tell you about your personality once you purify yourself in the waters of Lake Minnetonka."));
        Traits ttff = new Traits(true, true, false, false, new PersonalityType( "Ron Swanson","The way you see it, government is about doing as little as possible.  And letting that mustache grow counts for doing as little as possible."));
        Traits tftt = new Traits(true, false, true, true, new PersonalityType( "Ri Ri","You are the finest kind.  All that booty, moody bankroll... and no mustache."));
        Traits tftf = new Traits(true, false, true, false, new PersonalityType("Jessica Rabbit","Are you in need of a detective?  You probably won't have anything to pay with."));
        Traits tfft = new Traits(true, false, false, true, new PersonalityType( "Mister Burns","If you spent a little more time growing your mustache and doing squats, maybe the folks at the power plant wouldn't go on strike so often."));
        Traits tfff = new Traits(true, false, false, false, new PersonalityType( "Lindsay Lohan","Nothing but moody here.  Can't find a booty, a mustache, or a bankroll anywhere."));
        Traits fttt = new Traits(false, true, true, true,  new PersonalityType("Tom Selleck","Sure you're kind.  Sure you've got a mustache.  Sure you've got money.  Sure you've got a body.  It's the, uhhh, total package."));
        Traits fttf = new Traits(false, true, true, false, new PersonalityType("Corgi","Rump Rump Rump Rump"));
        Traits ftft = new Traits(false, true, false, true, new PersonalityType("George Clooney","Oh look, it's Mr. Alamuddin himself.  Go help your wife."));
        Traits ftff = new Traits(false, true, false, false, new PersonalityType("Jesus Christ, Lamb of God","Do you find yourself turning the other cheek.  Well, we have news for you."));
        Traits fftt = new Traits(false, false, true, true, new PersonalityType("Sofia Vergara","An angel, you've got nothing but booty and bankroll.  And a little accent."));
        Traits fftf = new Traits(false, false, true, false, new PersonalityType("Patrick Star","You've got nothing but rumpus, and it's okay."));
        Traits ffft = new Traits(false, false, false, true, new PersonalityType( "Forrest Gump","Mama always said life was like a box of chocolates.  You meet a lot of celebrities and get rich accidentally."));
        Traits ffff = new Traits(false, false, false, false, new PersonalityType("Lima Bean","You are a Lima bean.  You are devoid of personality.  You are missing all aspects of booty, moody, bankroll, and mustache."));
        Traits[] traitsAndPersonalitiesArray = {tttt,tttf,ttft,ttff,tftt,tftf,tfft,tfff,fttt,fttf,ftft,ftff,fftt,fftf,ffft,ffff};
        return traitsAndPersonalitiesArray;
      
        
        
        /* Code commented out for now - Stephen
         * 
         *     private Traits[] importPersonalities1() {
        List<Traits> traitsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("personalities.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                boolean mood = parts[0].charAt(0) == 't';
                boolean mustache = parts[0].charAt(1) == 't';
                boolean booty = parts[0].charAt(2) == 't';
                boolean bankroll = parts[0].charAt(3) == 't';
                PersonalityType personality = new PersonalityType(parts[1], parts[2]);
                Traits traits = new Traits(mood, mustache, booty, bankroll, personality);
                traitsList.add(traits);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return traitsList.toArray(new Traits[0]);
    }
}
           */
     
      
    }
    
    
}
    
    
    




