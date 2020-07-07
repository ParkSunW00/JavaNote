import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class wls extends JFrame implements MouseListener {
    Container panel=getContentPane();
    JButton button=new JButton("btn1");

    wls() {
        panel.add(button);
        this.setTitle("20402");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);

        button.setBackground(Color.BLUE);
        button.addMouseListener(this);
    }
    public static void main(String[] args){
        new wls();
    }
    public void mouseEntered(MouseEvent e) {
        JButton button2=(JButton) e.getSource();
        button2.setBackground(Color.YELLOW);
    }
    public void mouseExited(MouseEvent e) {
        JButton button2=(JButton) e.getSource();
        button2.setBackground(Color.BLUE);
    }
    public void mousePressed(MouseEvent e){ }
    public void mouseReleased(MouseEvent e){ }
    public void mouseClicked(MouseEvent e){ }
}
