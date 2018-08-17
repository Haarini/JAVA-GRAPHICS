import javax.swing.*;
import java.awt.*;

public class Rectangle_Swing extends JFrame{
     public Test(){
          setSize(400,400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setVisible(true);
     }

     public static void main(String a[]){
         new Test();
     }

     public void paint(Graphics g){
         
           
          g.drawRect(100, 100, 100, 100); // FOR RECT
     }
}
