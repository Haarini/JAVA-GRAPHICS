import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Line_swing extends JFrame{

    public Test(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,450);

        JButton button =new JButton("press");
        panel.add(button);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        g2.draw(lin);
    }

    public static void main(String []args){
        Test s=new Test();
        s.setVisible(true);
    }
}
© 2018 GitHub, Inc.
