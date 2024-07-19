import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Toss implements ActionListener
{
    static Frame f = new Frame("Toss");
    Label b,b1,b2; 
    Button s,d;
    Label g;
    static boolean x;
    static Toss o = new Toss();
    public void toss()
    {
        b = new Label("       Tic   Tac   Toe");
        b.setBackground(Color.cyan);
        b.setForeground(Color.black);
        b.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,55));
        b.setBounds(10,20,650,100);
               
        b1 = new Label("  Click \"Start\" to Begin");
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.black);
        b1.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,35));
        b1.setBounds(100,220,450,50);
        
        d = new Button();
                
        s = new Button("Start");
        s.setBackground(Color.yellow);
        s.setForeground(Color.black);
        s.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,25));
        s.setBounds(175,320,300,70);
        s.addActionListener(this);
                
        f.add(s);
        f.add(b1);
        f.add(b);
        f.add(d);
    }
    public void actionPerformed(ActionEvent e)
    {        
        f.remove(b1);
        f.remove(d);      
        if(e.getSource()==s)
        {
            f.removeAll();
            f.validate();
            ustart.main();
            f.dispose();
        }
    }
    public static void main()
    {
        o.toss();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(650,750);
        
    }
}
    