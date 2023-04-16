//package application;
//
//import java.util.ArrayList;
//
//public class TestClassforDummies {
//    
//    ArrayList<PersonalityType> personalities = new ArrayList<PersonalityType>();
//    PersonalityType[] personalitiesArray = new PersonalityType[16];
//    
//    public void createPersonalities() {
//        
//        try {
//            
//            personalitiesArray[0] = new PersonalityType(new Traits(true,true,true,true), "Beymonster");
//
//            personalities.add(new PersonalityType(new Traits(true,true,true,true), "Beymonster"));
//            personalities.add(new PersonalityType(new Traits(true,true,true,false), "Wario"));
//            personalities.add(new PersonalityType(new Traits(true,true,false,true), "Prince"));
//            personalities.add(new PersonalityType(new Traits(true,true,false,false), "Ron Swanson"));
//            personalities.add(new PersonalityType(new Traits(true,false,true,true), "Ri Ri"));
//            personalities.add(new PersonalityType(new Traits(true,false,true,false), "Jessica Rabbit"));
//            personalities.add(new PersonalityType(new Traits(true,false,false,true), "Mister Burns"));
//            personalities.add(new PersonalityType(new Traits(true,false,false,false), "Lindsay Lohan"));
//            personalities.add(new PersonalityType(new Traits(false,true,true,true), "Tom Selleck"));
//            personalities.add(new PersonalityType(new Traits(false,true,true,false), "Corgi"));
//            personalities.add(new PersonalityType(new Traits(false,true,false,true), "George Clooney"));
//            personalities.add(new PersonalityType(new Traits(false,true,false,false), "Jesus Christ, Lamb of God"));
//            personalities.add(new PersonalityType(new Traits(false,false,true,true), "Sofia Vergara"));
//            personalities.add(new PersonalityType(new Traits(false,false,true,false), "Patrick Star"));
//            personalities.add(new PersonalityType(new Traits(false,false,false,true), "Forrest Gump"));
//            personalities.add(new PersonalityType(new Traits(false,false,false,false), "Lima Bean"));
//            
//            
//            
//            System.out.println(personalities);
//            System.out.println(personalities.toString());
//            System.out.println(personalitiesArray[0].getTraits());
//            
//            
//            //open a file here containing our personality types and generate an Array of Personalities
//            //can also hard code Personalities
//            
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        
//        PersonalityType fuckYou = new PersonalityType (new Traits (false,false,false,false), "Dana");
//        System.out.println(fuckYou);
//        
//        Quiz quiz = new Quiz();
//        quiz.newQuiz();
//        
//        System.out.println(quiz.personalities);
//        System.out.println(quiz.personalitiesArray[0]);
//        System.out.println(quiz.personalities.toString());
//        ArrayList<PersonalityType> localArray = quiz.personalities;
//        System.out.println(localArray);
//        
//        
//
//    }
//
//}
