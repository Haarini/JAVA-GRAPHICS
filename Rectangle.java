import java.awt.Color;
	import java.applet.Applet;
	import java.awt.Graphics;
	
	//drawing a rectangle and filling it with purple color using applet
	public class Rectangle extends Applet{
	 
		public void paint(Graphics g)
    {
			Color PURPLE = new Color(255,0,255);
		
			g.setColor(PURPLE);
			g.fillRect( 100,100, 100, 100 );//Draws a square and fills it with purple color as all the co ordinates are same
		  g.setColor(PURPLE);
			g.fillRect( 50,100, 50, 100 );//Draws a rectangle and fills it with purple color as  the co ordinates are differents
			
		}
