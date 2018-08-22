package map;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class dispmap extends JFrame{

    public dispmap() {
        initialize();
        
    }

    private void initialize() {
    	setTitle("Map of cities");
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JComboBox comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("Delhi");
        comboBox.addItem("Chennai");
        comboBox.addItem("Mumbai");
        comboBox.addItem("Kolkata");
        comboBox.addItem("Banglore");
        
  
        //
        // Create an ActionListener for the JComboBox component.
        //
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("banglore"))
                
                {
                	banglore();
                }
                else if(selected.toString().equals("chennai"))
                {
                	chennai();
                }
                else if(selected.toString().equals("delhi"))
                {
                	delhi();
                }
                else if(selected.toString().equals("Kolkata"))
                {
                	kolkata();
                }
                
                else if(selected.toString().equals("Mumbai"))
                {
                	mumbai();
                }

            }
        });
        getContentPane().add(comboBox);
        
    }
public void banglore()
{

		JFrame test = new JFrame("Banglore city");
		try {
		String latitude = "12.9716";
				
		String longitude = "77.5946";
		String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
		+ latitude
		+ ","
		+ longitude
		+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
		String destinationFile = "image.jpg";
		// read the map image from Google
		// then save it to a local file: image.jpg
		//
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);
		byte[] b = new byte[2048];
		int length;
		while ((length = is.read(b)) != -1) {
		os.write(b, 0, length);
		}
		is.close();
		os.close();
		} catch (IOException e) {
		e.printStackTrace();
		System.exit(1);
		}
		// create a GUI component that loads the image: image.jpg
		//
		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
		.getImage().getScaledInstance(630, 600,
		java.awt.Image.SCALE_SMOOTH));
		test.add(new JLabel(imageIcon));
		// show the GUI window
		test.setVisible(true);
		test.pack();
		}
public void chennai() {
	
		JFrame test = new JFrame("Chennai");
		try {
		String latitude = "13.0827";
		String longitude = "80.2707";
		String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
		+ latitude
		+ ","
		+ longitude
		+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
		String destinationFile = "image.jpg";
		// read the map image from Google
		// then save it to a local file: image.jpg
		//
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);
		byte[] b = new byte[2048];
		int length;
		while ((length = is.read(b)) != -1) {
		os.write(b, 0, length);
		}
		is.close();
		os.close();
		} catch (IOException e) {
		e.printStackTrace();
		System.exit(1);
		}
		// create a GUI component that loads the image: image.jpg
		//
		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
		.getImage().getScaledInstance(630, 600,
		java.awt.Image.SCALE_SMOOTH));
		test.add(new JLabel(imageIcon));
		// show the GUI window
		test.setVisible(true);
		test.pack();
		}
public void delhi()
{
	JFrame test = new JFrame("New Delhi Map");
	try {
	String latitude = "28.6139";
	String longitude = "77.2090";
	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
	+ latitude
	+ ","
	+ longitude
	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
	String destinationFile = "image.jpg";
	// read the map image from Google
	// then save it to a local file: image.jpg
	//
	URL url = new URL(imageUrl);
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destinationFile);
	byte[] b = new byte[2048];
	int length;
	while ((length = is.read(b)) != -1) {
	os.write(b, 0, length);
	}
	is.close();
	os.close();
	} catch (IOException e) {
	e.printStackTrace();
	System.exit(1);
	}
	// create a GUI component that loads the image: image.jpg
	//
	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
	.getImage().getScaledInstance(630, 600,
	java.awt.Image.SCALE_SMOOTH));
	test.add(new JLabel(imageIcon));
	// show the GUI window
	test.setVisible(true);
	test.pack();
	}
public void kolkata()
{JFrame test = new JFrame("KOlkata map");
try {
String latitude = "22.5726";
String longitude = "88.3639";
String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
+ latitude
+ ","
+ longitude
+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
String destinationFile = "image.jpg";
// read the map image from Google
// then save it to a local file: image.jpg
//
URL url = new URL(imageUrl);
InputStream is = url.openStream();
OutputStream os = new FileOutputStream(destinationFile);
byte[] b = new byte[2048];
int length;
while ((length = is.read(b)) != -1) {
os.write(b, 0, length);
}
is.close();
os.close();
} catch (IOException e) {
e.printStackTrace();
System.exit(1);
}
// create a GUI component that loads the image: image.jpg
//
ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
.getImage().getScaledInstance(630, 600,
java.awt.Image.SCALE_SMOOTH));
test.add(new JLabel(imageIcon));
// show the GUI window
test.setVisible(true);
test.pack();
}

public void mumbai()
{
	JFrame test = new JFrame("Mumbai Map");
	try {
	String latitude = "19.0760";
	String longitude = "72.8777";
	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
	+ latitude
	+ ","
	+ longitude
	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
	String destinationFile = "image.jpg";
	// read the map image from Google
	// then save it to a local file: image.jpg
	//
	URL url = new URL(imageUrl);
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destinationFile);
	byte[] b = new byte[2048];
	int length;
	while ((length = is.read(b)) != -1) {
	os.write(b, 0, length);
	}
	is.close();
	os.close();
	} catch (IOException e) {
	e.printStackTrace();
	System.exit(1);
	}
	// create a GUI component that loads the image: image.jpg
	//
	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
	.getImage().getScaledInstance(630, 600,
	java.awt.Image.SCALE_SMOOTH));
	test.add(new JLabel(imageIcon));
	// show the GUI window
	test.setVisible(true);
	test.pack();
	}

		
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
                new dispmap().setVisible(true);
            }
        });
    }
}
