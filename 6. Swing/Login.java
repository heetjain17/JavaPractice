import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login Form");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setLayout(new GridLayout(3, 2, 5, 5));

    JLabel userLabel = new JLabel("Username: ");
    JTextField userField = new JTextField();

    JLabel passLabel = new JLabel("Password: ");
    JPasswordField passField = new JPasswordField();

    JButton okButton = new JButton("OK");
    JButton resetButton = new JButton("RESET");

    frame.add(userLabel);
    frame.add(userField);
    frame.add(passLabel);
    frame.add(passField);
    frame.add(okButton);
    frame.add(resetButton);

    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String username = userField.getText();
        String password = new String(passField.getPassword());
        JOptionPane.showMessageDialog(frame, "Username: "+username+"\nPassword: "+password);
      }
    });
    resetButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        userField.setText("");
        passField.setText("");
      }
    });

    frame.setVisible(true);
  }
}
