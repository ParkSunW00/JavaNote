import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wls2 extends JFrame implements ActionListener {

    Container panel=this.getContentPane();
    JButton cancel=new JButton("종료");

    wls2() {
        panel.add(cancel);

        this.setTitle("20402");
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cancel.addActionListener(this);

    }
    public static void main(String[] args) {
        wls2 f=new wls2();
    }
    public void actionPerformed (ActionEvent e) {
        System.exit(0); //버튼 누르면 창 닫힘
    }
}
