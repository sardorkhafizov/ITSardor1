package com.amigoscode;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame implements ActionListener {
    JCheckBox checkBox = new JCheckBox();
    ImageIcon title;
    JButton btn;
    JLabel name;
    JLabel surename;
    JLabel email;
    JLabel password;
    JTextField Name;
    JTextField SureName;
    JTextField Email;
    JPasswordField Password;

    MFrame(){
        title = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\unnamed.jpg");
        this.setSize(300,400);
        this.setIconImage(title.getImage());
        this.setTitle("verification");
        //this.add(checkBox);
        //this.add(btn);
        this.setLayout(null);


        name = new JLabel("Name");
        name.setBounds(20, 40, 80, 30);
        add(name);
        surename=new JLabel("Last Name:");
        surename.setBounds(20, 80, 80,30);
        add(surename);
        email =new JLabel("Email:");
        email.setBounds(20,120, 80,30);
        add(email);
        password = new JLabel("Password");
        password.setBounds(20,160,80,30);
        add(password);
        Name = new JTextField();
        Name.setBounds(100, 40, 100,30);
        add(Name);
        SureName  = new JTextField();
        SureName.setBounds(100,80, 100,30);
        add(SureName);
        Email = new JTextField();
        Email.setBounds(100,120, 100,30);
        add(Email);
        Password = new JPasswordField();
        Password.setBounds(100,160,100,30);
        add(Password);

        checkBox.setText("i am not a robot");
        checkBox.setBounds(90,250,113,22);
        checkBox.addActionListener(this);
        checkBox.setSelected(false);
        checkBox.addActionListener(e -> new MyFrame());
        add(checkBox);

        btn = new JButton("Submit");
        btn.setBounds(100,280,100,30);
        btn.setFocusable(false);
        btn.addActionListener(this);
        btn.setVisible(true);
        add(btn);

        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){

            if (checkBox.isSelected()){
                String mesage = "hello" +"  " + Name.getText();
                JOptionPane.showMessageDialog(null,mesage);
            }
            else {
                String huy = "Please check that you are not a robot";
                JOptionPane.showMessageDialog(null,huy);
            }
//            if (checkBox.isSelected()){
//                new MyFrame();
//                this.setVisible(false);}
//            else {
//                String error = "Please select the checkbox";
//                JOptionPane.showMessageDialog(null,error);
//                //btn.setVisible(false);
//            }
        }
    }
}