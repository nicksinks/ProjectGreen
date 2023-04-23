package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class justaGUIController {
    
    
    Quiz quiz = new Quiz();
    
    

    @FXML
    private TextField personEmail;


    @FXML
    private TextField personName;

    @FXML
    private Label emailLbl;

    @FXML
    private Label nameLabel;

    @FXML
    private Button newQuizButton;

    @FXML
    void exit(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    private Button mustacheNo;

    @FXML
    private Button mustacheYes;

    @FXML
    private Button moodNo;

    @FXML
    private Button moodYes;
    
    @FXML
    private Button bootyNo;

    @FXML
    private Button bootyYes;
    
    @FXML
    private Button bankrollNo;

    @FXML
    private Button bankrollYes;

    @FXML
    private Label question1Label;
    
    @FXML
    private Label question2Label;
    @FXML
    private Label question3Label;
    @FXML
    private Label question4Label;
    @FXML
    private Label question5Label;
    @FXML
    private Label question6Label;
    @FXML
    private Label question7Label;
    @FXML
    private Label question8Label;
    @FXML
    private Label question9Label;
    @FXML
    private Label question10Label;
    @FXML
    private Label question11Label;
    @FXML
    private Label question12Label;


    @FXML
    void newQuiz(ActionEvent event) throws IOException {
        Person person = new Person(personName.getText(), personEmail.getText());
        personEmail.setVisible(false);
        personName.setVisible(false);
        emailLbl.setVisible(false);
        nameLabel.setVisible(false);
        newQuizButton.setVisible(false);
        switchToQuestion1(event);

        //run method displayQuestion1  it follows by running method displayQuestion2 

    }
//    @FXML
//    void mustacheYes(ActionEvent event) throws IOException {
//        
//        // determine how to do mustache ++
//        switchToQuestion2(event);
//    }
//    
//    @FXML
//    void mustacheNo(ActionEvent event) throws IOException {
//        
//        // no mustache ++
//        switchToQuestion2(event);
//    }
    
     @FXML

    public void switchToQuestion1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void noSwitchToQuestion2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
    @FXML
    public void yesSwitchToQuestion2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMustacheCounter(0);
    }
    
    @FXML
    public void yesSwitchToQuestion3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question3.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMustacheCounter(0);
    }
    @FXML
    public void noSwitchToQuestion3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question3.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question4.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMustacheCounter(0);
    }
    @FXML
    public void noSwitchToQuestion4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question4.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question5.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question5.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question6.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question6.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question7.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question7.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question8.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBootyCounter(0);
    }
    @FXML
    public void noSwitchToQuestion8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question8.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question9.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBootyCounter(0);
    }
    @FXML
    public void noSwitchToQuestion9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question9.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void yesSwitchToQuestion10(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question10.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBootyCounter(0);
    }
    @FXML
    public void noSwitchToQuestion10(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question10.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion11(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question11.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBankrollCounter(0);
    }
    @FXML
    public void noSwitchToQuestion11(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question11.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToQuestion12(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question12.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBankrollCounter(0);
    }
    @FXML
    public void noSwitchToQuestion12(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question12.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void yesSwitchToProfilePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profilePage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        quiz.setBankrollCounter(0);
    }
    @FXML
    public void noSwitchToProfilePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profilePage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println(quiz.getMoodCounter());
    }
    //
    
    
  
    
    
}