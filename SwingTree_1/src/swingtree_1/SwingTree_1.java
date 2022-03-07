/*
Let us learn about J3 component of swing this tree component, help US representative data in the form

of a tree structure, just like a directory structure.

Usually in Windows operating system, we find directories in our computer system are shown in the form

of a tree.

So the same way we can represent data in the form of a tree.
*/
package swingtree_1;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;
import java.awt.*;
 
class MyFrame extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;
   
       MyFrame()
       {
           super("tree demo");
           
           DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\Program Files");
           File f=new File("C:\\Program Files");
           
           for(File x:f.listFiles())
           {
               if(x.isDirectory() && !x.isHidden())
               {
                   DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                                      System.out.println("Dirstcory "+ x.getName());
 
                   for(File y:x.listFiles())
                   {
                   System.out.println(y.getName());
 
                       temp.add(new DefaultMutableTreeNode(y.getName()));
                   }
                   root.add(temp);
               }
               else
               root.add(new DefaultMutableTreeNode(x.getName()));
           }
         //  tree.addTreeSelectionListener(this);
           tree=new JTree(root);
           label=new JLabel("No Files Selected");
           
           JScrollPane sp=new JScrollPane(tree);
           
           add(sp,BorderLayout.CENTER);
           add(label,BorderLayout.SOUTH);   
           
           
       }
 
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
   
}
 
 class SwingTree_1 {
 
 
    public static void main(String[] args) {
        MyFrame m=new MyFrame();
        m.setSize(400, 400);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}