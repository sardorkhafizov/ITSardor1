package com.amigoscode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton catButton;
    JButton button;
    JLabel catLabel;
    JLabel cat1Label;
    JLabel dogLabel;
    JLabel dog1Label;
    JLabel wolfLabel;
    JLabel wolf1Label;
    JCheckBox catBox;
    JCheckBox cat1Box;
    JCheckBox dogBox;
    JCheckBox dog1Box;
    JCheckBox wolfBox;
    JCheckBox wolf1Box;
    ImageIcon catIcon;
    ImageIcon cat1Icon;
    ImageIcon dogIcon;
    ImageIcon dog1Icon;
    ImageIcon wolfIcon;
    ImageIcon wolf1Icon;
    JLabel answerLabel;
    JLabel errorLabel;



    MyFrame() {

        catButton = new JRadioButton();


        catIcon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\v989187-1844716273.jpg");
        cat1Icon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\ad6a73639b2904c013e2efdd3472e828_100_100.jpg");
        dogIcon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\_eLX4QFvw5yAqxYx4BBLlT5ZbAIW0eB87wf1CjHbTukOA8qeJ7Wn2J2P22FCd4OEIQMkA7Gb.jpg");
        dog1Icon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\1gzp5Wdn6Yblu3CJaTPfPimrqfPLxBSqOR7HunfJFAnJ1wwMFOsXpFKMVBsB0lPcjChOseIi.jpg");
        wolfIcon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\2yR20quaDVCBP88wPlFTZWlnoTtRS9f_UKKQLZDLtL3KeXHp45jt7f_ZWwO91vrToGt.jpg");
        wolf1Icon = new ImageIcon("C:\\Users\\m.hoshimov\\Downloads\\picture-1933-1590333732.jpg");


        catLabel = new JLabel();
        catLabel.setIcon(catIcon);
        catLabel.setBounds(50, 100, 100, 100);

        dogLabel = new JLabel();
        dogLabel.setIcon(dogIcon);
        dogLabel.setBounds(160, 100, 100, 100);

        wolfLabel = new JLabel();
        wolfLabel.setIcon(wolfIcon);
        wolfLabel.setBounds(50, 210, 100, 100);

        cat1Label = new JLabel();
        cat1Label.setIcon(cat1Icon);
        cat1Label.setBounds(160, 210, 100, 100);

        dog1Label = new JLabel();
        dog1Label.setIcon(dog1Icon);
        dog1Label.setBounds(50, 320, 100, 100);

        wolf1Label = new JLabel();
        wolf1Label.setIcon(wolf1Icon);
        wolf1Label.setBounds(160, 320, 100, 100);

        answerLabel = new JLabel("You are a human");
        answerLabel.setBounds(700, 300, 100, 100);
        answerLabel.setVisible(false);
        errorLabel = new JLabel("You are not a human");
        errorLabel.setBounds(700, 400, 140, 100);
        errorLabel.setVisible(false);

        catBox = new JCheckBox();
        //catBox.setText("");
        catBox.setFocusable(false);
        //catBox.setFont(new Font("Time New Roman",Font.PLAIN,10));
        catBox.setBackground(new Color(255, 250, 250));
        catBox.setBounds(47, 100, 18, 15);
        catBox.addActionListener(this);
        // catBox.setBackground(new Color(217,104,70));

        dogBox = new JCheckBox();
        //dogBox.setText("");
        dogBox.setFocusable(false);
        dogBox.setBackground(new Color(255, 250, 250));
        //dogBox.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        dogBox.setBounds(157, 100, 18, 15);
        dogBox.addActionListener(this);

        wolfBox = new JCheckBox();
        //wolfBox.setText("Picture C");
        wolfBox.setFocusable(false);
//        wolfBox.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        wolfBox.setBackground(new Color(255, 250, 250));
        wolfBox.setBounds(47, 210, 18, 15);
        wolfBox.addActionListener(this);

        cat1Box = new JCheckBox();
//        cat1Box.setText("Picture D");
        cat1Box.setFocusable(false);
//        cat1Box.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        cat1Box.setBackground(new Color(255, 250, 250));
        cat1Box.setBounds(157, 210, 18, 15);
        cat1Box.addActionListener(this);

        dog1Box = new JCheckBox();
//        dog1Box.setText("Picture E");
        dog1Box.setFocusable(false);
//        dog1Box.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        dog1Box.setBackground(new Color(255, 250, 250));
        dog1Box.setBounds(47, 320, 18, 15);
        dog1Box.addActionListener(this);

        wolf1Box = new JCheckBox();
        // wolf1Box.setText("Picture F");
        wolf1Box.setFocusable(false);
//        wolf1Box.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        wolf1Box.setBackground(new Color(255, 250, 250));
        wolf1Box.setBounds(157, 320, 18, 15);
        wolf1Box.addActionListener(this);


        this.setSize(330, 550); //sets size of a this
        this.setTitle("TMCI Exam"); //sets title of a this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exit out of app

        ImageIcon image = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\unnamed.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 250, 250));

        JLabel label = new JLabel();
        label.setText("Choose image where only cat is given");
        /*ImageIcon image1 = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\8345381.jpeg");
        label.setIcon(image1);*/
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(217, 104, 70));
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        button = new JButton();
        button.setBounds(105, 450, 100, 50);
        //button.addActionListener(e -> System.out.println("poo"));
        button.setText("Submit");
        button.setFocusable(false);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setBackground(new Color(89, 98, 53));
        button.setForeground(Color.white);
        button.addActionListener(this);


        this.add(catBox);
        this.add(cat1Box);
        this.add(dogBox);
        this.add(dog1Box);
        this.add(wolfBox);
        this.add(wolf1Box);
        this.add(answerLabel);
        this.add(errorLabel);

        this.add(catLabel);
        this.add(dogLabel);
        this.add(cat1Label);
        this.add(wolfLabel);
        this.add(dog1Label);
        this.add(wolf1Label);
        this.add(button);
        this.add(label);
        this.setVisible(true);//make this visual
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){

            if (catBox.isSelected() && cat1Box.isSelected() && !dog1Box.isSelected() &&!dogBox.isSelected()&&!wolf1Box.isSelected() && !wolf1Box.isSelected()){
                //answerLabel.setVisible(true);
                String answr = "You are a human";
                JOptionPane.showMessageDialog(null,answr);
                this.setVisible(false);

            }

            else {
                //errorLabel.setVisible(true);
                String err = "Please try again";
                JOptionPane.showMessageDialog(null,err);
            }

        }

    }
}