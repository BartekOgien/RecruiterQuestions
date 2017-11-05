package com.recruiter.frame;

import com.recruiter.creators.ButtonCreator;
import com.recruiter.creators.TextCreator;
import com.recruiter.questions.QuestDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Frame implements ActionListener {
    JFrame recruiterFrame;
    JTextArea questionText;
    JButton getRandomQuestion;
    JButton getAnswer;
    QuestDB questDB;
    Random random;
    int questionNumber;

    public Frame() {
        recruiterFrame = new JFrame("Recruiter Questions");
        recruiterFrame.setSize(500, 340);
        recruiterFrame.setLayout(null);
        recruiterFrame.setVisible(true);
        questDB = new QuestDB();
        random = new Random();
    }

    public void frameRun() {

        TextCreator textCreator = new TextCreator();
        questionText = textCreator.createTextArea(recruiterFrame);
        ButtonCreator buttonCreator = new ButtonCreator();
        getRandomQuestion = buttonCreator.createButton("Losowe pytanie", recruiterFrame, 300, 60);
        getRandomQuestion.addActionListener(this);
        getAnswer = buttonCreator.createButton("Odpowiedź", recruiterFrame, 300, 120);
        getAnswer.addActionListener(this);
        questDB.createQuestionsList();

    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        try {
            if (e.getSource() == getRandomQuestion) {
                questionNumber = random.nextInt(questDB.getQuestions().size());
                questionText.setText(questDB.getQuestions().get(questionNumber).getQuestion());
            }
            if (e.getSource() == getAnswer) {
                try {
                    JOptionPane.showMessageDialog(recruiterFrame, questDB.getQuestions().get(questionNumber).getAnswer());
                } catch (IllegalComponentStateException ei) {

                }
            }

        } catch (NumberFormatException ex) {

        }
    }
}
