import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class JavaQuizApp {
    private JFrame frame;
    private JPanel questionPanel;
    private JButton submitButton;
    private Thread giveQuestionThread;

    private int totalQuestions = 15;
    private int currentQuestion = 0;
    private int correctAnswers = 0;
    private int totalScore = 0;
    private int current1=0;
    private int current2=0;
    private int current3=0;
    private int Rcurr1=0;
    private int Rcurr2=0;
    private int Rcurr3=0;
    private QuzzM quzzM;
    private List<Question> randomQuestions;
    private long startTime;
    private long endTime;
    private Timer timer;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JavaQuizApp quizApp = new JavaQuizApp();
            quizApp.initialize();
        });
    }

    private void initialize() {
        quzzM=new QuzzM();
        randomQuestions=quzzM.getRondomQuestion();
        frame = new JFrame("Java Quiz App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        questionPanel = new JPanel();
        submitButton = new JButton("Submit");
        submitButton.setEnabled(false);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(questionPanel, BorderLayout.CENTER);
        frame.getContentPane().add(submitButton, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endTime=System.currentTimeMillis();
                checkAnswer();
            }
        });
        giveQuestionThread = new Thread(new Runnable() {
            @Override
            public void run() {

                giveQuestion();
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        endTime=System.currentTimeMillis();
                        checkAnswer();
                    }
                }, 20000);
            }

        });

        frame.setVisible(true);
        startTime=System.currentTimeMillis();
        giveQuestionThread.start();
    }

    private void giveQuestion() {
        questionPanel.removeAll();
        Question question = randomQuestions.get(currentQuestion);
        JLabel questionLabel = new JLabel(question.getQuestionText());
        questionPanel.add(questionLabel);
        ButtonGroup buttonGroup=new ButtonGroup();
        for(String option : question.getOptions()){
            if(question.getType()==1) {
                JRadioButton radioButton = new JRadioButton(option);
                buttonGroup.add(radioButton);
                questionPanel.add(radioButton);
            }else if(question.getType()==2){
                JCheckBox checkBox=new JCheckBox(option);
                questionPanel.add(checkBox);
            }else if(question.getType()==3){
                JRadioButton radioButton = new JRadioButton(option);
                buttonGroup.add(radioButton);
                questionPanel.add(radioButton);
            }
        }
        submitButton.setEnabled(true);
        frame.revalidate();
        frame.repaint();
    }
    private List<String> getUserAnswer(Question question) {
        List<String> userAnswers = new ArrayList<>();
        Component[] components = questionPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JRadioButton) {
                JRadioButton radioButton = (JRadioButton) component;
                if (radioButton.isSelected()) {
                    userAnswers.add(radioButton.getText());
                }
            } else if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                if (checkBox.isSelected()) {
                    userAnswers.add(checkBox.getText());
                }
            }
        }
        return userAnswers;
    }
    private void checkAnswer() {
        // 更新成绩、显示正确答案等信息
        Question question = randomQuestions.get(currentQuestion);
        List<String> correctAnswers = question.getCorrectAnswers();
        List<String> userAnswers = getUserAnswer(question);
        String cor=correctAnswers.toString().replaceAll("[^A-D]","");
        String usr=userAnswers.toString().replaceAll("[^A-D.]","").replaceAll("[^A-D]","");

        if(Objects.equals(cor, usr)){
            if(question.getType()==1) {
                totalScore += 1; // 假设每题得2分
                Rcurr1++;
            }
            else if(question.getType()==2) {
                totalScore += 2; // 假设每题得1分
                Rcurr2++;
            }
            else if(question.getType()==3) {
                totalScore += 1; // 假设每题得2分\
                Rcurr3++;
            }
        }
        currentQuestion++;
        if(question.getType()==1)
            current1++;
        else if(question.getType()==2)
            current2++;
        else if(question.getType()==3)
            current3++;
        JOptionPane.showMessageDialog(frame, "Answer submitted for question " + currentQuestion+"Current Answer:"+cor
                +" Your Answer:"+usr+"\nCurrent question number:"+currentQuestion+"\nQuestion Did: 单选:"+current1+" 多选:"+current2+" 判断:"+current3
                +"\nQuestion Right: 单选:"+Rcurr1+" 多选:"+Rcurr2+" 判断："+Rcurr3+"\nCurrent Score:"+totalScore+"\nTime:"+(endTime-startTime)/1000+"s");
        if(currentQuestion>=totalQuestions)
            endQuiz();
        timer.cancel();
        giveQuestionThread.run();
    }

    private void endQuiz() {
        JOptionPane.showMessageDialog(frame, "Quiz Ended. Your final score: " + totalScore+"\nYour final correctNumber: "+correctAnswers);
        frame.dispose();
        System.exit(0);
    }
}
