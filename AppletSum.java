import java.awt.*;
    import java.applet.*;
    import java.awt.event.*;
    import javax.swing.JFrame;
    import javax.swing.JOptionPane;

    public class AppletSum extends Applet implements ActionListener{
      TextField text1,text2,output;
      Label label1,label2,label3;
      Button button;
      public void init(){
        setLayout(null);
        label1 = new Label("Enter Number1: ");
        label1.setBounds(20,20,100,20);
        add(label1);

        text1 = new TextField(5);
        text1.setBounds(150,20,100,20);
        add(text1);

        label2 = new Label("Enter Number2: ");
        label2.setBounds(20,50,100,20);
        add(label2);

        text2 = new TextField(5);
        text2.setBounds(150,50,100,20);
        add(text2);

        label3 = new Label("Sum of Two Numbers: ");
        label3.setBounds(20,80,130,20);
        add(label3);

        output = new TextField(5);
        output.setBounds(150,80,100,20);
        add(output);

        button = new Button("Sum");
        button.setBounds(150,110,100,20);
        add(button);

        button.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int sum=num1+num2;
        

        	
        	    JFrame parent = new JFrame();

        	    JOptionPane.showMessageDialog(parent, "sum is"+sum);
//        	    JOptionPane.showInternalMessageDialog(parent, "Printing complete");


        }
    }
