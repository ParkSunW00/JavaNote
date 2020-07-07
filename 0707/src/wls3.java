import javax.swing.*;
import java.awt.*;


public class wls3 extends JFrame {
    wls3() {
        this.setTitle("20402");
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,4,5,5));

        JButton btn1=new JButton("MAIN");
        this.add(btn1);

        for (int i=1;i<=6;i++) {
            JButton btn=new JButton(i+"");
            this.add(btn);
        }


    }
    public static void main(String[] args){
        new wls3();
    }

}

