import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ustart implements ActionListener
{
    static Frame f = new Frame("Tic Tac Toe");
    static Button w[] = new Button[9];
    Button d;
    Label b;
    static char s[] = {'\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000'};
    
    ustart()    
    {
        b = new Label("         Tic   Tac   Toe");
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,55));
        b.setBounds(0,0,650,100);
        f.add(b);
                        
        w[0] = new Button("");
        w[0].setBounds(0,100,210,210);
        f.add(w[0]);
        w[1] = new Button("");
        w[1].setBounds(210,100,210,210);
        f.add(w[1]);
        w[2] = new Button("");
        w[2].setBounds(420,100,210,210);
        f.add(w[2]);
        w[3] = new Button("");
        w[3].setBounds(0,310,210,210);
        f.add(w[3]);   
        w[4] = new Button("");
        w[4].setBounds(210,310,210,210);
        f.add(w[4]);
        w[5] = new Button("");
        w[5].setBounds(420,310,210,210);
        f.add(w[5]);
        w[6] = new Button("");
        w[6].setBounds(0,520,210,210);
        f.add(w[6]);
        w[7] = new Button("");
        w[7].setBounds(210,520,210,210);
        f.add(w[7]);
        w[8] = new Button("");
        w[8].setBounds(420,520,210,210);
        f.add(w[8]);        
        for(int i = 0;i<9;i++)
        w[i].addActionListener(this);
        
        d = new Button();
        f.add(d);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        for(int k = 0;k<9;k++)
        f.remove(w[k]);
        if(e.getSource()==w[0])
        {
            w[0] = new Button(Character.toString(XO.s1));
            w[0].setBounds(0,100,210,210);
            w[0].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[0] = XO.s1;
            w4();
        }
        if(e.getSource()==w[1])
        {
            w[1] = new Button(Character.toString(XO.s1));
            w[1].setBounds(210,100,210,210);
            w[1].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[1] = XO.s1;
            w4();
        }
        if(e.getSource()==w[2])
        {
            w[2] = new Button(Character.toString(XO.s1));
            w[2].setBounds(420,100,210,210);
            w[2].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[2] = XO.s1;
            w4();               
        }
        if(e.getSource()==w[3])
        {
            w[3] = new Button(Character.toString(XO.s1));
            w[3].setBounds(0,310,210,210);
            w[3].setFont(new java.awt.Font("w",Font.BOLD,95));                          
            s[3] = XO.s1;
            w4();
        }             
        if(e.getSource()==w[4])
        {
            w[4] = new Button(Character.toString(XO.s1));
            w[4].setBounds(210,310,210,210);
            w[4].setFont(new java.awt.Font("w",Font.BOLD,95));                    
            s[4] = XO.s1;         
            
            w[2] = new Button(Character.toString(XO.s2));
            w[2].setBounds(420,100,210,210);
            w[2].setFont(new java.awt.Font("w",Font.BOLD,95));
            s[2] = XO.s2;
        }                           
        if(e.getSource()==w[5])
        {
            w[5] = new Button(Character.toString(XO.s1));
            w[5].setBounds(420,310,210,210);
            w[5].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[5] = XO.s1;
            w4();
        }
        if(e.getSource()==w[6])
        {
            w[6] = new Button(Character.toString(XO.s1));
            w[6].setBounds(0,520,210,210);
            w[6].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[6] = XO.s1;
            w4();
        }
        if(e.getSource()==w[7])
        {
            w[7] = new Button(Character.toString(XO.s1));
            w[7].setBounds(210,520,210,210);
            w[7].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[7] = XO.s1;
            w4();
        }
        if(e.getSource()==w[8])
        {
            w[8] = new Button(Character.toString(XO.s1));
            w[8].setBounds(420,520,210,210);
            w[8].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            s[8] = XO.s1;
            w4();
        }                               
        for(int k = 0;k<9;k++)
        f.add(w[k]);
        f.dispose();
        second.main();
    }
    public void remove()
    {
        for(int k = 0;k<9;k++)
        f.remove(w[k]);
    }
    public void w4()
    {
        w[4] = new Button(Character.toString(XO.s2));
        w[4].setBounds(210,310,210,210);
        w[4].setFont(new java.awt.Font("w",Font.BOLD,95));        
        s[4] = XO.s2;
    }
    public static void main()
    {
        new ustart();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(650,750);
    }
}
