import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BgChange {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Bg color changer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,400);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,3));

    JButton btn = new JButton("Bg Change");

    panel.add(new JLabel(""));
    panel.add(new JLabel(""));
    panel.add(new JLabel(""));
    panel.add(new JLabel(""));
    panel.add(btn);
    panel.add(new JLabel(""));
    panel.add(new JLabel(""));
    panel.add(new JLabel(""));
    panel.add(new JLabel(""));

    frame.add(panel);

    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        Random rand = new Random();
        Color color = new Color(
          rand.nextInt(256),
          rand.nextInt(256),
          rand.nextInt(256)
        );

        panel.setBackground(color);
      }
    });

    frame.setVisible(true);
  }
}
