

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class display {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Diplay");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1400,700);
    frame.setLayout(new GridLayout(3,2));

    
    JLabel nameLabel = new JLabel("Username");
    JTextField nameField = new JTextField();

    JLabel ageLabel = new JLabel("Age");
    JTextField ageField = new JPasswordField();

    JButton okBtn = new JButton("SUBMIT");

    frame.add(nameLabel);
    frame.add(nameField);
    frame.add(ageLabel);
    frame.add(ageField);
    frame.add(okBtn);

    okBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String name = nameField.getText();
        String age = ageField.getText();

        JOptionPane.showMessageDialog(frame, "Name: "+name+"\nAge: "+age);
      }
    });

    frame.setVisible(true);

  }
}
