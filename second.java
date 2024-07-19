import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Second implements ActionListener
{
    static Frame f = new Frame("Tic Tac Toe");
    static Button w[] = new Button[9];
    Button d;
    Label b;    
    
    Second()    
    {
        f.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        });  
        b = new Label("         Tic   Tac   Toe");
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.setFont(new java.awt.Font("w",Font.ITALIC+Font.BOLD,55));
        b.setBounds(0,0,650,100);
        f.add(b);
                        
        w[0] = new Button(Character.toString(Start.s[0]));
        w[0].setBounds(0,100,210,210);
        w[0].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[0]);
        w[1] = new Button(Character.toString(Start.s[1]));
        w[1].setBounds(210,100,210,210);
        w[1].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[1]);
        w[2] = new Button(Character.toString(Start.s[2]));
        w[2].setBounds(420,100,210,210);
        w[2].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[2]);
        w[3] = new Button(Character.toString(Start.s[3]));
        w[3].setBounds(0,310,210,210);
        w[3].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[3]);   
        w[4] = new Button(Character.toString(Start.s[4]));
        w[4].setBounds(210,310,210,210);
        w[4].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[4]);
        w[5] = new Button(Character.toString(Start.s[5]));
        w[5].setBounds(420,310,210,210);
        w[5].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[5]);
        w[6] = new Button(Character.toString(Start.s[6]));
        w[6].setBounds(0,520,210,210);
        w[6].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[6]);
        w[7] = new Button(Character.toString(Start.s[7]));
        w[7].setBounds(210,520,210,210);
        w[7].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[7]);
        w[8] = new Button(Character.toString(Start.s[8]));
        w[8].setBounds(420,520,210,210);
        w[8].setFont(new java.awt.Font("w",Font.BOLD,95));
        f.add(w[8]);        
        for(int i = 0;i<9;i++)
        {
            w[i].addActionListener(this);     
        }
        
        d = new Button();
        f.add(d);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==w[0])
        {                 
            remove();
            w[0] = new Button(Character.toString(XO.s1));
            w[0].setBounds(0,100,210,210);
            w[0].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[0] = XO.s1;            
            if(Start.s[4]==XO.s1&&Start.s[8]=='\u0000')
            w8();
            else if(Start.s[1]==XO.s1&&Start.s[8]=='\u0000')
            w2();
            else if(Start.s[2]==XO.s1&&Start.s[8]=='\u0000')
            w1();
            else if(Start.s[3]==XO.s1&&Start.s[6]=='\u0000')
            w6();
            else if(Start.s[6]==XO.s1&&Start.s[3]=='\u0000')
            w3();
            else if(Start.s[5]==XO.s1&&Start.s[7]=='\u0000')
            w7(); 
            else if(Start.s[7]==XO.s1&&Start.s[5]=='\u0000')
            w5();
            
        }
        if(e.getSource()==w[1])
        {
            remove();
            w[1] = new Button(Character.toString(XO.s1));
            w[1].setBounds(210,100,210,210);
            w[1].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[1] = XO.s1;
            if(Start.s[4]==XO.s1)
            w7();            
            else if(Start.s[0]==XO.s1)
            w2();
            else if(Start.s[2]==XO.s1)
            w0();
            else if(Start.s[7]==XO.s1)
            {
                if(Start.s[2]=='\u0000')
                w2();
                else
                w0();
            }
            else if(Start.s[6]==XO.s1&&Start.s[8]=='\u0000')
            w8();
            else if(Start.s[8]==XO.s1&&Start.s[6]=='\u0000')
            w6();
            else if(Start.s[3]==XO.s1&&Start.s[5]=='\u0000')
            {
                if(Start.s[4]==Start.s[6])
                w2();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
            else if(Start.s[3]=='\u0000'&&Start.s[5]==XO.s1)
            {
                if(Start.s[4]==Start.s[6])
                w2();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
            else if(Start.s[3]==Start.s[5])
            {
                if(Start.s[4]==Start.s[6])
                w2();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
        }          
        if(e.getSource()==w[2])
        {
            remove();
            w[2] = new Button(Character.toString(XO.s1));
            w[2].setBounds(420,100,210,210);
            w[2].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[2] = XO.s1;
            if(Start.s[4]==XO.s1)
            w6();
            else if(Start.s[0]==XO.s1)
            w1();
            else if(Start.s[1]==XO.s1)
            w0();
            else if(Start.s[5]==XO.s1)
            w8();
            else if(Start.s[8]==XO.s1)
            w5();  
            else if(Start.s[3]==XO.s1)
            w7(); 
            else if(Start.s[7]==XO.s1)
            w3();
        }
        if(e.getSource()==w[3])
        {
            remove();
            w[3] = new Button(Character.toString(XO.s1));
            w[3].setBounds(0,310,210,210);
            w[3].setFont(new java.awt.Font("w",Font.BOLD,95));                          
            Start.s[3] = XO.s1; 
            if(Start.s[4]==XO.s1)
            w5();                        
            else if(Start.s[0]==XO.s1)
            w6();
            else if(Start.s[6]==XO.s1)
            w0();
            else if(Start.s[5]==XO.s1)
            {
                if(Start.s[0]=='\u0000')
                w0();
                else
                w6();
            }
            else if(Start.s[2]==XO.s1&&Start.s[8]=='\u0000')
            w8(); 
            else if(Start.s[8]==XO.s1&&Start.s[2]=='\u0000')
            w2();
            else if(Start.s[1]==XO.s1&&Start.s[7]=='\u0000')
            {
                if(Start.s[4]==Start.s[2])
                w6();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
            else if(Start.s[1]=='\u0000'&&Start.s[7]==XO.s1)
            {
                if(Start.s[4]==Start.s[2])
                w6();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
            else if(Start.s[1]==Start.s[7])
            {
                if(Start.s[4]==Start.s[2])
                w6();
                else if(Start.s[4]==Start.s[8])
                w0();
                else
                w0();
            }
        }
        if(e.getSource()==w[5])
        {
            remove();
            w[5] = new Button(Character.toString(XO.s1));
            w[5].setBounds(420,310,210,210);
            w[5].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[5] = XO.s1;
            if(Start.s[4]==XO.s1)
            w3();
            else if(Start.s[2]==XO.s1)
            w8();
            else if(Start.s[8]==XO.s1)
            w2();
            else if(Start.s[3]==XO.s1)
            {
                if(Start.s[2]=='\u0000')
                w2();
                else
                w8();
            }
            else if(Start.s[0]==XO.s1&&Start.s[6]=='\u0000')
            w6(); 
            else if(Start.s[6]==XO.s1&&Start.s[0]=='\u0000')
            w0();
            else if(Start.s[1]==XO.s1&&Start.s[7]=='\u0000')
            {
                if(Start.s[0]==Start.s[4])
                w8();
                else if(Start.s[4]==Start.s[6])
                w2();
                else
                w8();
            }
            else if(Start.s[1]=='\u0000'&&Start.s[7]==XO.s1)
            {
                if(Start.s[0]==Start.s[4])
                w8();
                else if(Start.s[4]==Start.s[6])
                w2();
                else
                w8();
            }
            else if(Start.s[1]==Start.s[7])
            {
                if(Start.s[0]==Start.s[6])
                w8();
                else if(Start.s[4]==Start.s[8])
                w2();
                else
                w8();
            }
        }
        if(e.getSource()==w[6])
        {
            remove();
            w[6] = new Button(Character.toString(XO.s1));
            w[6].setBounds(0,520,210,210);
            w[6].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[6] = XO.s1;
            if(Start.s[4]==XO.s1)
            w2();
            else if(Start.s[0]==XO.s1)
            w3();
            else if(Start.s[3]==XO.s1)
            w0();
            else if(Start.s[7]==XO.s1)
            w8();
            else if(Start.s[8]==XO.s1)
            w7();  
            else if(Start.s[5]==XO.s1)
            w1(); 
            else if(Start.s[1]==XO.s1)
            w5();
        }
        if(e.getSource()==w[7])
        {
            remove();
            w[7] = new Button(Character.toString(XO.s1));
            w[7].setBounds(210,520,210,210);
            w[7].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[7] = XO.s1;
            if(Start.s[4]==XO.s1)
            w1();
            else if(Start.s[8]==XO.s1)
            w6();
            else if(Start.s[6]==XO.s1)
            w8();
            else if(Start.s[1]==XO.s1)
            {
                if(Start.s[6]=='\u0000')
                w6();
                else
                w8();
            }
            else if(Start.s[2]==XO.s1&&Start.s[0]=='\u0000')
            w0();
            else if(Start.s[2]=='\u0000'&&Start.s[0]==XO.s1)
            w2();
            else if(Start.s[5]==XO.s1&&Start.s[3]=='\u0000')
            {
                if(Start.s[4]==Start.s[2])
                w6();
                else if(Start.s[4]==Start.s[0])
                w8();
                else
                w6();
            }
            else if(Start.s[5]=='\u0000'&&Start.s[3]==XO.s1)
            {
                if(Start.s[4]==Start.s[2])
                w6();
                else if(Start.s[4]==Start.s[0])
                w8();
                else
                w6();
            }
            else if(Start.s[3]==Start.s[5])
            {
                if(Start.s[4]==Start.s[6])
                w6();
                else if(Start.s[4]==Start.s[8])
                w8();
                else
                w6();
            }
        }     
        if(e.getSource()==w[8])
        {
            remove();
            w[8] = new Button(Character.toString(XO.s1));
            w[8].setBounds(420,520,210,210);
            w[8].setFont(new java.awt.Font("w",Font.BOLD,95));                        
            Start.s[8] = XO.s1;
            if(Start.s[4]==XO.s1)
            w0();
            else if(Start.s[5]==XO.s1)
            w2();
            else if(Start.s[2]==XO.s1)
            w5();
            else if(Start.s[7]==XO.s1)
            w6();
            else if(Start.s[6]==XO.s1)
            w7();
            else if(Start.s[1]==XO.s1)
            w3(); 
            else if(Start.s[3]==XO.s1)
            w1();            
        }                
        for(int k = 0;k<9;k++)
            f.add(w[k]);
        
        if((Start.s[0]==Start.s[3]&&Start.s[3]==Start.s[6])&&(Start.s[0]!='\u0000')&&(Start.s[3]!='\u0000')&&(Start.s[6]!='\u0000'))
        Win.main();
        if((Start.s[1]==Start.s[4]&&Start.s[4]==Start.s[7]&&(Start.s[1]!='\u0000')&&(Start.s[4]!='\u0000')&&(Start.s[7]!='\u0000')))
        Win.main();
        if((Start.s[2]==Start.s[5]&&Start.s[5]==Start.s[8]&&(Start.s[2]!='\u0000')&&(Start.s[5]!='\u0000')&&(Start.s[8]!='\u0000')))
        Win.main();
        if((Start.s[0]==Start.s[1]&&Start.s[1]==Start.s[2]&&(Start.s[0]!='\u0000')&&(Start.s[1]!='\u0000')&&(Start.s[2]!='\u0000')))
        Win.main();
        if((Start.s[3]==Start.s[4]&&Start.s[4]==Start.s[5]&&(Start.s[3]!='\u0000')&&(Start.s[4]!='\u0000')&&(Start.s[5]!='\u0000')))
        Win.main();
        if((Start.s[6]==Start.s[7]&&Start.s[7]==Start.s[8]&&(Start.s[6]!='\u0000')&&(Start.s[7]!='\u0000')&&(Start.s[8]!='\u0000')))
        Win.main();
        if((Start.s[0]==Start.s[4]&&Start.s[4]==Start.s[8]&&(Start.s[0]!='\u0000')&&(Start.s[4]!='\u0000')&&(Start.s[8]!='\u0000')))
        Win.main();
        if((Start.s[2]==Start.s[4]&&Start.s[4]==Start.s[6]&&(Start.s[2]!='\u0000')&&(Start.s[4]!='\u0000')&&(Start.s[6]!='\u0000')))
        Win.main();
        
        if((Start.s[0]==Start.s[2]&&Start.s[2]==Start.s[7])&&(Start.s[0]!='\u0000')&&(Start.s[2]!='\u0000')&&(Start.s[7]!='\u0000'))
        Tie.main();
        else if((Start.s[2]==Start.s[8]&&Start.s[8]==Start.s[3])&&(Start.s[2]!='\u0000')&&(Start.s[8]!='\u0000')&&(Start.s[3]!='\u0000'))
        Tie.main();
        else if((Start.s[8]==Start.s[6]&&Start.s[6]==Start.s[1])&&(Start.s[8]!='\u0000')&&(Start.s[6]!='\u0000')&&(Start.s[1]!='\u0000'))
        Tie.main();
        else if((Start.s[6]==Start.s[0]&&Start.s[0]==Start.s[5])&&(Start.s[0]!='\u0000')&&(Start.s[6]!='\u0000')&&(Start.s[5]!='\u0000'))        
        Tie.main();
                
        }
        
    public void w0()
    {
        w[0] = new Button(Character.toString(XO.s2));
        w[0].setBounds(0,100,210,210);
        w[0].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[0] = XO.s2;
    }
    public void w1()
    {
        w[1] = new Button(Character.toString(XO.s2));
        w[1].setBounds(210,100,210,210);
        w[1].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[1] = XO.s2; 
    }
    public void w2()
    {
        w[2] = new Button(Character.toString(XO.s2));
        w[2].setBounds(420,100,210,210);
        w[2].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[2] = XO.s2;
    }
    public void w3()
    {
        w[3] = new Button(Character.toString(XO.s2));
        w[3].setBounds(0,310,210,210);
        w[3].setFont(new java.awt.Font("w",Font.BOLD,95));                          
        Start.s[3] = XO.s2; 
    }
    public void w5()
    {
        w[5] = new Button(Character.toString(XO.s2));
        w[5].setBounds(420,310,210,210);
        w[5].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[5] = XO.s2;
    }
    public void w6()
    {
        w[6] = new Button(Character.toString(XO.s2));
        w[6].setBounds(0,520,210,210);
        w[6].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[6] = XO.s2;
    }
    public void w7()
    {
        w[7] = new Button(Character.toString(XO.s2));
        w[7].setBounds(210,520,210,210);
        w[7].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[7] = XO.s2;
    }
    public void w8()
    {
        w[8] = new Button(Character.toString(XO.s2));
        w[8].setBounds(420,520,210,210);
        w[8].setFont(new java.awt.Font("w",Font.BOLD,95));                        
        Start.s[8] = XO.s2;
            }        
        public void remove()
    {
        for(int k = 0;k<9;k++)
        f.remove(w[k]);
    }
        public static void main()
    {
        new Second();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(650,750);
    }
    }