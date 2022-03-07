/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingdemo_1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count =0;
    
    MyFrame(){
        super("First swing Application");
        setLayout(new FlowLayout());
        l = new JLabel("Clicked "+count+" Times");
        b = new JButton("click");
        
        add(l);
        add(b);
        add (new JButton("Cancel"));
        b.addActionListener(this);
        
        getRootPane().setDefaultButton(b);//set the button to default enter se bhi work karega
          //we can also set image
        b.setIcon(new ImageIcon(" C:\\Users\\shaha\\OneDrive\\Pictures\\Saved Pictures\\20211202_153332_0000.png"));
        l.setToolTipText("Counter"); // it will prompt counter message when we take our cursor to that label
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked "+count+" Times");
       
    }
}
public class SwingDemo_1
{

    public static void main(String[] args) {
       MyFrame f = new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //used to close window in swing 
        
    }
    
}
