import java.awt.*;

//To draw a semicircle using applet
public class Semicircle extends Frame
{
  public Test()
  {
    setTitle("Arcs Drawing");
    setSize(525, 300);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.drawArc(60, 70, 200, 200, 0, 180);
    g.setColor(Color.RED);
    g.fillArc(60, 70, 200, 200, 0, 180);
  }
  public static void main(String args[])
  {
    new Test();
  }
}
