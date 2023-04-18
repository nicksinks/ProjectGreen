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
    void newQuiz(ActionEvent event) throws IOException {
        Person person = new Person(personName.getText(), personEmail.getText());
        Quiz quiz = new Quiz();
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

    public void switchToQuestion1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question3.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question4.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question5.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question6.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question7.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question8.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question9.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion10(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question10.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToQuestion11(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question11.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToQuestion12(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Question12.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProfilePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

}