package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class justaGUIController {
    
    Quiz quiz = new Quiz();
    Person person;
    private Parent root;
    private Stage stage;
    private Scene scene;
    

    @FXML
    private Button bankrollNo11;

    @FXML
    private Button bankrollNo12;

    @FXML
    private Button bankrollYes11;

    @FXML
    private Button bankrollYes12;

    @FXML
    private Button bankrollNo10;

    @FXML
    private Button bootyNo7;

    @FXML
    private Button bootyNo8;

    @FXML
    private Button bootyNo9;

    @FXML
    private Button bankrollYes10;

    @FXML
    private Button bootyYes7;

    @FXML
    private Button bootyYes8;

    @FXML
    private Button bootyYes9;

    @FXML
    private Label emailLbl;

    @FXML
    private Button moodNo4;

    @FXML
    private Button moodNo5;

    @FXML
    private Button moodNo6;

    @FXML
    private Button moodYes4;

    @FXML
    private Button moodYes5;

    @FXML
    private Button moodYes6;

    @FXML
    private Button mustacheNo1;

    @FXML
    private Button mustacheNo2;

    @FXML
    private Button mustacheNo3;

    @FXML
    private Button mustacheYes1;

    @FXML
    private Button mustacheYes2;

    @FXML
    private Button mustacheYes3;

    @FXML
    private Label nameLabel;

    @FXML
    private Button newQuizButton;

    @FXML
    private TextField personEmail;

    @FXML
    private TextField personName;

    @FXML
    private Label questionLabel;
    
    @FXML
    private Label question;
    
    @FXML
    private Label youAre;

    @FXML
    private ImageView beyowolf;

    @FXML
    private ImageView burns;

    @FXML
    private ImageView corgi;

    @FXML
    private ImageView georgeClooney;

    @FXML
    private ImageView lindsayLohan;

    @FXML
    private ImageView patrick;

    @FXML
    private ImageView prince;

    @FXML
    private ImageView rihanna;

    @FXML
    private ImageView ronSwanson;

    @FXML
    private ImageView tomSelleck;

    @FXML
    private ImageView wario;

    @FXML
    void exit(ActionEvent event) {
        Platform.exit();
    }


    void wipeScreen() {
        personEmail.setVisible(false);
        personName.setVisible(false);
        emailLbl.setVisible(false);
        nameLabel.setVisible(false);
        newQuizButton.setVisible(false);
        mustacheYes1.setVisible(false);
        mustacheNo1.setVisible(false);
        mustacheYes2.setVisible(false);
        mustacheNo2.setVisible(false);
        mustacheYes3.setVisible(false);
        mustacheNo3.setVisible(false);
        moodYes4.setVisible(false);
        moodNo4.setVisible(false);
        moodYes5.setVisible(false);
        moodNo5.setVisible(false);
        moodYes6.setVisible(false);
        moodNo6.setVisible(false);
        bootyYes7.setVisible(false);
        bootyNo7.setVisible(false);
        bootyYes8.setVisible(false);
        bootyNo8.setVisible(false);
        bootyYes9.setVisible(false);
        bootyNo9.setVisible(false);
        bankrollYes10.setVisible(false);
        bankrollNo10.setVisible(false);
        bankrollYes11.setVisible(false);
        bankrollNo11.setVisible(false);
        bankrollYes12.setVisible(false);
        bankrollNo12.setVisible(false);  
        questionLabel.setVisible(false);
        question.setVisible(false);
        beyowolf.setVisible(false);
        burns.setVisible(false);
        corgi.setVisible(false);
        georgeClooney.setVisible(false);
        lindsayLohan.setVisible(false);
        patrick.setVisible(false);
        prince.setVisible(false);
        rihanna.setVisible(false);
        ronSwanson.setVisible(false);
        tomSelleck.setVisible(false);
        wario.setVisible(false);
        
    }
   
    
   // 


    @FXML
    void newQuiz(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("justaGUI.fxml"));



        wipeScreen();
        
        person = new Person(personName.getText(), personEmail.getText());
        
        switchToQuestion1(event);

        //run method displayQuestion1  it follows by running method displayQuestion2 

    }
    
    @FXML

    public void switchToQuestion1(ActionEvent event) throws IOException {    

        wipeScreen();
        questionLabel.setText("Question 1");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(0));
        question.setVisible(true);
        mustacheYes1.setVisible(true);
        mustacheNo1.setVisible(true);
        
        
    }

    
    
 
    @FXML
    public void yesSwitchToQuestion2(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 2");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(1));
        question.setVisible(true);
        mustacheYes2.setVisible(true);
        mustacheNo2.setVisible(true);
        quiz.setMustacheCounter();
        

    }
    
    @FXML
    public void noSwitchToQuestion2(ActionEvent event) throws IOException {
        wipeScreen();
        questionLabel.setText("Question 2");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(1));
        question.setVisible(true);
        mustacheYes2.setVisible(true);
        mustacheNo2.setVisible(true);
        

    }
    
    @FXML
    public void yesSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 3");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(2));
        question.setVisible(true);
        mustacheYes3.setVisible(true);
        mustacheNo3.setVisible(true);
        quiz.setMustacheCounter();
    }
    @FXML
    public void noSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 3");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(2));
        question.setVisible(true);
        mustacheYes3.setVisible(true);
        mustacheNo3.setVisible(true);

    }
    @FXML
    public void yesSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 4");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(3));
        question.setVisible(true);
        moodYes4.setVisible(true);
        moodNo4.setVisible(true);
        quiz.setMustacheCounter();
    }
    @FXML
    public void noSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 4");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(3));
        question.setVisible(true);
        moodYes4.setVisible(true);
        moodNo4.setVisible(true);

    }
    @FXML
    public void yesSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 5");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(4));
        question.setVisible(true);
        moodYes5.setVisible(true);
        moodNo5.setVisible(true);
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 5");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(4));
        question.setVisible(true);
        moodYes5.setVisible(true);
        moodNo5.setVisible(true);

    }
    @FXML
    public void yesSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 6");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(5));
        question.setVisible(true);
        moodYes6.setVisible(true);
        moodNo6.setVisible(true);
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 6");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(5));
        question.setVisible(true);
        moodYes6.setVisible(true);
        moodNo6.setVisible(true);

    }
    @FXML
    public void yesSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 7");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(6));
        question.setVisible(true);
        bootyYes7.setVisible(true);
        bootyNo7.setVisible(true);
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 7");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(6));
        question.setVisible(true);
        bootyYes7.setVisible(true);
        bootyNo7.setVisible(true);
        
    }
    @FXML
    public void yesSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 8");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(7));
        question.setVisible(true);
        bootyYes8.setVisible(true);
        bootyNo8.setVisible(true);
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 8");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(7));
        question.setVisible(true);
        bootyYes8.setVisible(true);
        bootyNo8.setVisible(true);
        
    }    
    @FXML
    public void yesSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 9");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(8));
        question.setVisible(true);
        bootyYes9.setVisible(true);
        bootyNo9.setVisible(true);
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 9");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(8));
        question.setVisible(true);
        bootyYes9.setVisible(true);
        bootyNo9.setVisible(true);

    }
    public void yesSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 10");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(9));
        question.setVisible(true);
        bankrollYes10.setVisible(true);
        bankrollNo10.setVisible(true);
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 10");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(9));
        question.setVisible(true);
        bankrollYes10.setVisible(true);
        bankrollNo10.setVisible(true);

    }
    @FXML
    public void yesSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 11");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(10));
        question.setVisible(true);
        bankrollYes11.setVisible(true);
        bankrollNo11.setVisible(true);
        quiz.setBankrollCounter();
    }
    @FXML
    public void noSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 11");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(10));
        question.setVisible(true);
        bankrollYes11.setVisible(true);
        bankrollNo11.setVisible(true);
    }
    @FXML
    public void yesSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 12");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(11));
        question.setVisible(true);
        bankrollYes12.setVisible(true);
        bankrollNo12.setVisible(true);
        quiz.setBankrollCounter();
    }
    @FXML
    public void noSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("Question 12");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(11));
        question.setVisible(true);
        bankrollYes12.setVisible(true);
        bankrollNo12.setVisible(true);
   
    }
    @FXML
    public void yesSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBankrollCounter();
        person.setTraits(quiz.setTraitsFromQuizAnswers(quiz.getAnswers()));
        //put a switch method here.
        if (person.getTraits() == quiz.tttt) {
            root = FXMLLoader.load(getClass().getResource("profilePage0Beyowolf.fxml"));
            Scene scene = new Scene(root,675,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            person.setTraits(quiz.setTraitsFromQuizAnswers(quiz.getAnswers()));

        } else {
            System.out.println("eat it.");
        }


        
        
        //quiz.setTraitstoPerson;
        //quiz.searchTraitsArrayforPersonalityType
        //Display said personality type.
    }
    @FXML
    public void noSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
        person.setTraits(quiz.setTraitsFromQuizAnswers(quiz.getAnswers()));

        if (person.getTraits() == quiz.tttt) {
            root = FXMLLoader.load(getClass().getResource("profilePage0Beyowolf.fxml"));
            Scene scene = new Scene(root,675,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } else {
            System.out.println("eat it.");
        }

    }
    
    
    




  

  
}
    
