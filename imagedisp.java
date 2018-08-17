import java.applet.*; 
import java.awt.*;
//To display image using applet
public class imagedisp  extends Applet { 
   Image img;
   MediaTracker tr;
   public void paint(Graphics g) {
      tr = new MediaTracker(this);
      img = getImage(getCodeBase(), "mypic.jpg");
      tr.addImage(img,0);
      g.drawImage(img, 0, 0, this);
   } 
}
	/*
	<applet code="imagedisp.class" width="400" height="400">
	</applet>
