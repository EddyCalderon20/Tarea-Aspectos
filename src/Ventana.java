
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{
  
	private JButton red,blue,green;
	  private JLabel label;
	  
	  public Ventana()
	  {
	    
	    red = new JButton("RED");
	    red.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	changeColor(red.getText());
	        }  
	    });
	    add(red);
	    
	    green = new JButton("GREEN");
	    green.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	changeColor(green.getText());
	        }  
	    });
	    add(green);

	    blue = new JButton("BLUE");
	    blue.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	changeColor(blue.getText());
	        }  
	    });
	    add(blue);
	    
	    setLayout(new FlowLayout());
	    setSize(700,700);
	    setTitle("Bit Life - Java program Buttons Clicked");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    
	    label = new JLabel("");
	    add(label);
	    
	  }
	  

	  public static void main(String[] args) 
	  {
	    new Ventana();
	  }

	  public void changeColor(String color) {
			label.setText(color+" SELECTED");
		    if (color.equals("RED"))
		    {
		      getContentPane().setBackground(Color.RED);
		      
		    }
		    
		    else if (color.equals("GREEN"))
		    {
		      getContentPane().setBackground(Color.GREEN);
		    }
		    
		    else if(color.equals("BLUE"))
		    {
		      getContentPane().setBackground(Color.BLUE);
		    }
		}

}