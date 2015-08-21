// 7/18/14
// Avraham Moryosef
// This program will compute the sum of the letters in a word
// GUI format

package numerology;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Numerology extends JFrame implements ActionListener
{
        // what is on the screen    
        private JLabel intro;
        private JTextField option;
        private JTextArea display;
        private JButton fruity , quit;
        
       
    public Numerology()
    { 
        // screen layout        
        intro           = new JLabel ("Enter a word" , SwingConstants.RIGHT);
        option          = new JTextField(20);
        display         = new JTextArea( 20 , 10);
        fruity          = new JButton ("Numbers!");
        quit            = new JButton ("Quit");
        setTitle("NUMEROLOGY");
        
        Container c = getContentPane();
        setSize(500,300);
        c.setLayout(null); 
        
        fruity.addActionListener(this); 
        quit.addActionListener(this); 
        
        intro.setSize(200,30);
        option.setSize(200, 30);
        display.setSize(400, 50);
        fruity.setSize(150,100);
        quit.setSize(150, 100);
        
        intro.setLocation(10,10);
        option.setLocation(220,10);
        display.setLocation(30,60);
        fruity.setLocation(50,150);
        quit.setLocation(250,150);
        
        c.add(intro);
        c.add(option);
        c.add(display);
        c.add(fruity);
        c.add(quit);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main (String [] args)
    {
        Numerology myNumerology = new Numerology(); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        // input string variable 
        String word;
        
        if(e.getActionCommand().equals("Numbers!"))
        {
            word = option.getText().toLowerCase(); 
            
            // variable for the value of the word
            int sum = 0;
            
            // loop to count the number of characters in the word
           for(int x=0; x < word.length(); x++)
           {           
               sum +=  word.charAt(x) - 96;
           }
        
            // outputs the result
            display.setText("Your word is equal to: " + sum);
        }
        
        if(e.getActionCommand().equals("Quit"))
        {
            System.exit(0);
        }    
    }       
}

