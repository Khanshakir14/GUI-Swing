package swingborder;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyFrame extends JFrame 
{
    JLabel l;
    JTextField tf;
    JButton b;
    
    JPanel p;
    
    MyFrame()
    {
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();
        
        //we have added label textField and Button to the panel and then afterwards we would add this panel to the frame 
        p.add(l);
        p.add(tf);
        p.add(b);
                  //BorderFactory.createLowerBevelBorder() || BorderFactory.createRaisedBevelBorder() we have created instance and have nopt used new keyword
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER,   TitledBorder.LEFT);
        //BorderFactory.createTitledBorder() takes the type of border you want, The title string and also we can set the position
        //similarly we can use other methods available for Border
        p.setBorder(br);
        
        setLayout(new FlowLayout());
        //we have added Panel here
        add(p);
    }
   
}
public class SwingBorder 
{
    
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
