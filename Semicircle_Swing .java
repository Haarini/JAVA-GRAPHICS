import javax.swing.*; 
import java.awt.*; 

//To draw a semicircle using swing
public class Semicircle_Swing extends JPanel
{ 
public void paint(Graphics g){ 
 
	g.setColor(Color.GREEN); 
	g.fillArc(50, 50, 100, 100, 0, 180); 
	g.setColor(Color.BLUE); 
	g.fillArc(200, 100, 100,100,0,180); 
	g.setColor(Color.RED);
	g.fillOval(400, 50, 100, 100);

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
