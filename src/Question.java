import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private List<String> correctAnswers;
    private int  type;
    private boolean IfDo;

    public Question(String questionText, List<String> options, List<String> correctAnswers,int type,boolean IfDo) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswers = correctAnswers;
        this.type=type;
        this.IfDo=false;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
    public int getType(){
        return type;
    }
    public void change(){
        this.IfDo=true;
    }
    public boolean getIfDo(){
        return IfDo;
    }
}