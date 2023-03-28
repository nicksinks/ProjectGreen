/*@Author: Stephen Torrijas
 * The Quiz class implements the questions to ask the user to help determine their personality. 
 * 
 */
package project_green


public class Quiz {
	
}
    private String title;
    private List<Question> questions;
    private int[] answers;
    
    public Quiz(String title, List<Question> questions) {
        this.title = title;
        this.questions = questions;
        this.answers = new int[questions.size()];
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
        this.answers = new int[questions.size()];
    }
    
    public int[] getAnswers() {
        return answers;
    }
    
    public void setAnswer(int index, int answer) {
        this.answers[index] = answer;
    }
