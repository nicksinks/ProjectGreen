package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    void exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void newQuiz(ActionEvent event) {
        Person person = new Person(personName.getText(), personEmail.getText());
        Quiz quiz = new Quiz();
        personEmail.setVisible(false);
        personName.setVisible(false);
        emailLbl.setVisible(false);
        nameLabel.setVisible(false);
        
        
    }

}