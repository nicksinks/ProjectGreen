package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class justaGUIController {
    
    Quiz quiz = new Quiz();
    Person person;
    private Parent root;
    
    
    

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
    private Label description;

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

    //Sets every item in the .fxml file to not visible while leaving Scene and Stage intact
    
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
    
    // Makes a new quiz and makes a new person, then switches to question 1. 
    
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
        displayQuestion1();

        
        
    }

    
    //Next several methods all wipe the screen. Display the next question and either count or do not count.
 
    @FXML
    public void yesSwitchToQuestion2(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion2();
        quiz.setMustacheCounter();
        

    }
    
    @FXML
    public void noSwitchToQuestion2(ActionEvent event) throws IOException {
        wipeScreen();
        displayQuestion2();
        

    }
    
    @FXML
    public void yesSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion3();
        quiz.setMustacheCounter();
    }
    @FXML
    public void noSwitchToQuestion3(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion3();

    }
    @FXML
    public void yesSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion4();
        quiz.setMustacheCounter();
    }
    @FXML
    public void noSwitchToQuestion4(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion4();

    }
    @FXML
    public void yesSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion5();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion5(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion5();

    }
    @FXML
    public void yesSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion6();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion6(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion6();

    }
    @FXML
    public void yesSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion7();
        quiz.setMoodCounter();
    }
    @FXML
    public void noSwitchToQuestion7(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion7();
        
    }
    @FXML
    public void yesSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion8();
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion8(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion8();
        
    }    
    @FXML
    public void yesSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion9();
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion9(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion9();
    }
    public void yesSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion10();
        quiz.setBootyCounter();
    }
    @FXML
    public void noSwitchToQuestion10(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion10();

    }
    @FXML
    public void yesSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion11();
        quiz.setBankrollCounter();
    }
    @FXML
    public void noSwitchToQuestion11(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion11();
    }
    @FXML
    public void yesSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion12();
        quiz.setBankrollCounter();
    }
    @FXML
    public void noSwitchToQuestion12(ActionEvent event) throws IOException {

        wipeScreen();
        displayQuestion12();
   
    }
    
    // Next two items finish the quiz. 
    
    
    @FXML
    public void yesSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
        quiz.setBankrollCounter();
        person.setTraits(quiz.setTraitsFromQuizAnswers(quiz.getAnswers()));
        displayPersonality(person.getTraits());

    }
    @FXML
    public void noSwitchToProfilePage(ActionEvent event) throws IOException {

        wipeScreen();
        person.setTraits(quiz.setTraitsFromQuizAnswers(quiz.getAnswers()));
        displayPersonality(person.getTraits());

    }
    
    // Uses a switch case to determine which personality page to show.
    
    
    public void displayPersonality(Traits traits) throws IOException {
        int switchNumber = -1;
        
        for (int i = 0; i <quiz.personalities.length; i++) {
            if (person.getTraits() == quiz.personalities[i]) {
                switchNumber = i;
            }
                
                    
        }
        
        switch (switchNumber) {
        
        case 0 : display0();
            break;
        
        case 1 : display1();
            break;
        
        case 2 : display2();
            break;
        
        case 3 : display3();
            break;
        
        case 4 : display4();
            break;
        
        case 5 : display5();
            break;
        
        case 6 : display6();
            break;
        
        case 7 : display7();
            break;
        
        case 8 : display8();
            break;
        
        case 9 : display9();
            break;
        
        case 10 : display10();
            break;
        
        case 11 : display11();
            break;
        
        case 12 : display12();
            break;
        
        case 13 : display13();
            break;
        
        case 14 : display14();
            break;
        
        case 15 : display15();
            break;
        
        default : display15(); 
            break;
        
        }
        
    }
    
    // Next 16 methods displays profile pages getting called from the previous switch statement. 
    
    public void display0() throws IOException {

        root = FXMLLoader.load(getClass().getResource("profilePage0Beyowolf.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display1() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage1Wario.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display2() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage2Prince.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display3() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage3.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display4() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage4.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display5() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage5.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display6() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage6.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display7() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage7.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display8() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage8.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display9() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage9.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display10() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage10.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display11() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage11.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display12() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage12.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display13() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage13.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display14() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage14.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void display15() throws IOException {
        root = FXMLLoader.load(getClass().getResource("profilePage15.fxml"));
        Scene scene = new Scene(root,675,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    
    // Next 12 methods display questions after getting called by handlers. Set button visibility.
    
    
    public void displayQuestion1() {
        questionLabel.setText("Question 1");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(0));
        question.setVisible(true);
        mustacheYes1.setVisible(true);
        mustacheNo1.setVisible(true);
    }
    
    public void displayQuestion2() {
        questionLabel.setText("Question 2");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(1));
        question.setVisible(true);
        mustacheYes2.setVisible(true);
        mustacheNo2.setVisible(true);
    }
    
    public void displayQuestion3() {
        questionLabel.setText("Question 3");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(2));
        question.setVisible(true);
        mustacheYes3.setVisible(true);
        mustacheNo3.setVisible(true);
    }
    
    public void displayQuestion4() {
        questionLabel.setText("Question 4");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(3));
        question.setVisible(true);
        moodYes4.setVisible(true);
        moodNo4.setVisible(true);
    }
    
    public void displayQuestion5() {
        questionLabel.setText("Question 5");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(4));
        question.setVisible(true);
        moodYes5.setVisible(true);
        moodNo5.setVisible(true);
    }
    
    public void displayQuestion6() {
        questionLabel.setText("Question 6");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(5));
        question.setVisible(true);
        moodYes6.setVisible(true);
        moodNo6.setVisible(true);
    }
    
    public void displayQuestion7() {
        questionLabel.setText("Question 7");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(6));
        question.setVisible(true);
        bootyYes7.setVisible(true);
        bootyNo7.setVisible(true);
    }
    
    public void displayQuestion8() {
        questionLabel.setText("Question 8");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(7));
        question.setVisible(true);
        bootyYes8.setVisible(true);
        bootyNo8.setVisible(true);
    }
    
    public void displayQuestion9() {
        questionLabel.setText("Question 9");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(8));
        question.setVisible(true);
        bootyYes9.setVisible(true);
        bootyNo9.setVisible(true);
    }
    
    public void displayQuestion10() {
        questionLabel.setText("Question 10");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(9));
        question.setVisible(true);
        bankrollYes10.setVisible(true);
        bankrollNo10.setVisible(true);
    }
    
    public void displayQuestion11() {
        questionLabel.setText("Question 11");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(10));
        question.setVisible(true);
        bankrollYes11.setVisible(true);
        bankrollNo11.setVisible(true);
    }
    
    public void displayQuestion12() {
        questionLabel.setText("Question 12");
        questionLabel.setVisible(true);
        question.setText(quiz.getQuestion(11));
        question.setVisible(true);
        bankrollYes12.setVisible(true);
        bankrollNo12.setVisible(true);
    }
    
  
    
    
    
    




  

  
}
    
