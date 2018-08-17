import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
//To draw coloured lines using Swings
public class Colorline extends JFrame
{
	public Test()
	{
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
	g.setColor(Color.RED);
		g.drawLine(0, 480, 960, 480);
		g.setColor(Color.GREEN);
		g.drawLine(0, 0, 960, 960);
		g.setColor(Color.BLUE);
		g.drawLine(300, 300, 500, 100);
	}

public static void main(String[] args)
{
	Test t=new Test();
}
}
