import javax.swing.*; 
import java.awt.*; 
public class Circle extends JPanel{ 

public void paint(Graphics g){ 
 

	g.drawOval(400, 50, 100, 100);

} 
public static void main(String[] args){ 
JFrame jf=new JFrame(); 
jf.setDefaultCloseOperation 
(JFrame.EXIT_ON_CLOSE); 
jf.setPreferredSize(new Dimension(300,500)); 
jf.add(new Test()); 
jf.pack(); 
jf.setVisible(true); 
} 
} 
