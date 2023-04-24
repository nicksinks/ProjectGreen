package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    void exit(ActionEvent event) {

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
    }
   
    
    


    @FXML
    void newQuiz(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("justaGUI.fxml"));

        wipeScreen();
        
        Person person = new Person(personName.getText(), personEmail.getText());

        quiz.setMoodCounter();
        System.out.println();
        quiz.setMoodCounter();
        System.out.println();
        quiz.setMoodCounter();
        System.out.println();
        //parent root test

        
        switchToQuestion1(event);

        //run method displayQuestion1  it follows by running method displayQuestion2 

    }
    
    @FXML

    public void switchToQuestion1(ActionEvent event) throws IOException {
        wipeScreen();
        questionLabel.setText("Question 1");
        questionLabel.setVisible(true);
        question.setText("Do you feel like you have to shave?");
        
        mustacheYes1.setVisible(true);
        mustacheNo1.setVisible(true);
        
        
    }

    
    
    @FXML
    public void noSwitchToQuestion2(ActionEvent event) throws IOException {
        wipeScreen();
        questionLabel.setText("fuck you");
        questionLabel.setVisible(true);
        question.setText("fuck you");
        mustacheYes2.setVisible(true);
        mustacheNo2.setVisible(true);
        

    } 
    @FXML
    public void yesSwitchToQuestion2(ActionEvent event) throws IOException {

        wipeScreen();
        questionLabel.setText("fuck you");
        questionLabel.setVisible(true);
        question.setText("fuck you");
        mustacheYes2.setVisible(true);
        mustacheNo2.setVisible(true);
        

    }
    
    @FXML
    public void yesSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setMustacheCounter(0);
    }
    @FXML
    public void noSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setMustacheCounter(0);
    }
    @FXML
    public void noSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBootyCounter(0);
    }
    @FXML
    public void noSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
    }    
    @FXML
    public void yesSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBootyCounter(0);
    }
    @FXML
    public void noSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
    }
    public void yesSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void noSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBankrollCounter(0);
    }
    @FXML
    public void noSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBankrollCounter(0);
    }
    @FXML
    public void noSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void yesSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
    }
    @FXML
    public void noSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
    }
    //
    
}