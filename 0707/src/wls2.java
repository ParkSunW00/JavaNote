import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class wls2 extends JFrame implements ActionListener {
    wls2() {
        this.setTitle("20402");
        this.setLayout(new GridLayout(4, 3, 5, 5));
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        for (int i = 1; i <= 9; i++) {
            JButton b=new JButton(i + "");
            this.add(b);
            b.addActionListener((ActionListener) this);
        }

        JButton btn2 = new JButton("*");
        JButton btn3 = new JButton("0");
        JButton btn4 = new JButton("#");
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        btn2.addActionListener((ActionListener) this);
        btn3.addActionListener((ActionListener) this);
        btn4.addActionListener((ActionListener) this);
    }

    public static void main(String[] args) {
        new wls2();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(((JButton) e.getSource()).getText());
    }
}
