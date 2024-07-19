import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class XO implements ActionListener
{
    static JFrame f = new JFrame("Tic Tac Toe");
    static XO o = new XO();
    JRadioButton x,y;
    static Label b,b1;
    static char s1,s2; 
    XO()
    {
        b = new Label("       Tic   Tac   Toe");
        b.setBackground(Color.cyan);
        b.setForeground(Color.black);
        b.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,45));
        b.setBounds(0,0,650,100);
        f.add(b);
        
        b1 = new Label("            X or O");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,45));
        b1.setBounds(100,220,450,50);
        f.add(b1);
        
        x = new JRadioButton("X");
        x.setBounds(200,300,100,70);
        x.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,25));
        f.add(x);
        x.addActionListener(this);
        
        y = new JRadioButton("O");
        y.setBounds(200,400,100,70);
        y.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,25));
        f.add(y);
        y.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(x.isSelected())
        s1 = 'X';
        if(y.isSelected())
        s1 = 'O';
        
        if(s1=='X')
        s2 = 'O';
        if(s1=='O')
        s2 = 'X';
        
        f.removeAll();
        f.validate();
        Start.main();
        f.dispose();
    }        
    public static void main()
    {
        new XO();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(650,750);
        
    }
}
