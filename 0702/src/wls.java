import javax.swing.*;
import java.awt.*;

public class wls extends JFrame {
    wls() {
        Container c=this.getContentPane();
        c.setLayout(null);

        JLabel la=new JLabel("버튼눌러ㅋㅋ");
        la.setLocation(130,50);
        la.setSize(200,20);
        c.add(la);

        for(int i=1;i<9;i++) {
            JButton b=new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            c.add(b);
        }

        this.setTitle("20403");
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new wls();
    }
}
