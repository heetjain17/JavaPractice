package morePractice.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login form");
    frame.setSize(300,400);
    frame.setLayout(new GridLayout(3,2,10,10));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel userLabel = new JLabel("Username");
    JTextField userField = new JTextField();

    JLabel passLabel = new JLabel("Password");
    JPasswordField passField = new JPasswordField();

    JButton okBtn = new JButton("OK");
    JButton resetBtn = new JButton("RESET");

    frame.add(userLabel);
    frame.add(userField);
    frame.add(passLabel);
    frame.add(passField);
    frame.add(okBtn);
    frame.add(resetBtn);

    okBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String username = userField.getText();
        String password = new String(passField.getPassword());

        JOptionPane.showMessageDialog(frame, "Username: "+username+"\nPassword: "+password);
      }
    });

    resetBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        userField.setText("");
        passField.setText("");
      }
    });

    frame.setVisible(true);
  }
}
